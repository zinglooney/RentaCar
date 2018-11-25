package car_rental.zinglooney.carrental;

import android.app.DatePickerDialog;
import android.app.ListActivity;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.Calendar;



public class FirstScreen extends ListActivity {

    private TextView lopt;
    private Button btndp;


    private String[] Car_type = {
            "Class A",
            "Class B",
            "Class C",
            "Class D",
            "Class E"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreen);


        lopt = (TextView)findViewById(R.id.listOption);
        setListAdapter(new ArrayAdapter <>(this,android.R.layout.simple_list_item_1, Car_type));

        btndp = findViewById(R.id.btnDatePicker);

        btndp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get((Calendar.YEAR));
                int hour = c.get(Calendar.HOUR_OF_DAY);
                int minute = c.get(Calendar.MINUTE);

                DatePickerDialog dpd = new DatePickerDialog(FirstScreen.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datepicker, int mYear, int mMonth, int mDay) {
                        btndp.setText(mDay + "/" + (mMonth+1) + "/" + mYear);
                    }
                }, day, month, year);
                TimePickerDialog tpd = new TimePickerDialog(FirstScreen.this,new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timepicker, int mH, int mM) {
                        btndp.setText(btndp.getText() + " " + mH + ":" + mM);
                    }
                }, hour, minute, true);
               tpd.show();
               dpd.show();



            }
        });

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        lopt.setText(((TextView)v).getText());
    }

    public void saveButton(View view) {


        EditText cn = findViewById(R.id.customer_name);
        String cncnt = cn.getText().toString();

        Button btnvd = findViewById(R.id.btnDatePicker);
        String btnvdcnt = btnvd.getText().toString();

        TextView ct = findViewById(R.id.listOption);
        String ctcnt = ct.getText().toString();

        EditText dr = findViewById(R.id.duration);
        String drcnt = dr.getText().toString();


        RadioGroup rgplro = (RadioGroup) findViewById(R.id.lro);
        int radioButtonIDlro = rgplro.getCheckedRadioButtonId();
        RadioButton rbtnlro = (RadioButton) rgplro.findViewById(radioButtonIDlro);
        String lrocnt = (String) rbtnlro.getText();

        RadioGroup rgpro = (RadioGroup) findViewById(R.id.ro);
        int radioButtonIDro = rgpro.getCheckedRadioButtonId();
        RadioButton rbtnro = (RadioButton) rgpro.findViewById(radioButtonIDro);
        String rocnt = (String) rbtnro.getText();


        Intent intent = new Intent(this,LastScreen.class);
        intent.putExtra("CUSTOMER_NAME",cncnt);
        intent.putExtra("DATE",btnvdcnt);
        intent.putExtra("CAR_TYPE", ctcnt);
        intent.putExtra("DURATION", drcnt);
        intent.putExtra("LOCATION_OPTION", lrocnt);
        intent.putExtra("RENT_OPTION", rocnt);
        startActivity(intent);
    }
}
