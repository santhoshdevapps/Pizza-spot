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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Keys for passing the values
    public static final String MENU_ITEM = "menu_item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        //created menu option to list the views
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.pizza, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection of the user
        Intent i = new Intent(this, SizeSelectionActivity.class);
        switch (item.getItemId()) {
            case R.id.meat_supreme:
                i.putExtra(MENU_ITEM, getString(R.string.item_one));
                startActivity(i);
                return true;
            case R.id.super_hawaiian:
                i.putExtra(MENU_ITEM, getString(R.string.item_two));
                startActivity(i);
                return true;
            case R.id.veggie:
                i.putExtra(MENU_ITEM, getString(R.string.item_three));
                startActivity(i);
                return true;
            case R.id.mediterranean:
                i.putExtra(MENU_ITEM, getString(R.string.item_four));
                startActivity(i);
                return true;
            case R.id.cheddar_supreme:
                i.putExtra(MENU_ITEM, getString(R.string.item_five));
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
