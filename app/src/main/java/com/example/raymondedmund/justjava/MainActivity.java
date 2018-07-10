package com.example.raymondedmund.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity
{

    int numberOfCoffees = 0, cost = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view)
    {
        display(numberOfCoffees);
        displayPrice(numberOfCoffees*cost);
    }

    /**
     *This method increases the number of coffees.
     */
    public void increaseCoffee(View view)
    {
        numberOfCoffees++;
        display(numberOfCoffees);
    }

    /**
     *This method decreases the number of coffees.
     */

    public void decreaseCoffee(View view)
    {
        numberOfCoffees--;
        if(numberOfCoffees < 0)
            numberOfCoffees = 0;
        display(numberOfCoffees);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.Quantity);
        quantityTextView.setText("" + number);
    }


    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number)
    {
        TextView priceTextView = (TextView) findViewById(R.id.Price);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }

}