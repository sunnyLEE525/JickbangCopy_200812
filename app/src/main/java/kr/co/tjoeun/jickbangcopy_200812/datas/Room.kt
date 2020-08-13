package kr.co.tjoeun.jickbangcopy_200812.datas

import java.io.Serializable
import java.text.NumberFormat

class Room(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String
) : Serializable {

    fun getFormattedPrice() : String {

        if (this.price >= 10000) {

            val hm = this.price / 10000
            val thousand = this.price % 10000
            val thousandStr = NumberFormat.getNumberInstance().format(thousand)

            return "${hm}억 ${thousandStr}"

        }
        else {
            return NumberFormat.getNumberInstance().format(this.price)
        }

    }

    fun getFormattedFloor() : String {

        val floorStr : String

        if (this.floor >= 1) {
            floorStr = "${this.floor}층"
        } else if (this.floor == 0) {
            floorStr = "반지하"
        } else {
            floorStr = "지하 ${-this.floor}층"
        }

        return floorStr

    }

}

