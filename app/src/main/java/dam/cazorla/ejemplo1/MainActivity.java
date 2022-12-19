package dam.cazorla.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/*Todos los activities heredan de la clase Activity, pero por compatibilidad todas heredan de AppCompatActivity
que a su vez hereda de Activity*/
public class MainActivity extends AppCompatActivity {
    Button iniciar;
    EditText txt1,txt2,conrr;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciar = findViewById(R.id.button);
        txt1= findViewById(R.id.editText);
        txt2=findViewById(R.id.pass);
        final Toast t= Toast.makeText(this,"Las ccrendenciales son admin admin",Toast.LENGTH_LONG);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = txt1.getText().toString();
                String texto2=txt2.getText().toString();
                if(texto2.equals("admin")&&texto.equals("admin")){
                Intent intent = new Intent (view.getContext(), Main2Activity.class);
                startActivityForResult(intent, 0);
            }else{
                    t.show();
                }


            }

        });


    }
}
