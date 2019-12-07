import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val outputDir = "D:/SteamLibrary/steamapps/common/SlayTheSpire/mods"

plugins {
    kotlin("jvm") version "1.3.50"
}

group = "uno.rebellious"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(fileTree("lib"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.register<Copy>("copyJarToLocation") {
    println("Copy")
    dependsOn("build")
    from("/build/libs")
    into(outputDir)
}
