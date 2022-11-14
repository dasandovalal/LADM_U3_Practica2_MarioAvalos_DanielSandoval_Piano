package mx.edu.ittepic.ladm_u3_practica2_marioavalos_danielsandoval_piano

import android.app.AlertDialog
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide() //Ocultar la barra del titulo
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE //Poner la pantalla horizontal

        var piano = Intent(this,MainActivity2::class.java)

        AlertDialog.Builder(this)
            .setTitle("Version BETA")
            .setMessage("A veces el audio se deja de esuchar :(\nFavor de reiniciar en ese caso")
            .setPositiveButton("CERRAR"){d,i->}
            .show()

        btnJuegoLibre.setOnClickListener {

            piano.putExtra("CANCION", "")
            startActivity(piano)
        }

        btnCorderito.setOnClickListener {
            piano.putExtra("CANCION", "CORDERITO")
            startActivity(piano)
        }
        btnEstrellita.setOnClickListener {
            piano.putExtra("CANCION", "ESTRELLITA")
            startActivity(piano)

        }


    }

    /*fun setCancionTerminada(){
        cancionTerminada = true
    }

    override fun onRestart() {
        super.onRestart()
        if (cancionTerminada) {
            AlertDialog.Builder(this)
                .setTitle("¡FELICIDADES!")
                .setMessage("¡COMPLETASTE LA CANCION!")
                .setPositiveButton("CERRAR") { d, i -> }
                .show()
        }
        cancionTerminada=false
    }

     */
}