package dam.cazorla.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    //La creo aquí porque voy a usarla en distintos métodos

    TextView txt1,txt2,txt3;
    String resultado,usuario;
    int val;
    int x1,x2,x3,x4,x5,x6,x7,x8,x9,y1,y2,y3,y4,y5,y6,y7,y8,y9;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
       // jugar();
        txt1= findViewById(R.id.username);
        Bundle bundle = getIntent().getExtras();
        resultado = bundle.getString("dato").toString();
        txt1.setText(resultado);
        txt2=findViewById(R.id.username2);
        Bundle bundle2 = getIntent().getExtras();
        usuario= bundle2.getString("dato2").toString();
        txt2.setText(usuario);
        String jug=resultado;
        String jug2=usuario;
        txt3 = findViewById(R.id.t);
        txt3.setText(jug);


        ImageView img=(ImageView)findViewById(R.id.img3);
        ImageView img1=(ImageView)findViewById(R.id.img);
        ImageView img2=(ImageView)findViewById(R.id.img2);
        ImageView img3=(ImageView)findViewById(R.id.img4);
        ImageView img4=(ImageView)findViewById(R.id.img5);
        ImageView img5=(ImageView)findViewById(R.id.img6);
        ImageView img6=(ImageView)findViewById(R.id.img7);
        ImageView img7=(ImageView)findViewById(R.id.img8);
        ImageView img8=(ImageView)findViewById(R.id.img9);

        img.setImageResource(R.drawable.ic_launcher_background);
        img1.setImageResource(R.drawable.ic_launcher_background);
        img2.setImageResource(R.drawable.ic_launcher_background);
        img3.setImageResource(R.drawable.ic_launcher_background);
        img4.setImageResource(R.drawable.ic_launcher_background);
        img5.setImageResource(R.drawable.ic_launcher_background);
        img6.setImageResource(R.drawable.ic_launcher_background);
        img7.setImageResource(R.drawable.ic_launcher_background);
        img8.setImageResource(R.drawable.ic_launcher_background);



        //habilitamos los botones
        img.setEnabled(true);
        img1.setEnabled(true);
        img2.setEnabled(true);
        img3.setEnabled(true);
        img4.setEnabled(true);
        img5.setEnabled(true);
        img6.setEnabled(true);
        img7.setEnabled(true);
        img8.setEnabled(true);





    }

    public void comprobar(){
        if(y1==1 && y2==2 && y3==3){
            Toast.makeText(this, "Has ganado "+usuario, Toast.LENGTH_SHORT).show();
        }
        else if(y1==1 && y4==4 && y7==7){
            Toast.makeText(this, "Has ganado "+usuario, Toast.LENGTH_SHORT).show();
        }
        else if(y1==1 && y5==5 && y9==9){
            Toast.makeText(this, "Has ganado "+usuario, Toast.LENGTH_SHORT).show();
        }
        else if(y2==2 && y5==5 && y8==8){
            Toast.makeText(this, "Has ganado "+usuario, Toast.LENGTH_SHORT).show();
        }
        else if(y3==3 && y6==6 && y9==9){
            Toast.makeText(this, "Has ganado "+usuario, Toast.LENGTH_SHORT).show();
        }
        else if(y3==3 && y5==5 && y7==7){
            Toast.makeText(this, "Has ganado "+usuario, Toast.LENGTH_SHORT).show();
        }
        else if (y4 == 4 && y5 == 5 && y6 == 6) {
            Toast.makeText(this, "Has ganado "+usuario, Toast.LENGTH_SHORT).show();
        }
        else if(y7==7 && y8==8 && y9==9){
            Toast.makeText(this, "Has ganado "+usuario, Toast.LENGTH_SHORT).show();
        }
        else if(x1==1 && x2==2 && x3==3){
            Toast.makeText(this, "Has ganado "+resultado, Toast.LENGTH_SHORT).show();
        }
        else if(x1==1 && x4==4 && x7==7){
            Toast.makeText(this, "Has ganado "+resultado, Toast.LENGTH_SHORT).show();
        }
        else if(x1==1 && x5==5 && x9==9){
            Toast.makeText(this, "Has ganado "+resultado, Toast.LENGTH_SHORT).show();
        }
        else if(x2==2 && x5==5 && x8==8){
            Toast.makeText(this, "Has ganado "+resultado, Toast.LENGTH_SHORT).show();
        }
        else if(x3==3 && 6==6 && x9==9){
            Toast.makeText(this, "Has ganado "+resultado, Toast.LENGTH_SHORT).show();
        }
        else if(x3==3 && x5==5 && x7==7){
            Toast.makeText(this, "Has ganado "+resultado, Toast.LENGTH_SHORT).show();
        }
        else if(x7==7 && x8==8 && x9==9){
            Toast.makeText(this, "Has ganado "+resultado, Toast.LENGTH_SHORT).show();
        }
    }
    public void cambio(View vista) {
          String un0=txt3.getText().toString();
        if (un0==resultado) {
            ImageView img=(ImageView)findViewById(R.id.img);
            img.setImageResource(R.drawable.img);
            txt3.setText(usuario);
            x1= 1;
        }else{
            ImageView img=(ImageView)findViewById(R.id.img);
            img.setImageResource(R.drawable.img_1);
            txt3.setText(resultado);
            y1=1;
        }
comprobar();

    }
    public void cambio2(View vista) {
        String un0=txt3.getText().toString();
        if (un0==resultado) {
            ImageView img=(ImageView)findViewById(R.id.img2);
            img.setImageResource(R.drawable.img);
            txt3.setText(usuario);
            x2=2;
        }else{
            ImageView img=(ImageView)findViewById(R.id.img2);
            img.setImageResource(R.drawable.img_1);
            txt3.setText(resultado);
            y2=2;
        }

comprobar();
    }
    public void cambio3(View vista) {

        String un0=txt3.getText().toString();
        if (un0==resultado) {
            ImageView img=(ImageView)findViewById(R.id.img3);
            img.setImageResource(R.drawable.img);
            txt3.setText(usuario);
            x3=3;
        }else{
            ImageView img=(ImageView)findViewById(R.id.img3);
            img.setImageResource(R.drawable.img_1);
            txt3.setText(resultado);
            y3=3;
        }

comprobar();
    }
    public void cambio4(View vista) {
        String un0=txt3.getText().toString();
        if (un0==resultado) {
            ImageView img=(ImageView)findViewById(R.id.img4);
            img.setImageResource(R.drawable.img);
            txt3.setText(usuario);
            x4=4;
        }else{
            ImageView img=(ImageView)findViewById(R.id.img4);
            img.setImageResource(R.drawable.img_1);
            txt3.setText(resultado);
            y4=4;
        }
comprobar();

    }
    public void cambio5(View vista) {
        String un0=txt3.getText().toString();
        if (un0==resultado) {
            ImageView img=(ImageView)findViewById(R.id.img5);
            img.setImageResource(R.drawable.img);
            txt3.setText(usuario);
            x5=5;
        }else{
            ImageView img=(ImageView)findViewById(R.id.img5);
            img.setImageResource(R.drawable.img_1);
            txt3.setText(resultado);
            y5=5;
        }

comprobar();
    }
    public void cambio6(View vista) {
        String un0=txt3.getText().toString();
        if (un0==resultado) {
            ImageView img=(ImageView)findViewById(R.id.img6);
            img.setImageResource(R.drawable.img);
            txt3.setText(usuario);
            x6=6;
        }else{
            ImageView img=(ImageView)findViewById(R.id.img6);
            img.setImageResource(R.drawable.img_1);
            txt3.setText(resultado);
            y6=6;
        }
comprobar();

    }
    public void cambio7(View vista) {
        String un0=txt3.getText().toString();
        if (un0==resultado) {
            ImageView img=(ImageView)findViewById(R.id.img7);
            img.setImageResource(R.drawable.img);
            txt3.setText(usuario);
            x7=7;
        }else{
            ImageView img=(ImageView)findViewById(R.id.img7);
            img.setImageResource(R.drawable.img_1);
            txt3.setText(resultado);
            y7=7;
        }

comprobar();
    }
    public void cambio8(View vista) {
        String un0=txt3.getText().toString();
        if (un0==resultado) {
            ImageView img=(ImageView)findViewById(R.id.img8);
            img.setImageResource(R.drawable.img);
            txt3.setText(usuario);
            x8=8;
        }else{
            ImageView img=(ImageView)findViewById(R.id.img8);
            img.setImageResource(R.drawable.img_1);
            txt3.setText(resultado);
            y8=8;
        }
comprobar();

    }
    public void cambio9(View vista) {
        String un0=txt3.getText().toString();
        if (un0==resultado) {
            ImageView img=(ImageView)findViewById(R.id.img9);
            img.setImageResource(R.drawable.img);
            txt3.setText(usuario);
            x9=9;
        }else{
            ImageView img=(ImageView)findViewById(R.id.img9);
            img.setImageResource(R.drawable.img_1);
            txt3.setText(resultado);
            y9=9;
        }
comprobar();

    }



}
