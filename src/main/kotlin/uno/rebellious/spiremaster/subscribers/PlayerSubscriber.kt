package uno.rebellious.spiremaster.subscribers

import basemod.interfaces.PostPlayerUpdateSubscriber
import com.megacrit.cardcrawl.dungeons.AbstractDungeon
import com.megacrit.cardcrawl.helpers.CardLibrary
import uno.rebellious.spiremaster.SpireMaster
import uno.rebellious.spiremaster.models.SpireMasterRelic
import uno.rebellious.spiremaster.internal.subscribers.PlayerSubscriber as InternalPlayerSubscriber
import uno.rebellious.spiremaster.internal.subscribers.RelicSubscriber as InternalRelicSubscriber

class PlayerSubscriber: PostPlayerUpdateSubscriber {
    val internalPlayerSubscriber = InternalPlayerSubscriber()
    val internalRelicSubscriber = InternalRelicSubscriber()
    override fun receivePostPlayerUpdate() {
        updateRelicList()
        updateDeckList()
    }

    private fun updateDeckList() {
        val playerClass = AbstractDungeon.player.chosenClass
        val deckList = AbstractDungeon.player.masterDeck.cardDeck
        deckList?.forEach {
            SpireMaster.logger.info("ID: ${it.id}")
            val cardName = CardLibrary.getCardNameFromMetricID(it.id)
            SpireMaster.logger.info("Card Name: $cardName")
            SpireMaster.logger.info("Card: ${CardLibrary.getCard(playerClass, it.id)}")
        }
    }

    private fun updateRelicList() {
        val relicList = AbstractDungeon.player.relics

        relicList?.forEach {
            val r = SpireMasterRelic(it.name, it.description, it.counter)
            SpireMaster.logger.info(r.toString())
        }
    }

    private fun updatePotionList() {

    }

}