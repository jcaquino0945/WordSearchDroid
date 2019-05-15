package com.example.joshvocal.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.joshvocal.R;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mPlayGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mPlayGameButton = findViewById(R.id.playGameButton);
        mPlayGameButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.playGameButton:
                startActivity(new Intent(this, WordSearchActivity.class));
                break;
            default:
                break;
        }
    }
}
