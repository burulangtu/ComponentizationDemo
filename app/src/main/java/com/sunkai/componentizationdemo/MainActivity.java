package com.sunkai.componentizationdemo;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.sunkai.componentizationdemo.databinding.MainActivityBinding;
import com.sunkai.libraryone.LibraryActivity;

public class MainActivity extends AppCompatActivity {
    private MainActivityBinding mainActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainActivityBinding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(MainActivity.this, LibraryActivity.class));
                } catch (NoClassDefFoundError e) {
                    Toast.makeText(MainActivity.this, "模块不存在", Toast.LENGTH_SHORT).show();
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(MainActivity.this, "activity 没有在 AndroidManifest.xml 中声明", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
