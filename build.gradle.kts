import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val outputDir = "D:/SteamLibrary/steamapps/common/SlayTheSpire/mods"

plugins {
    kotlin("jvm") version "1.3.50"
    java
}

group = "uno.rebellious"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.squareup.okhttp3:okhttp:4.4.0")
    implementation(fileTree("lib"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.register<Copy>("copyJarToLocation") {
    println("Copy")
    dependsOn("fatJar")
    from(file("/build/libs/SpireMaster-fat-$version.jar"))
    into(outputDir)
}

tasks.register<Jar>("fatJar") {
   baseName = "${project.name}-fat"
    dependsOn("build")
    from(configurations.runtimeClasspath.get()
        .filter {it.name.toLowerCase() !in arrayOf("BaseMod.jar", "desktop-1.0.jar", "ModTheSpire.jar")
            .map {it.toLowerCase()}
        }.map { if (it.isDirectory) it else zipTree(it) })
    with(tasks.jar.get() as CopySpec)

}