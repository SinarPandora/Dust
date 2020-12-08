package org.lartifa.dust.qq

import net.mamoe.mirai.Bot
import net.mamoe.mirai.alsoLogin
import net.mamoe.mirai.event.subscribeAlways
import net.mamoe.mirai.event.subscribeOnce
import net.mamoe.mirai.join
import net.mamoe.mirai.message.FriendMessageEvent
import net.mamoe.mirai.message.data.content


/**
 * Author: sinar
 * 2020/8/10 19:14
 */
suspend fun main() {
    val bot = Bot(1L, "***") {
        this.fileBasedDeviceInfo("./device.json")
    }.alsoLogin()

    bot.subscribeAlways<FriendMessageEvent> {
        println(Thread.currentThread().name)
        when (it.message.content) {
            "测试" -> bot.subscribeOnce<FriendMessageEvent> { event ->
                if (event.message.content == "hello") {
                    event.reply("World!")
                }
            }
        }
    }


    bot.join()
}
