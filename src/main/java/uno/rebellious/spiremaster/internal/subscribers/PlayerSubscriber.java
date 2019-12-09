package uno.rebellious.spiremaster.internal.subscribers;

import com.megacrit.cardcrawl.cards.CardSave;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class PlayerSubscriber {
    @Nullable
    public ArrayList<CardSave> getDeckList() {
        return AbstractDungeon.player.masterDeck.getCardDeck();
//        for (CardSave card : deckList) {
//            String cardName = CardLibrary.getCardNameFromMetricID(card.id);
//            AbstractCard cardAbs = CardLibrary.getCard(cardName);
//            Logger logger = SpireMaster.getLogger();
//            logger.info(cardAbs.rawDescription);
//        }
    }
    public void getDrawPile() {

    }
    public void getDiscardPile() {

    }
    public void getExhaustPile() {

    }
    public void getHand() {

    }
}
