package dam.cazorla.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*Todos los activities heredan de la clase Activity, pero por compatibilidad todas heredan de AppCompatActivity
que a su vez hereda de Activity*/
public class MainActivity extends AppCompatActivity {
    Button iniciar;
    EditText txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciar = findViewById(R.id.button);
        txt1= findViewById(R.id.editText);
        txt2=findViewById(R.id.editText2);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = txt1.getText().toString();
                String texto2=txt2.getText().toString();
                Intent intent = new Intent (view.getContext(), Main2Activity.class);
                String dataGo = texto;
                intent.putExtra("dato", dataGo);
                intent.putExtra("usuario","usuario");
                Intent intent2 = new Intent (view.getContext(), Main2Activity.class);
                String dataGo2 = texto2;
                intent.putExtra("dato2", dataGo2);
                intent.putExtra("usuario","usuario");

                startActivityForResult(intent, 0);
                startActivityForResult(intent2, 0);
            }
        });


    }
}
