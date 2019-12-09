package uno.rebellious.spiremaster.subscribers

import basemod.interfaces.PostDungeonInitializeSubscriber
import com.megacrit.cardcrawl.dungeons.AbstractDungeon
import uno.rebellious.spiremaster.SpireMaster

class DungeonSubscriber: PostDungeonInitializeSubscriber {
    override fun receivePostDungeonInitialize() {
        SpireMaster.logger.info("Post Dungeon Init")
        SpireMaster.logger.info("${AbstractDungeon.player.toString()}")
    }
}