package com.example.hazi4;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowItemActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.fragment2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String selectedItem1 = extras.getString("item1");
            String selectedItem2 = extras.getString("item2");
            String selectedItem3 = extras.getString("item3");
            String selectedItem4 = extras.getString("item4");
            TextView textview3=(TextView) findViewById(R.id.Cumpara);
            TextView textview4=(TextView) findViewById(R.id.Vinde);
            TextView textview5=(TextView) findViewById(R.id.A);
            TextView textview6=(TextView) findViewById(R.id.B);
            textview3.setText(selectedItem1);
            textview4.setText(selectedItem2);
            textview5.setText(selectedItem3);
            textview6.setText(selectedItem4);
            textview3.setVisibility(View.VISIBLE);
            textview4.setVisibility(View.VISIBLE);
            textview5.setVisibility(View.VISIBLE);
            textview6.setVisibility(View.VISIBLE);

        }
    }
}
