package me.dubh.diduknow;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private FactBank mFactBank = new FactBank();
    private ColorPicker mColorPicker = new ColorPicker();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this, "Welcome to Laduma's Did you Know?", Toast.LENGTH_LONG).show();
        Log.d(TAG, "hello from the first Log!");
        setContentView(R.layout.activity_main);
        // change color on every click
        final ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.main_layout);
        // view variables and assign them
        final TextView factDisplay = (TextView) findViewById(R.id.text_view_fact);
        final Button getFact = (Button) findViewById(R.id.button_another_fact);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //when button clicked randomly choose fact
                String newFact = mFactBank.getFact();
                factDisplay.setText(newFact);
                constraintLayout.setBackgroundColor(Color.parseColor(mColorPicker.getColor()));
            }
        };
        getFact.setOnClickListener(listener);
    }
}
