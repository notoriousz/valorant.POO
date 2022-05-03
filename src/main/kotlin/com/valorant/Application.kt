package com.valorant

import com.valorant.arsenal.LightGun

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val test1 = LightGun("oi", "oi").zoomScope()
            println(test1)
        }
    }
}