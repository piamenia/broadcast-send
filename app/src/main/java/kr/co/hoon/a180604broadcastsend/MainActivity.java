package kr.co.hoon.a180604broadcastsend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                // BroadCastIntent 만들기
                Intent intent = new Intent();
                // 구분하기위한 문자열
                intent.setAction("방송!");
                // 앱이 실행된 적이 없더라도 방송을 송신하도록 설정
                intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                // 방송 보내기
                sendBroadcast(intent);
            }
        });
    }
}
