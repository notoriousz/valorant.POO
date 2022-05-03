package com.valorant.arsenal

class LightGun(
    override val name: String,
    override val description: String
    ) : Arsenal {

    override val size: Double = 25.0

    override val damage: Int = 50

    override val precision: Double = 0.5

    override val hasScope: Boolean = false

    override val weight: String = "heavy"

    override val recoil: Double = 0.2

    override val numberOfProjectiles: Int = 26




}