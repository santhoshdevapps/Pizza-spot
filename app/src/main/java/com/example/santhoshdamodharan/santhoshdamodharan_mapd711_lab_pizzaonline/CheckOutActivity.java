/*
 Name : Santhosh Damodharan
 Student number : 300964037
 Assignment number : 2
 File Name : Pizaa Spot
 Description : pizza app used to select user desired pizza's
 Version : 1.0.0

 */
package com.example.santhoshdamodharan.santhoshdamodharan_mapd711_lab_pizzaonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CheckOutActivity extends AppCompatActivity {
    // Keys for passing the values
    TextView message;
    String name = "", menuItem = "", size = "", addOn = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);

        //    Setting the values
        name = getIntent().getStringExtra(UserDetailsActivity.NAME_KEY);
        menuItem = getIntent().getStringExtra(MainActivity.MENU_ITEM);
        size = getIntent().getStringExtra(SizeSelectionActivity.PIZZA_SIZE);
        addOn = getIntent().getStringExtra(AddOnActivity.TOPPINGS);
        String checkoutMessage = name + " Thank you for your online order. Your " + menuItem + " pizza order successfully received and will be delivered soon " + "\n \n Size choosen : " + size + "\n \nTopping added are : \n" + addOn;
        message = (TextView) findViewById(R.id.deliever);
        message.setText(checkoutMessage);
    }
}
