package edu.umb.cs443.nicholas.rosato.hw2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by nrosato on 10/27/14.
 */
public class F2C_Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View v2 = inflater.inflate(R.layout.fragment_f2c, container, false);


        Button convert = (Button) v2.findViewById(R.id.button_f2cconvert);

        convert.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TextView ans = (TextView) v2.findViewById(R.id.textView_celsanswer);
                EditText temp = (EditText) v2.findViewById(R.id.editText_faren);
                double fahrenheit = Double.parseDouble(temp.getText().toString());
                double celsius = (fahrenheit - 32) * (5/9);
                String str = String.format("%.3f °F is %.3f°C", fahrenheit, celsius);
                ans.setText(str);
            }

        });





        return v2;
        

    }
}