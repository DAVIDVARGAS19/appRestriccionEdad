package com.davidvargas.myfirstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acceso_ok.*


class AccesoOkActivity : AppCompatActivity() {
    var edad: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acceso_ok)

        edad = intent.getIntExtra(Constans.EDAD, 0)
        accesoActiviyOkTvEdad.text = edad.toString()
    }

}
