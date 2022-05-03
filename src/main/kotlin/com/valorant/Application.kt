package com.valorant

import com.valorant.arsenal.LightGun
import com.valorant.arsenal.SubMachineGunBuilder

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val test1 = SubMachineGunBuilder("oi", "oi").zoomScope()
            println(test1)
        }
    }
}