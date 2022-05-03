package com.valorant.arsenal


class TacticalKnifeBuilder(
    val name: String,
    val description: String,
    val weight: String
) {

    val size: Double
        get() = 50.0

    val damage: Int
        get() = 150

    val precision: Double
        get() = 1.0
}
