package kr.co.tjoeun.jickbangcopy_200812.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.tjoeun.jickbangcopy_200812.R
import kr.co.tjoeun.jickbangcopy_200812.datas.Room
import java.text.NumberFormat
import java.util.*

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: List<Room>
) : ArrayAdapter<Room>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val descTxt = row.findViewById<TextView>(R.id.descTxt)
        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)

        val data = mList[position]

        descTxt.text = data.description

        priceTxt.text = data.getFormattedPrice()

//        층수 >= 1 : 2층, 5층 등
//        층수 == 0 : 반지하
//        그외 : 지하2층, 지하1층 등

        var floorStr: String

        if (data.floor >= 1) {
            floorStr = "${data.floor}층"
        } else if (data.floor == 0) {
            floorStr = "반지하"
        } else {
            floorStr = "지하 ${-data.floor}층"
        }



        addressAndFloorTxt.text = "${data.address},${floorStr}"

        return row
    }
}





















