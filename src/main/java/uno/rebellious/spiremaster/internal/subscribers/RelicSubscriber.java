package uno.rebellious.spiremaster.internal.subscribers;

import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.relics.AbstractRelic;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class RelicSubscriber {
    @Nullable
    public ArrayList<AbstractRelic> getRelicList() {
        return AbstractDungeon.player.relics;
    }

}
