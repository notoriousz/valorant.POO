package com.valorant.arsenal

class MachineGunBuilder(
    override val name: String,
    override val description: String
) : Arsenal {

    override val numberOfProjectiles: Int = 30

    override val damage: Int = 150

    override val weight: String = "heavy"

    override val recoil: Double = 0.8

    override val size: Double = 70.0

    override val precision: Double = 0.9

}
