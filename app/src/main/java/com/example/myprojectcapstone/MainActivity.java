package com.example.myprojectcapstone;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //기기 화면에 표시되는 것을 나타내는 정의
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // res/layout/activity_main.xml을 호출
        //activity_main.xml layout에 설정된 뷰들을 가져옴
        Button picture_button = (Button) findViewById(R.id.picture_button);
        Button manage_button = (Button) findViewById(R.id.manage_button);

        //명함 인식 버튼
        //버튼을 누르면 CameraActivity로 intent함
        picture_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CameraActivity.class);
                startActivity(intent);
            }
        });
        //명함 관리 버튼
        //버튼을 누르면 ManageActivity로 intent함
        manage_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ManageActivity.class);
                startActivity(intent);
            }
        });
    }

}