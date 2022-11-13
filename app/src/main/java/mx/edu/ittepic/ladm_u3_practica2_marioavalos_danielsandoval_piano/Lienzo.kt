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
    val DO_S = Tecla(this,"DO#",Color.BLACK,R.raw.c_s,190f,6f,393f,720f)
    val RE = Tecla(this,"RE",Color.WHITE,R.raw.d,289f,6f,569f,1010f)
    val RE_S = Tecla(this,"RE#",Color.BLACK,R.raw.d_s,476f,6f,679f,720f)
    val MI =  Tecla(this,"MI",Color.WHITE,R.raw.e,572f,6f,852f,1010f)
    val FA = Tecla(this,"FA",Color.WHITE,R.raw.f,855f,6f,1135f,1010f)
    val FA_S = Tecla(this,"FA#",Color.BLACK,R.raw.f_s,1027f,6f,1230f,720f)
    val SOL = Tecla(this,"SOL",Color.WHITE,R.raw.g,1138f,6f,1418f,1010f)
    val SOL_S = Tecla(this,"SOL#",Color.BLACK,R.raw.g_s,1313f,6f,1516f,720f)
    val LA = Tecla(this,"LA",Color.WHITE,R.raw.a,1421f,6f,1701f,1010f)
    val LA_S = Tecla(this,"LA#",Color.BLACK,R.raw.a_s,1599f,6f,1802f,720f)
    val SI = Tecla(this,"SI",Color.WHITE,R.raw.b,1704f,6f,1954f,1010f)
    val DO4 = Tecla(this,"DO",Color.WHITE,R.raw.c4,1957f,6f,2237f,1010f)
    var teclaTocada : Tecla? = null

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        c.drawColor(Color.BLACK)

        //Primero pintar las notar blancas
        DO.pintar(c)
        RE.pintar(c)
        MI.pintar(c)
        FA.pintar(c)
        SOL.pintar(c)
        LA.pintar(c)
        SI.pintar(c)
        DO4.pintar(c)

        // Aquí las notas negras
        DO_S.pintar(c)
        RE_S.pintar(c)
        FA_S.pintar(c)
        SOL_S.pintar(c)
        LA_S.pintar(c)

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
                if (RE_S.tocoTecla(event.x,event.y)) {
                    RE_S.reproducirSonido(activity)
                }
                if (MI.tocoTecla(event.x,event.y)) {
                    MI.reproducirSonido(activity)
                }
                if (FA.tocoTecla(event.x,event.y)) {
                    FA.reproducirSonido(activity)
                }
                if (FA_S.tocoTecla(event.x,event.y)) {
                    FA_S.reproducirSonido(activity)
                }
                if (SOL.tocoTecla(event.x,event.y)) {
                    SOL.reproducirSonido(activity)
                }
                if (SOL_S.tocoTecla(event.x,event.y)) {
                    SOL_S.reproducirSonido(activity)
                }
                if (LA.tocoTecla(event.x,event.y)) {
                    LA.reproducirSonido(activity)
                }
                if (LA_S.tocoTecla(event.x,event.y)) {
                    LA_S.reproducirSonido(activity)
                }
                if (SI.tocoTecla(event.x,event.y)) {
                    SI.reproducirSonido(activity)
                }
                if (DO4.tocoTecla(event.x,event.y)) {
                    DO4.reproducirSonido(activity)
                }
            }
        }
        return true
    }
}