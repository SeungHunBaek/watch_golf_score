
package com.example.golfScore

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
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
        val background : LinearLayout = findViewById(R.id.background)

        // 마이너스 버튼
        minus.setOnClickListener{
            val currentScore : Int = Integer.parseInt(resultView.text.toString()) - 1;
            resultView.text = currentScore.toString();
            background.setBackgroundResource(getImage(currentScore));
        }
        // 플러스 버튼
        plus.setOnClickListener{
            val currentScore : Int = Integer.parseInt(resultView.text.toString()) + 1;
            resultView.text = currentScore.toString();
            background.setBackgroundResource(getImage(currentScore));
        }
        // 리셋 버튼
        reset.setOnClickListener{
            resultView.text = 0.toString();
            background.setBackgroundResource(getImage(0));
        }
    }

    private fun getImage(currentScore: Int): Int {
        when (currentScore) {
            0 -> {
                return R.drawable.cnt0
            }
            1 -> {
                return R.drawable.cnt1
            }
            2 -> {
                return R.drawable.cnt2
            }
            3 -> {
                return R.drawable.cnt3
            }
            4 -> {
                return R.drawable.cnt4
            }
            5 -> {
                return R.drawable.cnt5
            }
            6 -> {
                return R.drawable.cnt6
            }
            7 -> {
                return R.drawable.cnt7
            }
            8 -> {
                return R.drawable.cnt8
            }
            9 -> {
                return R.drawable.cnt9
            }
            else -> {
                return R.drawable.cnt10
            }
        }
    }
}