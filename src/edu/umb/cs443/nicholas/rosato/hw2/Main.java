package edu.umb.cs443.nicholas.rosato.hw2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button f2cbutton = (Button) findViewById(R.id.button_f2c);
        Button c2fbutton = (Button) findViewById(R.id.button_c2f);
        Button helpbutton = (Button) findViewById(R.id.button_help);

        f2cbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment f2c = new F2C_Fragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, f2c);
                fragmentTransaction.commit();


            }

        });


        c2fbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Fragment c2f = new C2F_Fragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, c2f);
                fragmentTransaction.commit();
            }

        });

        helpbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Fragment help = new Help_Fragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, help);
                fragmentTransaction.commit();
            }

        });
    }


}
