package com.alexp.socialnetworkclient.ui.screens.myprofile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.alexp.socialnetworkclient.databinding.ActivityMyprofileBinding
import com.alexp.socialnetworkclient.utils.applyWindowInsets

class MyProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyprofileBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMyprofileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.root.applyWindowInsets()
    }
}