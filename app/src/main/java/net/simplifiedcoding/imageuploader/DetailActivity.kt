package net.simplifiedcoding.imageuploader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val nik = intent.getStringExtra("nik")
        val nama = intent.getStringExtra("nama")
        val confidence = intent.getStringExtra("confidence")

        nik_value.text = nik
        nama_value.text = nama
        confidence_value.text = confidence
    }
}
