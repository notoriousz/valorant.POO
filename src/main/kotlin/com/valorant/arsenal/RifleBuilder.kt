package com.valorant.arsenal

class RifleBuilder(
    override val name: String,
    override val description: String
) : Arsenal {

    override val numberOfProjectiles: Int = 24

    override val damage: Int = 100

    override val weight: String = "heavy"

    override val recoil: Double = 0.9

    override val size: Double = 99.0

    override val precision: Double = 1.0

}
