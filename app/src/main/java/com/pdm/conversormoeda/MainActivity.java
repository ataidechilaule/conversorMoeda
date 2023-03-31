package com.pdm.conversormoeda;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText meticalEditText;

    TextView resultadoTexT;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void converter(View view){

       meticalEditText = findViewById(R.id.metical_txt);

       resultadoTexT = findViewById(R.id.result_txt);

        if(!meticalEditText.getText().toString().equals("")){
            float meticalValor = Float.parseFloat(meticalEditText.getText().toString());
            float iene = meticalValor * 2F;

            resultadoTexT.setText(String.valueOf(iene));
        }else {
            resultadoTexT.setText(R.string.emptyvalue);
        }
    }
}
