package com.example.android.otherappsintentsdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void geo(View view) {
      //  Uri uri = Uri.parse("geo:31.2629796,34.814857");
        Uri uri = Uri.parse("geo:0,0?q=beer + sheva + energy + street");

        //init the implicit intent with an ACTION String & a data uri
        Intent webIntent = new Intent(Intent.ACTION_VIEW, uri);

        startActivity(webIntent);
    }

    public void web(View view) {

        Uri uri = Uri.parse("http://developer.android.com/training/basics/firstapp/building-ui.html#q=");

        //init the implicit intent with an ACTION String & a data uri
        Intent webIntent = new Intent(Intent.ACTION_VIEW, uri);

        startActivity(webIntent);
    }

    public void call(View view) {
        Uri phoneUri = Uri.parse("tel://0507123012");
        Intent dialIntent = new Intent(Intent.ACTION_DIAL, phoneUri);
        startActivity(dialIntent);
    }

    public void message(View view) {
        Uri phoneUri = Uri.parse("smsto://0507123012");
        Intent dialIntent = new Intent(Intent.ACTION_SENDTO, phoneUri);
        startActivity(dialIntent);
    }
}
