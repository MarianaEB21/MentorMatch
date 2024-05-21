package br.com.fiap.mentormatch

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Register: AppCompatActivity(R.layout.register) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        val btnRegisterDone: ImageButton = findViewById(R.id.btn_register_done);
        btnRegisterDone.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }

}