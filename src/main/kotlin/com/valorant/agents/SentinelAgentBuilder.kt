package com.valorant.agents

import com.valorant.arsenal.Arsenal
import java.time.LocalDateTime

class SentinelAgentBuilder(
    override val nameOfAgent: String,
    override val agentRole: String,
    override val createdAt: LocalDateTime,
    override val biography: String,
    override var currentGun: Arsenal
) : Agent {

    // default properties
    private val agentHeight: Double = Agent.height
    private val agentHealth: Double = Agent.health
    private val numberOfSkills: Int = Agent.numberOfSkills

    override fun executeSkillOne(): String {
        return "Cyber Cage"
    }

    override fun executeSkillTwo(): String {
        return "Surveillance Camera"
    }

    override fun executeSkillThree(): String {
        return "Wire Trap"
    }

    override fun executeSkillUltimate(): String {
        return "Neural Assault"
    }
}
