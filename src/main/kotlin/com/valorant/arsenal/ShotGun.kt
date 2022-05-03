package com.valorant.arsenal

class ShotGun(
    override val name: String,
    override val description: String
) : Arsenal {

    override val numberOfProjectiles: Int = 40

    override val damage: Int = 150

    override val weight: String = "heavy"

    override val recoil: Double = 0.7

    override val size: Double = 75.0

    override val precision: Double = 0.6

}
