package quisbert.jose.carlos.calculadoraunifranz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {
private TextView resultado;
    private EditText dato1,dato2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //recuperamos los datos  de la pantalla de diseño
        dato1=(EditText) findViewById(R.id.primerDato);
        dato2=(EditText) findViewById(R.id.segundoDato);
    }
    public void sumar(View v){
        //convertimos a numeros los valores introducidos y sumamos
        int n1=Integer.parseInt(dato1.getText().toString());
        int n2=Integer.parseInt(dato2.getText().toString());
        int sum=n1+n2;
        mostrar(sum);
    }
    public void restar(View v){
        //convertimos a numeros los valores introducidos y sumamos
        int n1=Integer.parseInt(dato1.getText().toString());
        int n2=Integer.parseInt(dato2.getText().toString());
        int sum=n1-n2;
        mostrar(sum);
    }
    public void multiplicar(View v){
        //convertimos a numeros los valores introducidos y sumamos
        int n1=Integer.parseInt(dato1.getText().toString());
        int n2=Integer.parseInt(dato2.getText().toString());
        int sum=n1*n2;
        mostrar(sum);
    }
    public void dividir(View v){
        //convertimos a numeros los valores introducidos y sumamos
        int n1=Integer.parseInt(dato1.getText().toString());
        int n2=Integer.parseInt(dato2.getText().toString());
        int sum=n1/n2;
        mostrar(sum);
    }
    private void mostrar(double res){
        Toast.makeText(this,"Resultado de la operacion es : "+res,Toast.LENGTH_LONG).show();
    }
}
