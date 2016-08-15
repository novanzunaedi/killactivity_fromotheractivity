package id.co.killactivityfrom.otheractivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_01;
    static MainActivity mainactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainactivity = this;

        btn_01 = (Button) findViewById(R.id.btn_01);
        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Activity_dua.class));
            }
        });

    }

    public static MainActivity getInstance(){
        return  mainactivity;
    }
}
