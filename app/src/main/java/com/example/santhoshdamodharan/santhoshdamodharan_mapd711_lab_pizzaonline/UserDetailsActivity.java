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
import android.widget.Button;
import android.widget.EditText;

public class UserDetailsActivity extends AppCompatActivity {

    private EditText editTextName;
    private Button btnSend;

    // Keys for passing the values
    public static final String NAME_KEY = "name";

    String menuItem = "", topping = "", size = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        setTitle(R.string.title);
        initView();
        menuItem = getIntent().getStringExtra(MainActivity.MENU_ITEM);
        topping = getIntent().getStringExtra(AddOnActivity.TOPPINGS);
        size = getIntent().getStringExtra(SizeSelectionActivity.PIZZA_SIZE);
    }

    /*
    Initialising the views
    */
    private void initView() {
        editTextName = (EditText) findViewById(R.id.editText);
        btnSend = (Button) findViewById(R.id.button_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserDetailsActivity.this, CheckOutActivity.class);
                intent.putExtra(NAME_KEY, editTextName.getText().toString());
                intent.putExtra(MainActivity.MENU_ITEM, menuItem);
                intent.putExtra(SizeSelectionActivity.PIZZA_SIZE, size);
                intent.putExtra(AddOnActivity.TOPPINGS, topping);

                startActivity(intent);
            }
        });
    }
}
