package kr.co.tjoeun.jickbangcopy_200812

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.jickbangcopy_200812.adapters.RoomAdapter
import kr.co.tjoeun.jickbangcopy_200812.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mRoomAdapter: RoomAdapter

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
//        방 목록을 강제로 추가하는 코드

        mRoomList.add(Room(8500, "서울시 은평구", 5, "은평구의 5층 방 입니다."))
        mRoomList.add(Room(78000, "서울시 은평구", 3, "은평구의 3층 방 입니다."))
        mRoomList.add(Room(2400, "서울시 은평구", 0, "은평구의 반지하 방 입니다."))
        mRoomList.add(Room(23000, "서울시 서대문구", -1, "서대문구의 지하1층 방 입니다."))
        mRoomList.add(Room(175000, "서울시 서대문구", 4, "서대문구의 4층 방 입니다."))
        mRoomList.add(Room(55000, "서울시 서대문구", 7, "서대문구의 7층 방 입니다."))
        mRoomList.add(Room(9600, "서울시 동대문구", 0, "동대문구의 반지하 방 입니다."))
        mRoomList.add(Room(38000, "서울시 동대문구", 2, "동대문구의 2층 방 입니다."))
        mRoomList.add(Room(57000, "서울시 동대문구", -2, "동대문구의 지하2층 방 입니다."))
        mRoomList.add(Room(85000, "서울시 동대문구", 5, "동대문구의 5층 방 입니다."))

//        초기화를 미뤄둔 어댑터를 실제로 초기화하자
        mRoomAdapter = RoomAdapter(mContext, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter

    }


}