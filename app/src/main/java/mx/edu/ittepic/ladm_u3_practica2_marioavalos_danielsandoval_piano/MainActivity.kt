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

    override fun onRestart() {
        super.onRestart()
        AlertDialog.Builder(this)
            .setTitle("¡FELICIDADES!")
            .setMessage("¡COMPLETASTE LA CANCION!")
            .setPositiveButton("CERRAR"){d,i->}
            .show()
    }
}