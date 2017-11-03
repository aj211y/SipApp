package app.sip.monmon.sipapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_config = (Button)findViewById(R.id.config);
        btn_config.setOnClickListener(configListener);
    }

    private Button.OnClickListener configListener = new Button.OnClickListener(){

        @Override
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,ConfigActivity.class);
            startActivity(intent);
        }
    };
}
