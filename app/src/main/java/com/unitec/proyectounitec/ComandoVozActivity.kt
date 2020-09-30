package com.unitec.proyectounitec


import android.content.Context
import android.os.Bundle
import android.os.VibrationAttributes
import android.os.Vibrator
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.getSystemService
import kotlinx.android.synthetic.main.activity_comando_voz.*

class ComandoVozActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comando_voz)
        setSupportActionBar(findViewById(R.id.toolbar))

          fab.setOnClickListener { view ->
            Snackbar.make(view, "El boton hace que vibre el cel por 3 segundos", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            //POnemos a vibra el cel por 3 segundos
           var vi=   getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
              vi.vibrate(3000)


        }
    }
}