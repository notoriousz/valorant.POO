package com.valorant.agent

import com.valorant.agent.Agent

interface Agent {
    companion object {
        const val name: String = "Matheus"
        const val age: Int = 25
    }

}

fun main() {
    val instant = Agent
    println(instant.name)
    println(instant.age)

}