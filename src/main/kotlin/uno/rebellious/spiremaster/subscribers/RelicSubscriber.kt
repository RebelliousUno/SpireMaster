package uno.rebellious.spiremaster.subscribers

import basemod.interfaces.PostCreateStartingRelicsSubscriber
import basemod.interfaces.RelicGetSubscriber
import com.megacrit.cardcrawl.characters.AbstractPlayer
import com.megacrit.cardcrawl.helpers.RelicLibrary
import com.megacrit.cardcrawl.relics.AbstractRelic
import uno.rebellious.spiremaster.SpireMaster
import java.util.ArrayList

class RelicSubscriber: RelicGetSubscriber, PostCreateStartingRelicsSubscriber {

    override fun receivePostCreateStartingRelics(chosenClass: AbstractPlayer.PlayerClass?, addRelicsToMe: ArrayList<String>?) {
        addRelicsToMe?.forEach {
            val relic = RelicLibrary.getRelic(it)
            SpireMaster.logger.info("Relic ${relic.name}: ${relic.description}")
        }
    }

    override fun receiveRelicGet(relic: AbstractRelic?) {
        SpireMaster.logger.info("Got Relic ${relic?.name}")
        SpireMaster.logger.info("Got Relic ${relic?.description}" )
        SpireMaster.logger.info("Got Relic ${relic?.counter}")
    }
}