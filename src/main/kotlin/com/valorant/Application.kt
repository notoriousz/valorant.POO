package com.valorant

import com.valorant.arsenal.*
import com.valorant.agents.*

class Application {

    companion object {

        // guns
        val glock = LightGunBuilder("Glock", "").name
        val odin = MachineGunBuilder("Odin", "").name
        val operator = PrecisionRifleBuilder("Operator", "").name
        val phantom = RifleBuilder("Phantom", "").name
        val judge = ShotGunBuilder("Judge", "").name
        val spectre = SubMachineGunBuilder("Spectre", "").name
        val knife = TacticalKnifeBuilder("Knife", "", "heavy").name

        // build arsenal
        val myArsenal = mutableListOf<String>(
            glock,
            odin,
            operator,
            phantom,
            judge,
            spectre,
            knife
        )

        // agents
        val omen = ControllerAgentBuilder(
            "Omen",
            "Controller",
            "",
            myArsenal
        )

        val reyna = DuelistAgentBuilder(
            "Reyna",
            "Duelist",
            "",
            myArsenal
        )

        val sova = InitiatorAgentBuilder(
            "Sova",
            "Initiator",
            "",
            myArsenal
        )

        val cypher = SentinelAgentBuilder(
            "Cypher",
            "Sentinel",
            "",
            myArsenal
        )


        @JvmStatic
        fun main(args: Array<String>) {
            println(cypher)
            println(sova)
            println(reyna)
            println(omen)
        }
    }

}
