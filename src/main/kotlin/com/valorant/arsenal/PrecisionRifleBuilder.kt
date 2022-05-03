package com.valorant.arsenal

class PrecisionRifleBuilder(
    override val name: String,
    override val description: String
) : Arsenal {

    override val numberOfProjectiles: Int = 12

    override val damage: Int = 300

    override val weight: String = "heavy"

    override val recoil: Double = 1.0

    override val size: Double = 100.0

    override val precision: Double = 1.0

}
