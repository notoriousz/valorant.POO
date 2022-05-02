package com.valorant.agents

import com.valorant.arsenal.Arsenal
import java.time.LocalDateTime

class ControllerAgentBuilder(
    override val nameOfAgent: String,
    override val agentRole: String,
    override val createdAt: LocalDateTime = LocalDateTime.now(),
    override val biography: String,
    override var currentGun: MutableList<Arsenal>
) : Agent {

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
