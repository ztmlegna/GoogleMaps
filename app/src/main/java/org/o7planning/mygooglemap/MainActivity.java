package org.o7planning.mygooglemap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity    {

    private MyMapFragment myMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = this.getSupportFragmentManager();
        this.myMapFragment = (MyMapFragment) fragmentManager.findFragmentById(R.id.fragment_map);

    }

}