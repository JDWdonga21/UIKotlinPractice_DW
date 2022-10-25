package com.kuderitest.uikotlinpractice_dw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //확인버튼 클릭시 이벤트
        okBtn.setOnClickListener {
//            입력된 내용 확인 : contentEdt의 입력된 값 조회(get) 변수에 저장하기
            val textContent = contentEdt.text.toString()
//            저장된 값 입력 받음 : 텍스트뷰의 내용으로 반영 (set)
            resultTxt.text = textContent
        }
    }

}