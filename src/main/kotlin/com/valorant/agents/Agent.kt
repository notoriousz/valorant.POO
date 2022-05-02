package com.valorant.agents

import com.valorant.arsenal.Arsenal
import java.time.LocalDateTime

interface Agent {

    val nameOfAgent: String

    val agentRole: String

    val createdAt: LocalDateTime

    val biography: String

    var currentGun: MutableList<Arsenal>

    companion object {

        // default properties
        const val height: Double = 1.85
        const val health: Double = 100.0
        const val numberOfSkills: Int = 4

    }

    // default methods
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
    fun executeSkillOne(): String

    fun executeSkillTwo(): String

    fun executeSkillThree(): String

    fun executeSkillUltimate(): String

}
