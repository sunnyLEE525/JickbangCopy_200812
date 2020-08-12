package kr.co.tjoeun.jickbangcopy_200812

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.jickbangcopy_200812.adapters.RoomAdapter
import kr.co.tjoeun.jickbangcopy_200812.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()

//    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()
}
    override fun setUpEvents() {
//        메인화면의 이벤트 관련 코드 모아둘 장소
    }

    override fun setValues() {
//        메인 화면의 값 출력 관련 코드 모아둘 장소
    }


}