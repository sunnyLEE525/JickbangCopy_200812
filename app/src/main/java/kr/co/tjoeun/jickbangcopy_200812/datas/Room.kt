package kr.co.tjoeun.jickbangcopy_200812.datas

import java.io.Serializable
import java.text.NumberFormat

//생성자 - Room을 만들때 필수적으로 넣어줘야할 정보 항목들을 명시하자. (가격, 주소, 층수, 설명)
//:Serializable - Room을 통째로 putExtra / getExtra 해주기 위해 필요한 코드
class Room(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String
) : Serializable {

//    가격을 상황별로 가공해서 String으로 주는 기능

    fun getFormattedPrice() : String {

//        1억이 넘는지 아닌지 구별=> 상황별로 다르게 가공된 문장을 리턴(결과로 지정)
        if (this.price >= 10000) {

//            몇억? 만으로 나눈 몫 = 억단위.
            val hm = this.price / 10000
//            나머지 만원단위 => 15400 : 5400? 만으로 나눈 나머지값.
            val thousand = this.price % 10000
//            구해진 만원 단위=> 세자리마다 컴마 찍기.
            val thousandStr = NumberFormat.getNumberInstance().format(thousand)

            return "${hm}억 ${thousandStr}"

        }
        else {
//            7500 => 7,500처럼 세자리마다 ,찍어주는 기능을 활용
            return NumberFormat.getNumberInstance().format(this.price)
        }

    }

//    층수(Int)를 상황별로 가공해서=>String으로 만들어주는 기능

    fun getFormattedFloor() : String {

//        최종 가공 결과가 저장될 변수를 미리 만들자.
        val floorStr : String

        if (this.floor >= 1) {
            floorStr = "${this.floor}층"
        } else if (this.floor == 0) {
            floorStr = "반지하"
        } else {
            floorStr = "지하 ${-this.floor}층"
        }

//        완성된 문구를 => 이 함수의 결과로 지정(return)
        return floorStr

    }

}

