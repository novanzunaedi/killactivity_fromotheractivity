package id.co.killactivityfrom.otheractivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Activity_dua extends AppCompatActivity {
    private Button btn_01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_dua);

        btn_01 = (Button) findViewById(R.id.btn_01);
        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.getInstance().finish();
                startActivity(new Intent(Activity_dua.this, Activity_tiga.class));


            }
        });

    }

}
