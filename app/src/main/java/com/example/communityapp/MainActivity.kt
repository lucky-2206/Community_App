package com.example.communityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.e
import android.widget.Button
import android.widget.EditText
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton:FloatingActionButton = findViewById(R.id.button_addPost)
        addButton.setOnClickListener{
            val intent = Intent(this,AddPost::class.java)
           startActivity(intent)
        }
    }
}