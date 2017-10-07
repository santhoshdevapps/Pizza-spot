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
import android.widget.CheckBox;

public class AddOnActivity extends AppCompatActivity {

    // Keys for passing the values
    CheckBox cheese, smoked, susagge, spinach, black, spanish;
    public static final String TOPPINGS = "toppings";
    String menuItem = "", size = "", topping = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_on);

        //Initialising the views

        cheese = (CheckBox) findViewById(R.id.checkbox_cheese);
        smoked = (CheckBox) findViewById(R.id.checkbox_smoked);
        susagge = (CheckBox) findViewById(R.id.checkbox_ham);
        spinach = (CheckBox) findViewById(R.id.checkbox_spinach);
        black = (CheckBox) findViewById(R.id.checkbox_black);
        spanish = (CheckBox) findViewById(R.id.checkbox_spanish);

        menuItem = getIntent().getStringExtra(MainActivity.MENU_ITEM);
        size = getIntent().getStringExtra(SizeSelectionActivity.PIZZA_SIZE);


        findViewById(R.id.button_ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AddOnActivity.this, UserDetailsActivity.class);
                i.putExtra(MainActivity.MENU_ITEM, menuItem);
                i.putExtra(SizeSelectionActivity.PIZZA_SIZE, size);
                i.putExtra(TOPPINGS, getCheckedItems());
                startActivity(i);
            }
        });
    }

    /*
        Used to increase the count when user selects the desired check option
    */

    private String getCheckedItems() {
        String items = "";
        if (cheese.isChecked()) {
            items += "Cheese ";
        }
        if (smoked.isChecked()) {
            items += "Green Pepper ";
        }
        if (susagge.isChecked()) {
            items += "Smoked Ham ";
        }
        if (spinach.isChecked()) {
            items += "Spinach ";
        }
        if (black.isChecked()) {
            items += "Black Olives ";
        }
        if (spanish.isChecked()) {
            items += "Spanish Onions ";
        }

        return items;
    }
}

