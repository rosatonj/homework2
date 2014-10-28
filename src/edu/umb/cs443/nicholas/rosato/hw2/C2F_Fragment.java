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
public class C2F_Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View v1 = inflater.inflate(R.layout.fragment_c2f, container, false);

        Button convert = (Button) v1.findViewById(R.id.button_c2fconvert);

        convert.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                TextView ans = (TextView) v1.findViewById(R.id.textView_farenanswer);
                EditText temp = (EditText) v1.findViewById(R.id.editText_cels);
                double celsius = Double.parseDouble(temp.getText().toString());
                double fahrenheit = (celsius * 9/5 ) + 32;
                String str = String.format("%.3f °C is %.3f °F", celsius, fahrenheit);
                ans.setText(str);
            }

        });

        return v1;

        


    }
}