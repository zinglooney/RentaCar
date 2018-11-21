package car_rental.zinglooney.carrental;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class FirstScreen extends ListActivity {

    private TextView msg;


    /*msg = (TextView) findViewByid(R.id.listMessage);
        @Override
        protected void onListItemClick(ListView l, View v, int position, long id) {
            super.onListItemClick(l, v, position, id);
        }*/


    private String[] Car_type = {
            "Class A",
            "Class B",
            "Class C"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreen);

        setListAdapter(new ArrayAdapter <>(this,android.R.layout.simple_list_item_1, Car_type));

        //msg.setText("Click Here" +getSelectedItemPosition());
    }

    public void saveButton(View view) {

        EditText cn = findViewById(R.id.customer_name);
        String message = cn.getText().toString();

        Intent intent = new Intent(this,LastScreen.class);
        intent.putExtra("EXTRA_MESSAGE",message);
        startActivity(intent);
    }
}
