package com.valorant.arsenal

class SubMachineGunBuilder(
    override val name: String,
    override val description: String
) : Arsenal {

    override val numberOfProjectiles: Int = 20

    override val damage: Int = 60

    override val weight: String = "medium heavy"

    override val recoil: Double = 0.5

    override val size: Double = 50.0

    override val precision: Double = 0.5

    override fun zoomScope(hasScope: Boolean): String = "This gun does not have scope"

}
