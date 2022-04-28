package com.valorant.agents

import java.time.LocalDateTime

class InitiatorAgentBuilder(
    // constructor
    override val nameOfAgent: String,
    override val agentFunction: String,
    override val biography: String,
    override var currentGun: String
) : Agent {

    // default properties
    private val agentHeight: Double = Agent.height
    private val agentHealth: Double = Agent.health
    private val numberOfSkills: Int = Agent.numberOfSkills

    override val createdAt: LocalDateTime = LocalDateTime.now()

}