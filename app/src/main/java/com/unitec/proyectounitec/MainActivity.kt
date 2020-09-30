package com.unitec.proyectounitec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.ejemplito.*


// El punto de partido  de toda app es la MainActiviy (Presenter)

/*
public class  TarjetaCredito extends Tarjeta{
public TarjetaCredito(){
super();
}
}
 */
class MainActivity : AppCompatActivity() {

    //fun en kotlin es una palabra reservada para implementar o crear una funcion o metodo
    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)

        setContentView(R.layout.ejemplito)
//Vamos a eliminar la barrita de la parte superior del celular, esta barrita se conoce como
        //supportAtionBar
        //compialdor del celular se llama Dalvik (en java es la jvm)
        //Otra cosa hermosa de kotlin es que las sentencias NO TERMINAN EN ;
      supportActionBar?.hide()

        //Aqui vamos a introducir la primer parte de codigo verdaderaamente d kotlin
        botoncito.setOnClickListener{
            //Declaramos una variable de tipo Intent
            // int x;
           // var x=4
            //var z=x*2
            var i= Intent(this,ComandoVozActivity::class.java)

            //Lo invocamos
            startActivity(i)



        }


        

    }
}