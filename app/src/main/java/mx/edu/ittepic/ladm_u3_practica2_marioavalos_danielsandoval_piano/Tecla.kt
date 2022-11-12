package mx.edu.ittepic.ladm_u3_practica2_marioavalos_danielsandoval_piano

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

class Tecla(lienzo: Lienzo, txtTecla:String, teclaColor:Int, sonido:Int,
    left:Float, top:Float, right:Float, bottom:Float) {
    val lienzo = lienzo
    val txtTecla = txtTecla
    var teclaColor = teclaColor
    val sonido = sonido
    val left = left
    val top = top
    val right = right
    val bottom = bottom

    val p = Paint()

    fun pintar(c:Canvas){
        p.color = teclaColor
        c.drawRect(left,top,right,bottom,p)
        p.color = Color.RED
        if(teclaColor==Color.WHITE) {
            p.textSize = 60f
            c.drawText(txtTecla,left+104f,bottom-60f,p)
        }else if (teclaColor==Color.BLACK){
            p.textSize = 50f
            c.drawText(txtTecla,left+57f,bottom-70f,p)
        }
    }

}