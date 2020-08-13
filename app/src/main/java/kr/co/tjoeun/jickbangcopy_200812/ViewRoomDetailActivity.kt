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

//        as Room 처럼 데이터 클래스로 캐스팅 해줘야 사용 가능

        val room = intent.getSerializableExtra("roomInfo") as Room

        addressTxt.text = room.address

    }
}