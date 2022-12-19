package dam.cazorla.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    int notifID=1;

    Button n,m,c,b;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        n=findViewById(R.id.n);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);
        b=findViewById(R.id.b);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent be = new Intent (view.getContext(), Main5Activity.class);
                startActivityForResult(be, 0);
            }
        });




    }
    public void onClick(View view){
        NotificationCompat.Builder builder = new  NotificationCompat.Builder(this, "Mi canal")
                .setSmallIcon(android.R.drawable.ic_dialog_alert)
                .setContentTitle("FALLASTES")
                .setContentText("Has perdido")
                .setPriority(NotificationCompat.PRIORITY_HIGH);

        Intent resultadoIntent = new Intent(this, MainActivity.class);

        TaskStackBuilder pila = TaskStackBuilder.create(this);
        pila.addParentStack(MainActivity.class);

        //Añade intent que comienza la actividad al inicio de la pila
        pila.addNextIntent(resultadoIntent);
        PendingIntent resultadoPendingIntent =
                pila.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(resultadoPendingIntent);

        // ENVIAR LA NOTIFICACIÓN

        NotificationManager notificador =
                (NotificationManager) getSystemService(getApplicationContext().NOTIFICATION_SERVICE);


        // A partir de la version 0, hay que crer un canal de notificación
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel canal = new NotificationChannel(
                    "Mi canal",
                    "título del canal de notificación",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            notificador.createNotificationChannel(canal);
        }

        notificador.notify(notifID, builder.build());

        Intent be = new Intent (view.getContext(), MainActivity.class);
        startActivityForResult(be, 0);
    }
}

