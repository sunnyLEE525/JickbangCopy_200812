package kr.co.tjoeun.jickbangcopy_200812

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kr.co.tjoeun.jickbangcopy_200812.datas.Room

class ViewRoomDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)
        setUpEvents()
        setValues()
    }

    override fun setUpEvents() {

    }

    override fun setValues() {
        
//        메인화면에서 넘겨준 Room 가져오기.
//        넘겨줄 때 Serializable 형태로 넘겨줌 => Room으로 변환해서 저장해야 사용 가능. : as Room

        val room = intent.getSerializableExtra("roomInfo") as Room

//        실제 데이터 화면
        priceTxt.text = room.getFormattedPrice()
        descTxt.text = room.description
        addressTxt.text = room.address
        floorTxt.text = room.getFormattedFloor()
    }
}