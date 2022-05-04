package com.valorant.agents

import com.valorant.arsenal.Arsenal
import com.valorant.arsenal.LightGunBuilder
import java.time.LocalDateTime

data class ControllerAgentBuilder(
    override val nameOfAgent: String,
    override val agentRole: String,
    override val biography: String,
    override var guns: MutableList<String>
) : Agent {

    override val createdAt: LocalDateTime = LocalDateTime.now()

    // default properties
    private val agentHeight: Double = Agent.height
    private val agentHealth: Double = Agent.health
    private val numberOfSkills: Int = Agent.numberOfSkills

    override fun executeSkillOne(): String {
        return "Throw Smoke"
    }

    override fun executeSkillTwo(): String {
        return "Dark Cloak"
    }

    override fun executeSkillThree(): String {
        return "Dark Footsteps"
    }

    override fun executeSkillUltimate(): String {
        return "Shadow Leap"
    }

}
