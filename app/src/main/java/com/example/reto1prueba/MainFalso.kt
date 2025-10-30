package com.example.reto1prueba

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.reto1prueba.entities.User
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await


class MainFalso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val db = FirebaseFirestore.getInstance()
        var usuarios = listOf<User>()

        var antonio = User(false, 777, 0, "manolo", "garcia", "123", "manolo", "12/12/2000", "lastMod")

        findViewById<Button>(R.id.loginButton).setOnClickListener {
            // selectAll(db)

            CoroutineScope(Dispatchers.IO).launch {
                
                /*
                selectAll()?.forEach { user ->
                    println("Hola $user")
                }
                */

                // insert(antonio)
                // delete(db, antonio)

            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


}


