package com.valorant.arsenal

interface Arsenal {

    val name: String
    val description: String
    val size: Double
    val damage: Int
    val precision: Double
    val hasScope: Boolean
    val weight: String
    val recoil: Double
    val numberOfProjectiles: Int


    fun zoomScope(hasScope: Boolean) = when(hasScope) {
            true -> println("Open Scope")
            else -> println("This gun does not have scope")
        }

    fun closeZoomScope() {
        println("Close Scope")
    }
}
