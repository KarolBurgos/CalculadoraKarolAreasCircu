package com.example.sistemas.calculadorakarol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText e1,e2, e3;
    private TextView t1,t2,t3,t4;
    private RadioButton r1,r2, r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.editText6);
        e2=(EditText)findViewById(R.id.editText5);
        e3=(EditText)findViewById(R.id.editText4);
        t1=(TextView)findViewById(R.id.textView3);

        t2=(TextView)findViewById(R.id.textView);
        t3=(TextView)findViewById(R.id.textView4);
        t4=(TextView)findViewById(R.id.textView5);



        r1=(RadioButton)findViewById(R.id.circulo);
        r2=(RadioButton)findViewById(R.id.rectangulo);
        r3=(RadioButton)findViewById(R.id.triangulo);

    }
    public void acercade(View view){
    Intent i=new Intent (this,AcercaDe.class);
        startActivity(i);
    }

    public void operar(View view){

        if(r1.isChecked()==true)
        {double pi=Math.PI;
            String valor1=e3.getText().toString();
            int nr1=Integer.parseInt(valor1);

            if(nr1<0)
            {
                Toast toas= Toast.makeText(view.getContext(),"El numero debe ser mayor a cero",Toast.LENGTH_LONG);
                toas.show();
            }else
            if(nr1>0)
            {
                double area= pi*(nr1^2);
                String resu=String.valueOf("El area del circulo es:"+area);
                Toast toas= Toast.makeText(view.getContext(),resu,Toast.LENGTH_LONG);
                toas.show();
            }
           // Toast.makeText(view.getContext(), R.string.MainMenuActicityDescripcion, Toast.LENGTH_SHORT).show();


        } else
        if(r2.isChecked()==true)
        {
            String valor2=e1.getText().toString();
            String valor3=e2.getText().toString();
            int nr2=Integer.parseInt(valor2);
            int nr3=Integer.parseInt(valor3);
            int area=nr2*nr3;
            String resu=String.valueOf("El area del rectangulo es: "+area);
            Toast toast=Toast.makeText(this,resu,Toast.LENGTH_LONG);
            toast.show();

        }else
        if(r3.isChecked()==true)
        {
            String valor3=e1.getText().toString();
            String valor4=e2.getText().toString();
            int nr3=Integer.parseInt(valor3);
            int nr4=Integer.parseInt(valor4);
            int area=(nr3*nr4)/2;
            String resu=String.valueOf("El area del triangulo es: "+area);
            Toast toas=Toast.makeText(this,resu,Toast.LENGTH_LONG);
            toas.show();

        }
    }
    public void ocultar(View view)
    {
        //circulo
        if(r1.isChecked()==true)
        {
            e1.setVisibility(View.GONE);
            e2.setVisibility(View.GONE);
            e1.setVisibility(View.GONE);
            e2.setVisibility(View.GONE);
            t2.setVisibility(View.GONE);
            t3.setVisibility(View.GONE);
            e3.setVisibility(View.VISIBLE);

        }else
            //rectangulo
        if(r2.isChecked()==true){

            e3.setVisibility(view.GONE);
            e1.setVisibility(View.VISIBLE);
            e2.setVisibility(View.VISIBLE);
            t2.setVisibility(View.GONE);
            t3.setVisibility(View.GONE);

            t2.setVisibility(View.VISIBLE);
            t3.setVisibility(View.VISIBLE);
        }else
            //triangulo
        if(r3.isChecked()==true)
        {
            e3.setVisibility(view.GONE);
            e1.setVisibility(View.VISIBLE);
            e2.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
            t3.setVisibility(View.VISIBLE);
        }

    }

}
