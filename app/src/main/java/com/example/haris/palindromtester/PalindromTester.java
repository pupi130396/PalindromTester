package com.example.haris.palindromtester;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



/**
 * Created by Haris on 11.03.2018.
 */

public class PalindromTester extends AppCompatActivity {

    private Button button;
    private EditText eingabe;
    private EditText ausgabe;


    /**
     * This method is triggered every time the application is started.
     *
     * @param savedInstanceState - the current instance
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palindrom_tester);



        button = (Button) findViewById(R.id.button);
        ausgabe = (EditText) findViewById(R.id.editText3);
        eingabe = (EditText) findViewById(R.id.editText2);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean isPalindrome = false;



                if (eingabe.getText().toString().isEmpty()){
                    eingabe.setError("Geben Sie bitte ein Wort ein!");
                }
                else if (eingabe.getText().toString().length() < 5){
                    eingabe.setError("Länge des Wortes zu klein!");
                }
                else
                    isPalindrome = isPalindrome(eingabe.getText().toString());

                ausgabe.setText(Boolean.toString(isPalindrome));

            }
        });
    }

    /**
     * This method is used to check whether the input string is a palindrome or not.
     * @param str - the input string which is fetched from the inputField
     * @return - true -> current input is a palindrome
     *           false -> current input isn't a palindrome
     */
    public static boolean isPalindrome(String str){
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

}


