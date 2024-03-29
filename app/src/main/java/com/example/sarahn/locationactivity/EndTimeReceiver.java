package com.example.sarahn.locationactivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.widget.Toast;

/**
 * Created by SarahN on 10/18/2015.
 */
public class EndTimeReceiver extends BroadcastReceiver {

    AudioManager audioManager;
    int getprofile;

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, " End Receiver class fired..!!", Toast.LENGTH_SHORT).show();

        audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);

        SharedPreferences sharedPreference = context.getSharedPreferences("cur1", Context.MODE_PRIVATE);
        getprofile = sharedPreference.getInt("pr2" , 0);

        if(getprofile == 2) {
            audioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
        }

    }
}
