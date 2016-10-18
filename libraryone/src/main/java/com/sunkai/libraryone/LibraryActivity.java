package com.sunkai.libraryone;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sunkai.libraryone.databinding.LibraryActivityBinding;

public class LibraryActivity extends AppCompatActivity {

    private LibraryActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_library);

        binding.buttonLib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LibraryActivity.this, "子模块被调用", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
