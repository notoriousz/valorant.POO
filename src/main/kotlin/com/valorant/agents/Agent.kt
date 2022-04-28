package com.valorant.agents

import com.valorant.arsenal.Arsenal
import java.util.Date

interface Agent {

    val nameOfAgent: String

    val agentFunction: String

    val createdAt: Date

    val biography: String

    var currentGun: Arsenal

    companion object {

        // default properties to inheritance
        const val size: Double = 1.85
        const val health: Double = 100.0
        const val numberOfSkills: Int = 4

    }

    // default methods to inheritance
    fun shoot(): String {
        return "pull the trigger"
    }

    fun cut(): String {
        return "cutting"
    }

    fun walk(): String {
        return "walking"
    }

    fun run(): String {
        return "running"
    }

    fun toSit(): String {
        return "sitting"
    }

    fun jump(): String {
        return "jumping"
    }

    fun reloadGun(): String {
        return "reloading"
    }

    // polymorphism
    fun executeSkillOne() {}

    fun executeSkillTwo() {}

    fun executeSkillThree() {}

    fun executeSkillUltimate() {}

}