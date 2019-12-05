package uno.rebellious.spiremaster

import basemod.BaseMod
import basemod.interfaces.PostUpdateSubscriber
import basemod.interfaces.RelicGetSubscriber
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer
import com.megacrit.cardcrawl.relics.AbstractRelic
import org.apache.logging.log4j.LogManager

@SpireInitializer
class SpireMaster: RelicGetSubscriber {

    override fun receiveRelicGet(relic: AbstractRelic?) {
        logger.info("Got Relix ${relic?.name}")
    }

    init {
        logger.info("Initialising Spire Master")
        BaseMod.subscribe(this)
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