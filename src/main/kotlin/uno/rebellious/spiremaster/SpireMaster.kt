package uno.rebellious.spiremaster

import basemod.BaseMod
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer
import org.apache.logging.log4j.LogManager
import uno.rebellious.spiremaster.subscribers.DungeonSubscriber
import uno.rebellious.spiremaster.subscribers.GameSubscriber
import uno.rebellious.spiremaster.subscribers.PlayerSubscriber
import uno.rebellious.spiremaster.subscribers.RelicSubscriber

@SpireInitializer
class SpireMaster {

    init {
        logger.info("Initialising Spire Master")
        BaseMod.subscribe(RelicSubscriber())
        BaseMod.subscribe(GameSubscriber())
        BaseMod.subscribe(DungeonSubscriber())
        BaseMod.subscribe(PlayerSubscriber())
    }

    companion object {
        @JvmStatic
        val logger = LogManager.getLogger(SpireMaster::class.java.name)

        @JvmStatic
        fun initialize() {
            logger.info("Initialize Called")
            SpireMaster()
        }
    }

}