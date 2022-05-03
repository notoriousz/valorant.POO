package com.valorant.arsenal

class RifleBuilder(
    override val name: String,
    override val description: String
) : Arsenal {

    override val numberOfProjectiles: Int = 12

    override val damage: Int = 250

    override val weight: String = "heavy"

    override val recoil: Double = 0.9

    override val size: Double = 99.0

    override val precision: Double = 1.0

}
