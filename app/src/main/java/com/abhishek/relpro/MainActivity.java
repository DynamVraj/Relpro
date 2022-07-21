package com.abhishek.relpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    public ImageView Healthcare;
    public ImageView Shoppers;
    public ImageView Manufacturer;
    public ImageView Services;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Healthcare = (ImageView) findViewById(R.id.row_wallet_redeem_img);
        Healthcare.setOnClickListener(this);
        Shoppers = (ImageView) findViewById(R.id.row_wallet_redeem_img1);
        Shoppers.setOnClickListener(this);
        Manufacturer = (ImageView) findViewById(R.id.row_wallet_redeem_img2);
        Manufacturer.setOnClickListener(this);
        Services = (ImageView) findViewById(R.id.row_wallet_redeem_img3);
        Services.setOnClickListener(this);
        Button btnLogin=findViewById(R.id.btnlogin);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id) {
            case R.id.btnlogin:
                Intent inn1=getIntent();
                inn1=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(inn1);
                break;
            case R.id.row_wallet_redeem_img:
                Intent inn2=getIntent();
                inn2=new Intent(MainActivity.this,DoctorSubActivity.class);
                startActivity(inn2);
                break;
            case R.id.row_wallet_redeem_img1:
                Intent inn3=getIntent();
                inn3=new Intent(MainActivity.this,ShopSubActivity.class);
                startActivity(inn3);
                break;
            case R.id.row_wallet_redeem_img2:
                Intent inn4=getIntent();
                inn4=new Intent(MainActivity.this,ManufacturingSubActivity.class);
                startActivity(inn4);
                break;
            case R.id.row_wallet_redeem_img3:
                Intent inn5=getIntent();
                inn5=new Intent(MainActivity.this,ServiceSubActivity.class);
                startActivity(inn5);
                break;
        }
    }
}
