package com.example.administrator.qqlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LoginEndActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_end);
        int[] ico=new int[]{R.drawable.qq,R.drawable.ico1,R.drawable.ico2};

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        int index=bundle.getInt("index");
        ImageButton ib= (ImageButton) findViewById(R.id.qq);
        ib.setImageResource(ico[index]);

        ImageButton btn= (ImageButton) findViewById(R.id.m_exit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
