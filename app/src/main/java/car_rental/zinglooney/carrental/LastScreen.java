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

        String cncnt = intent.getStringExtra("CUSTOMER_NAME");
        TextView tv_cn = findViewById(R.id.tv_customer_name);
        tv_cn.setText(cncnt);

        String btnvdcnt = intent.getStringExtra("DATE");
        TextView tv_btnvd = findViewById(R.id.tv_date);
        tv_btnvd.setText(btnvdcnt);

        String btnvtcnt = intent.getStringExtra("TIME");
        TextView tv_btnvt = findViewById(R.id.tv_time);
        tv_btnvt.setText(btnvtcnt);

        String ctcnt = intent.getStringExtra("CAR_TYPE");
        TextView tv_ct = findViewById(R.id.tv_car_type);
        tv_ct.setText(ctcnt);

        String drcnt = intent.getStringExtra("DURATION");
        TextView tv_dr = findViewById(R.id.tv_duration);
        tv_dr.setText(drcnt);

        String lrocnt = intent.getStringExtra("LOCATION_OPTION");
        TextView tv_lro = findViewById(R.id.tv_location_receipt_options);
        tv_lro.setText(lrocnt);

        String rocnt = intent.getStringExtra("RENT_OPTION");
        TextView tv_ro = findViewById(R.id.tv_rent_options);
        tv_ro.setText(rocnt);





    }
}
