package com.valorant.agents

import com.valorant.arsenal.Arsenal
import java.time.LocalDateTime

class InitiatorAgentBuilder(
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
        return "Shock Arrow"
    }

    override fun executeSkillTwo(): String {
        return "Tracking Arrow"
    }

    override fun executeSkillThree(): String {
        return "Drone Owl"
    }

    override fun executeSkillUltimate(): String {
        return "hunter's fury"
    }

}
