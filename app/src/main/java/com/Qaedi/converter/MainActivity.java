package com.Qaedi.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.TabWidget;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et_cm = (EditText) findViewById(R.id.et_cm);
        final EditText et_m = (EditText) findViewById(R.id.et_m);
        final EditText et_km = (EditText) findViewById(R.id.et_km);
        final EditText et_inch = (EditText) findViewById(R.id.et_inch);
        final Button btn_convert = (Button) findViewById(R.id.btn_convert);

        et_cm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                et_m.setText("");
                et_km.setText("");
                et_inch.setText("");
            }
        });
        et_m.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                et_cm.setText("");
                et_km.setText("");
                et_inch.setText("");
            }
        });
        et_km.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                et_cm.setText("");
                et_m.setText("");
                et_inch.setText("");
            }
        });
        et_inch.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                et_cm.setText("");
                et_m.setText("");
                et_km.setText("");
            }
        });
        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_cm.getText().toString().length()>0)
                {
                    double value = Double.parseDouble( et_cm.getText().toString());
                    et_m.setText("" + value * .01);
                    et_km.setText("" + value * .00001);
                    et_inch.setText("" + value * .39370079);
                    return;
                }
                if(et_m.getText().toString().length()>0)
                {
                    double value = Double.parseDouble( et_m.getText().toString());
                    et_cm.setText("" + value * 100);
                    et_km.setText("" + value * .001);
                    et_inch.setText("" + value * 39.37007874);
                    return;
                }
                if(et_km.getText().toString().length()>0)
                {
                    double value = Double.parseDouble( et_km.getText().toString());
                    et_cm.setText("" + value * 100000);
                    et_m.setText("" + value * 1000);
                    et_inch.setText("" + value * 39370.0787);
                    return;
                }
                if(et_inch.getText().toString().length()>0)
                {
                    double value = Double.parseDouble( et_inch.getText().toString());
                    et_cm.setText("" + value * 2.54);
                    et_m.setText("" + value * .0254);
                    et_km.setText("" + value * .0000254);
                    return;
                }


            }
        });




    }
}
