package com.example.tugaspr.tugaspr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstname;
    private EditText lastname;
    private EditText email;
    private EditText address;
    private EditText city;
    private EditText postcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = (EditText) findViewById(R.id.firstname);
        lastname = (EditText) findViewById(R.id.lastname);
        email = (EditText) findViewById(R.id.email);
        address = (EditText) findViewById(R.id.address);
        city = (EditText) findViewById(R.id.city);
        postcode = (EditText) findViewById(R.id.postcode);

        Button btnSubmit = (Button) findViewById(R.id.submit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitForm();
            }
        });
    }


    public void submitForm() {
        String firstnameText = firstname.getText().toString();
        String lastnameText = lastname.getText().toString();
        String emailText = email.getText().toString();
        String addressText = address.getText().toString();
        String cityText = city.getText().toString();
        String postcodeText = postcode.getText().toString();

        boolean cancelSubmit = false;
        View focusView = null;
        firstname.setError(null);
        lastname.setError(null);
        email.setError(null);
        city.setError(null);
        address.setError(null);
        postcode.setError(null);

        if(TextUtils.isEmpty(firstnameText.trim())) {
            cancelSubmit = true;
            focusView = firstname;
            firstname.setError("Harus diisi");
        }

        if(TextUtils.isEmpty(lastnameText.trim())) {
            cancelSubmit = true;
            focusView = lastname;
            lastname.setError("Harus diisi");
        }

        if(TextUtils.isEmpty(emailText.trim())) {
            cancelSubmit = true;
            focusView = email;
            email.setError("Harus diisi");
        }

        if(TextUtils.isEmpty(addressText.trim())) {
            cancelSubmit = true;
            focusView = address;
            address.setError("Harus diisi");
        }

        if(TextUtils.isEmpty(cityText.trim())) {
            cancelSubmit = true;
            focusView = city;
            city.setError("Harus diisi");
        }

        if(TextUtils.isEmpty(postcodeText.trim())) {
            cancelSubmit = true;
            focusView = postcode;
            postcode.setError("Harus diisi");
        }

        if(!cancelSubmit){
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            String dataToSend = firstnameText + " " + lastnameText + "\n" + emailText + "\n"
                    + addressText + "\n" + cityText + "\n" + postcodeText;
            intent.putExtra("data", dataToSend);
            startActivity(intent);
        } else {
            focusView.requestFocus();
        }
    }
}
