package com.example.user.myapplication;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.alarmBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager notificationManager= (NotificationManager)MainActivity.this.getSystemService(MainActivity.this.NOTIFICATION_SERVICE);
                Intent intent1 = new Intent(MainActivity.this.getApplicationContext(),MainActivity.class);

                Notification.Builder builder = new Notification.Builder(getApplicationContext());
                intent1.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP| Intent.FLAG_ACTIVITY_CLEAR_TOP);

                PendingIntent pendingNotificationIntent = PendingIntent.getActivity( MainActivity.this,0, intent1,PendingIntent.FLAG_UPDATE_CURRENT);

                builder.setSmallIcon(R.drawable.on).setTicker("HETT").setWhen(System.currentTimeMillis())
                        .setNumber(1).setContentTitle("푸쉬 제목").setContentText("푸쉬내용")
                        .setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE).setContentIntent(pendingNotificationIntent).setAutoCancel(true).setOngoing(true);

                notificationManager.notify(1, builder.build());
            }
        });
    }


}
}
