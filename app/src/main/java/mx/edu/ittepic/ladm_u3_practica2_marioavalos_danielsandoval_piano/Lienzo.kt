package mx.edu.ittepic.ladm_u3_practica2_marioavalos_danielsandoval_piano

import android.app.Activity
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.View

class Lienzo(activity: Activity):View(activity) {

    val activity = activity

    val DO = Tecla(this,"DO",Color.WHITE,R.raw.c,6f,6f,286f,1010f)
    val RE = Tecla(this,"RE",Color.WHITE,R.raw.d,289f,6f,569f,1010f)
    val DO_S = Tecla(this,"DO#",Color.BLACK,R.raw.c_s,190f,6f,393f,720f)

    val P = Paint()
    var teclaTocada : Tecla? = null

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        c.drawColor(Color.BLACK)

        //Primero pintar las notar blancas
        DO.pintar(c)
        RE.pintar(c)

        // Aquí las notas negras
        DO_S.pintar(c)

        /*//RE
        p.color = Color.WHITE
        c.drawRect(289f,6f,569f,1010f,p) //TECLA
        p.color = Color.BLACK
        p.style = Paint.Style.STROKE
        p.strokeWidth = 6f
        c.drawRect(292f,3f,572f,1013f,p) //CONTORNO
        p.color = Color.RED
        p.style = Paint.Style.FILL
        p.textSize = 60f
        c.drawText("RE",393f,950f,p) //TEXTO*/

        /*//DO#
        p.color = Color.BLACK
        c.drawRect(190f,6f,393f,720f,p) //TECLA
        p.color = Color.RED
        p.textSize = 50f
        c.drawText("DO#",247f,650f,p) //TEXTO*/


    }

    override fun onTouchEvent(event: MotionEvent): Boolean {

        when(event.action){
            MotionEvent.ACTION_DOWN->{
                //Saber qué tecla se presionó y sonar
                if (DO_S.tocoTecla(event.x,event.y)) {
                    DO_S.reproducirSonido(activity)
                }
                if (DO.tocoTecla(event.x,event.y)) {
                    DO.reproducirSonido(activity)
                }
                if (RE.tocoTecla(event.x,event.y)) {
                    RE.reproducirSonido(activity)
                }

            }
        }

        return true
    }
}