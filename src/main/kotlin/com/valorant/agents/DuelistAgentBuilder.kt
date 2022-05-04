package com.valorant.agents

import com.valorant.arsenal.Arsenal
import java.time.LocalDateTime

data class DuelistAgentBuilder(
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
        return "Devour"
    }

    override fun executeSkillTwo(): String {
        return "Dismiss"
    }

    override fun executeSkillThree(): String {
        return "Ravenous Gaze"
    }

    override fun executeSkillUltimate(): String {
        return "Empress"
    }
}
