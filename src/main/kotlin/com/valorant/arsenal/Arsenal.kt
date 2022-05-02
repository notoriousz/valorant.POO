package com.valorant.arsenal

interface Arsenal {

    val name: String

    val hasScope: Boolean

    val size: Float

    val description: String

    val numberOfProjectiles: Int

    val damage: Int

    val precision: Int

    val recoil: Double

    val weight: String

    fun zoomScope() {
        when (hasScope) {
            true -> println("Open Scope")
            else -> println("This gun does not have scope")
        }
    }

    fun closeZoomScope() {
        println("Close Scope")
    }
}
