package br.com.fiap.mentormatch

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.mentormatch.databinding.ActivityMainBinding

class Welcome : AppCompatActivity(R.layout.welcome) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val btnLogar: ImageButton = findViewById(R.id.btn_login)
        val btnRegister: ImageButton = findViewById(R.id.btn_register);

        btnLogar.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        btnRegister.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }

}