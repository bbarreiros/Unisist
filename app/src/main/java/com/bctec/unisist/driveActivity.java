package com.bctec.unisist;

import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;


public class driveActivity extends Activity  {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Uri.Builder directionsBuilder = new Uri.Builder()
                .scheme("https")
                .authority("drive.google.com")
                .appendPath("drive")
                .appendPath("u")
                .appendPath("1")
                .appendPath("folders")
                .appendPath("1Df5ijPpBRHDLXZcbJk21fS9PHRJsQHfP");
        startActivity(new Intent(Intent.ACTION_VIEW, directionsBuilder.build()));


    }
}