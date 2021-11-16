package com.example.golfScore

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.golfScore.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val minus : Button = findViewById(R.id.minus);
        val plus : Button = findViewById(R.id.plus);
        val reset : Button = findViewById(R.id.reset);
        val resultView : TextView = findViewById(R.id.result);
        // 마이너스 버튼
        minus.setOnClickListener{
            val currentScore : Int = Integer.parseInt(resultView.text.toString());
            resultView.text = (currentScore - 1).toString()
        }
        // 플러스 버튼
        plus.setOnClickListener{
            val currentScore : Int = Integer.parseInt(resultView.text.toString());
            resultView.text = (currentScore + 1).toString();
        }
        // 리셋 버튼
        reset.setOnClickListener{
            resultView.text = 0.toString();
        }
    }
}