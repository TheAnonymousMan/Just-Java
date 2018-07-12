package com.example.raymondedmund.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

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
        generateOrderSummary();
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
        TextView priceTextView = (TextView) findViewById(R.id.Price);

        int price = number * cost;

        quantityTextView.setText("" + number);
        priceTextView.setText("₹ " + price);
    }


    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number)
    {
        TextView priceTextView = (TextView) findViewById(R.id.Price);
        priceTextView.setText("That would be ₹ " + number + "\nThanks for ordering!");
    }

    /**
     * This method displays a string based message.
     */

    private void displayMessage(String message)
    {
        TextView priceTextView = (TextView) findViewById(R.id.Price);
        priceTextView.setText(message);
    }

    public void generateOrderSummary()
    {
        TextView orderSummary = (TextView) findViewById(R.id.orderSummary);
        TextView orderTitle = (TextView) findViewById(R.id.orderTitle);
        String stringName = "Souporno Ghosh";
        int price = 0;

        price = cost * numberOfCoffees;

        orderTitle.setText("Order Summary");
        orderSummary.setText("\nName: " + stringName + "\nQuantity: " + numberOfCoffees +"\nTotal: ₹ " + price + "\nThank you!");
    }

}