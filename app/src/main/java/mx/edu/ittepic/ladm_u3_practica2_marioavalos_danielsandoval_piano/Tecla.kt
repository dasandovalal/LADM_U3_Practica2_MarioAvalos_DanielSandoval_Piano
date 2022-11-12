package mx.edu.ittepic.ladm_u3_practica2_marioavalos_danielsandoval_piano

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

class Tecla(lienzo: Lienzo, txtTecla:String, teclaColor:Int, sonido:Int,
    left:Float, top:Float, right:Float, bottom:Float) {
    val LIENZO = lienzo
    val TXT_TECLA = txtTecla
    var teclaColor = teclaColor
    val SONIDO = sonido
    val LEFT = left
    val TOP = top
    val RIGHT = right
    val BOTTOM = bottom

    val P = Paint()

    fun pintar(c:Canvas){
        P.color = teclaColor
        c.drawRect(LEFT,TOP,RIGHT,BOTTOM,P)
        P.color = Color.RED
        if(teclaColor==Color.WHITE) {
            P.textSize = 60f
            c.drawText(TXT_TECLA,LEFT+104f,BOTTOM-60f,P)
        }else if (teclaColor==Color.BLACK){
            P.textSize = 50f
            c.drawText(TXT_TECLA,LEFT+57f,BOTTOM-70f,P)
        }
    }

}