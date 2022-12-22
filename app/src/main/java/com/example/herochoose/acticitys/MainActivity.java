package com.example.herochoose.acticitys;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.herochoose.fragments.OneFragment;
import com.example.herochoose.R;
import com.example.herochoose.fragments.ThreeFragment;
import com.example.herochoose.fragments.TwoFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textViewResult);
        textView.setText("Hero Choose");

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        OneFragment oneFragment = new OneFragment();
        fragmentTransaction.add(R.id.fragmentCon, oneFragment).commit();
    }

    public void LoadSecFragment() {

        fragmentManager.beginTransaction().replace(R.id.fragmentCon, new TwoFragment()).addToBackStack(null).commit();

    }

    public void LoadThirdFragment() {

        fragmentManager.beginTransaction().replace(R.id.fragmentCon, new ThreeFragment()).addToBackStack(null).commit();
    }
}