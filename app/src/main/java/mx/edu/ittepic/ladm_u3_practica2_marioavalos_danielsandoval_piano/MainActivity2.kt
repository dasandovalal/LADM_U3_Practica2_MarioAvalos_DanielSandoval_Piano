package mx.edu.ittepic.ladm_u3_practica2_marioavalos_danielsandoval_piano

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(Lienzo(this))
        supportActionBar!!.hide() //Ocultar la barra del titulo
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE //Poner la pantalla horizontal

    }
}