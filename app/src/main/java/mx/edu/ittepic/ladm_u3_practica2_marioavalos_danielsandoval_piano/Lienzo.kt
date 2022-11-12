package mx.edu.ittepic.ladm_u3_practica2_marioavalos_danielsandoval_piano

import android.app.Activity
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(activity: Activity):View(activity) {

    val DO = Tecla(this,"DO",Color.WHITE,R.raw.c,6f,6f,286f,1010f)

    val p = Paint()

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        c.drawColor(Color.BLACK)

        DO.pintar(c)

        /*//DO
        p.color = Color.WHITE
        c.drawRect(6f,6f,286f,1010f,p) //TECLA
        p.color = Color.BLACK
        p.style = Paint.Style.STROKE
        p.strokeWidth = 6f
        c.drawRect(3f,3f,289f,1013f,p) //CONTORNO
        p.color = Color.RED
        p.style = Paint.Style.FILL
        p.textSize = 60f
        c.drawText("DO",110f,950f,p) //TEXTO

         */


        //RE
        p.color = Color.WHITE
        c.drawRect(289f,6f,569f,1010f,p) //TECLA
        p.color = Color.BLACK
        p.style = Paint.Style.STROKE
        p.strokeWidth = 6f
        c.drawRect(292f,3f,572f,1013f,p) //CONTORNO
        p.color = Color.RED
        p.style = Paint.Style.FILL
        p.textSize = 60f
        c.drawText("RE",393f,950f,p) //TEXTO

        //DO#
        p.color = Color.BLACK
        c.drawRect(190f,6f,393f,720f,p) //TECLA
        p.color = Color.RED
        p.textSize = 50f
        c.drawText("DO#",247f,650f,p) //TEXTO


    }
}