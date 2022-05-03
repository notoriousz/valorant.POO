package com.valorant.arsenal


abstract class TacticalKnifeBuilder(
    override val name: String,
    override val description: String,
    override val weight: String
) : Arsenal {

    override val size: Double
        get() = 50.0

    override val damage: Int
        get() = 150

    override val precision: Double
        get() = 1.0
}
