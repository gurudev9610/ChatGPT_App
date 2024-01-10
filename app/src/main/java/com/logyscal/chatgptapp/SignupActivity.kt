package com.logyscal.chatgptapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val editTextEmail: EditText = findViewById(R.id.editTextEmail)
        val editTextPassword: EditText = findViewById(R.id.editTextPassword)
        val editTextConfirmPassword: EditText = findViewById(R.id.editTextConfirmPassword)
        val buttonSignup: Button = findViewById(R.id.buttonSignup)

        buttonSignup.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()
            val confirmPassword = editTextConfirmPassword.text.toString()

            if (isValidEmail(email) && isValidPassword(password) && password == confirmPassword) {
                // Actual signup logic (e.g., send data to server, save to database)

                // For simplicity, just move to the login page after successful signup
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            } else {
                // Handle invalid input
            }
        }
    }

    private fun isValidEmail(email: String): Boolean {
        // Implement your email validation logic here
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isValidPassword(password: String): Boolean {
        // Implement your password validation logic here
        return password.length >= 6
    }
}