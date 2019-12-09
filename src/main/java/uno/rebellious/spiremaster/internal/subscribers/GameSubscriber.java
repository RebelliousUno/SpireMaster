package uno.rebellious.spiremaster.internal.subscribers;

import basemod.interfaces.StartGameSubscriber;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import org.apache.logging.log4j.Logger;
import uno.rebellious.spiremaster.SpireMaster;

public class GameSubscriber {
    public void receiveStartGame() {
        AbstractPlayer player = AbstractDungeon.player;
        Logger logger = SpireMaster.getLogger();
        logger.info("Start Game");

        logger.info(String.format("Chosen Character: %s", CardCrawlGame.chosenCharacter.name()));

        logger.info(String.format("Relic List: %s", player.relics.toString()));
        logger.info(String.format("Potion Slots %d/%d", player.potions.size(), player.potionSlots));
        logger.info(String.format("Potion List %s", player.potions.toString()));

        logger.info(String.format("Starting Deck %s", player.getStartingDeck()));
        logger.info(String.format("Draw Pile %s", player.drawPile.getCardNames()));
        logger.info(String.format("Card Count %s", player.getCardCount()));
        logger.info(String.format("Card List %s", player.masterDeck.getCardNames()));
    }
}
