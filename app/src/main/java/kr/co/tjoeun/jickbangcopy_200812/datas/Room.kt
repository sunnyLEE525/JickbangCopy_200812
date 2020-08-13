package kr.co.tjoeun.jickbangcopy_200812.datas

import java.io.Serializable

class Room(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String
) : Serializable {
}