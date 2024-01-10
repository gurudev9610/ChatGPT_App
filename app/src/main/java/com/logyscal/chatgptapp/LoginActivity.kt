package com.logyscal.chatgptapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editTextLoginEmail: EditText = findViewById(R.id.editTextLoginEmail)
        val editTextLoginPassword: EditText = findViewById(R.id.editTextLoginPassword)
        val buttonLogin: Button = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val email = editTextLoginEmail.text.toString()
            val password = editTextLoginPassword.text.toString()
            // Implement your actual login logic here (e.g., validate against stored credentials)

        }

    }

}
