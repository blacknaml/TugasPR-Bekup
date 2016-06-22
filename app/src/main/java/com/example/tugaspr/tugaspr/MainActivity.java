package com.example.tugaspr.tugaspr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitForm(View view) {
        EditText firstname = (EditText) findViewById(R.id.firstname);
        String firstnameText = firstname.getText().toString();

        EditText lastname = (EditText) findViewById(R.id.lastname);
        String lastnameText = lastname.getText().toString();

        EditText email = (EditText) findViewById(R.id.email);
        String emailText = email.getText().toString();

        EditText address = (EditText) findViewById(R.id.address);
        String addressText = address.getText().toString();

        EditText city = (EditText) findViewById(R.id.city);
        String cityText = city.getText().toString();

        EditText postcode = (EditText) findViewById(R.id.postcode);
        String postcodeText = postcode.getText().toString();

        setContentView(R.layout.result_layout);

        TextView fullname = (TextView) findViewById(R.id.fullname);
        fullname.setText(firstnameText+" "+lastnameText);

        TextView alamat = (TextView) findViewById(R.id.address);
        alamat.setText(addressText);

        TextView surat = (TextView) findViewById(R.id.email);
        surat.setText(emailText);

        TextView kota = (TextView) findViewById(R.id.city);
        kota.setText(cityText);

        TextView kodepos = (TextView) findViewById(R.id.postcode);
        kodepos.setText(postcodeText);

    }
}
