package com.example.nguyengon.service_example;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by nguyengon on 3/30/16.
 */
public class MyService extends Service {

    MediaPlayer mediaPlayer;

    @Override
    public void onCreate() {
        super.onCreate();

        Toast.makeText(this, "The Service Created", Toast.LENGTH_LONG).show();
        Log.i("TAG11","start");
        mediaPlayer = MediaPlayer.create(this, R.raw.sun);
        mediaPlayer.setLooping(false);

    }





    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(this, "Srevice Started", Toast.LENGTH_LONG).show();

        mediaPlayer.start();
        Log.i("TAG11","comand");

        return START_NOT_STICKY ;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("TAG11","stop");

        mediaPlayer.stop();

        Toast.makeText(this, "Service destroyed", Toast.LENGTH_LONG).show();

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}
