package com.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


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

        setContentView(R.layout.activity_main)

        

    }
}