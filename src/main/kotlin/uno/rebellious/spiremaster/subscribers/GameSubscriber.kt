package uno.rebellious.spiremaster.subscribers

import basemod.interfaces.StartGameSubscriber
import uno.rebellious.spiremaster.internal.subscribers.GameSubscriber as InternalGameSubscriber


class GameSubscriber: StartGameSubscriber {
    val javaGameSubscriber = InternalGameSubscriber()
    override fun receiveStartGame() {
        javaGameSubscriber.receiveStartGame()
    }
}