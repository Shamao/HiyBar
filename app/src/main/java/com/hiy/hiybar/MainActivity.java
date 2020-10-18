package com.hiy.hiybar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hiy.hiy_bar.UITitleBar;
import com.hiy.hiy_bar.delegate.DefaultUITitleBarDelegate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UITitleBar uiTitleBar = findViewById(R.id.title_bar);

        DefaultUITitleBarDelegate delegate = new DefaultUITitleBarDelegate();
        delegate.bindLeftBack(this, uiTitleBar, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "hello world", Toast.LENGTH_LONG).show();
            }
        });

        delegate.bindTitle(this, uiTitleBar, "hello");
    }
}