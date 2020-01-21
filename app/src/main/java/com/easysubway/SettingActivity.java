package com.easysubway;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.Button;

public class SettingActivity extends Activity {

    boolean is_theme_white = false;

    private ConstraintLayout layout;
    private Button black_theme;
    private Button white_theme;
    private Button start_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        layout = findViewById(R.id.layout);
        black_theme = findViewById(R.id.black_theme);
        white_theme = findViewById(R.id.white_theme);
        start_activity=findViewById(R.id.start_activity);
        black_theme.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                is_theme_white = false;
                                layout.setBackgroundColor(Color.BLACK);
                                black_theme.setBackgroundColor(Color.BLACK);
                                white_theme.setBackgroundColor(Color.BLACK);

                                black_theme.setTextColor(Color.WHITE);
                                white_theme.setTextColor(Color.WHITE);
                                start_activity.setTextColor(Color.WHITE);
                            }
                        }
                        );
        white_theme.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                is_theme_white = true;
                                layout.setBackgroundColor(Color.WHITE);
                                black_theme.setBackgroundColor(Color.WHITE);
                                white_theme.setBackgroundColor(Color.WHITE);

                                black_theme.setTextColor(Color.BLACK);
                                white_theme.setTextColor(Color.BLACK);
                                start_activity.setTextColor(Color.BLACK);
                            }
                        }
                );
        start_activity.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                Intent intent= new Intent(SettingActivity.this, MainActivity.class);
                                intent.putExtra("is_theme_white",is_theme_white);
                                startActivity(intent);
                            }
                        }
                );

    }

}
