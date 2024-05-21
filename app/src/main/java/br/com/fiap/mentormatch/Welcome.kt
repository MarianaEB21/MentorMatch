package br.com.fiap.mentormatch

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.mentormatch.databinding.ActivityMainBinding

class Welcome : AppCompatActivity(R.layout.welcome) {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val btnLogar: ImageButton = findViewById(R.id.btn_login)
        btnLogar.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }

}