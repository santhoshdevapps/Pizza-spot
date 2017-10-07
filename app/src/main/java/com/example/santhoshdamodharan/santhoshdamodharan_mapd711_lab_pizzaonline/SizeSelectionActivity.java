/*
 Name : Santhosh Damodharan
 Student number : 300964037
 Assignment number : 2
 File Name : Pizaa Spot
 Description : pizza app used to select user desired pizza's
 Version : 1.0.0

 */

package com.example.santhoshdamodharan.santhoshdamodharan_mapd711_lab_pizzaonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class SizeSelectionActivity extends AppCompatActivity {
    // Keys for passing the values
    public static final String PIZZA_SIZE = "pizza_size";
    private RadioButton radioButton1;
    String menuItem = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size_selection);
        menuItem = getIntent().getStringExtra(MainActivity.MENU_ITEM);
    }

    /*
        Used to handle the user selection on different sizes
        */
    public void onRadioButtonClicked(View view) {

        Intent i = new Intent(this, AddOnActivity.class);
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_small:
                i.putExtra(MainActivity.MENU_ITEM, menuItem);
                i.putExtra(PIZZA_SIZE, getString(R.string.radio_small));
//                i.putExtra(PIZZA_SIZE, radioButton1.getText().toString());
                startActivity(i);
                break;
            case R.id.radio_medium:
                i.putExtra(MainActivity.MENU_ITEM, menuItem);
                i.putExtra(PIZZA_SIZE, getString(R.string.radio_medium));
                startActivity(i);
                break;
            case R.id.radio_large:
                i.putExtra(MainActivity.MENU_ITEM, menuItem);
                i.putExtra(PIZZA_SIZE, getString(R.string.radio_large));
                startActivity(i);
                break;
            case R.id.radio_extra_large:
                i.putExtra(MainActivity.MENU_ITEM, menuItem);
                i.putExtra(PIZZA_SIZE, getString(R.string.radio_extra_large));
                startActivity(i);
                break;

        }
    }
}
