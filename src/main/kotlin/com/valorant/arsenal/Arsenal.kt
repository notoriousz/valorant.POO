package com.valorant.arsenal

interface Arsenal {

    val name: String
    val description: String
    val size: Double
    val damage: Int
    val precision: Double
    val weight: String
    val recoil: Double
    val numberOfProjectiles: Int


    fun zoomScope(hasScope: Boolean = true): String = when(hasScope) {
            true -> "Open Scope"
            else -> "This gun does not have scope"
        }

    fun closeZoomScope() {
        println("Close Scope")
    }
}
