package com.easysubway;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.Button;

public class SettingActivity extends Activity {

    // boolean is_theme_white = false;

    private ConstraintLayout layout;
    private Button hi;
    private Button bye;
    private Button start_activity;
    private Context context;
    private AudioManager mAudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        layout = findViewById(R.id.layout);
        start_activity=findViewById(R.id.start_activity);
        hi = findViewById(R.id.hi);
        bye = findViewById(R.id.bye);


        hi.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            private Context context;

                            @Override
                            public void onClick(View v)
                            {


                            }
                        }
                );
        bye.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                //                     aManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                            }
                        }
                );
        /*black_theme.setOnClickListener
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
                );*/

        start_activity.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                Intent intent= new Intent(SettingActivity.this, MainActivity.class);
                                //intent.putExtra("is_theme_white",is_theme_white);
                                startActivity(intent);
                            }
                        }
                );

    }

}
