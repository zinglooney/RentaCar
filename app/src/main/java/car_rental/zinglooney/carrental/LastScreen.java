package car_rental.zinglooney.carrental;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LastScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastscreen);

        Intent intent = getIntent();

        String message = intent.getStringExtra("EXTRA_MESSAGE");
        TextView tv_cn = findViewById(R.id.tv_customer_name);
        tv_cn.setText(message);

     }
}
