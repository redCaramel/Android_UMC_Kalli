package com.redcaramel.umc_mission_1

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.redcaramel.umc_mission_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fun makeBlack(a:Int) : Int {
            if(a!=5)binding.textAnger.setTextColor(Color.rgb(67, 69, 73))
            if(a!=4)binding.textTense.setTextColor(Color.rgb(67, 69, 73))
            if(a!=3)binding.textSoso.setTextColor(Color.rgb(67, 69, 73))
            if(a!=2)binding.textDelight.setTextColor(Color.rgb(67, 69, 73))
            if(a!=1)binding.textHappy.setTextColor(Color.rgb(67, 69, 73))
            return a;
        }
        binding.HappyFace.setOnClickListener {
            makeBlack(1)
            binding.textHappy.setTextColor(Color.rgb(255, 239, 182))
            val toast = Toast.makeText(this, "오늘은 어떤 행복한 일이 있었나요?", Toast.LENGTH_SHORT) // in Activity
            toast.show()
        }
        binding.DelightFace.setOnClickListener {
            makeBlack(2)
            binding.textDelight.setTextColor(Color.rgb  (206, 231, 245))
            val toast = Toast.makeText(this, "오늘은 어떤 즐거운 일이 있었나요?", Toast.LENGTH_SHORT) // in Activity
            toast.show()
        }
        binding.SosoFace.setOnClickListener {
            makeBlack(3)
            binding.textSoso.setTextColor(Color.rgb(190, 195, 237))
            val toast = Toast.makeText(this, "때때론 특별한 하루를 보내고 싶지 않은가요?", Toast.LENGTH_SHORT) // in Activity
            toast.show()
        }
        binding.TenseFace.setOnClickListener {
            makeBlack(4)
            binding.textTense.setTextColor(Color.rgb(177, 211, 185))
            val toast = Toast.makeText(this, "무엇이 당신을 불안하게 만드나요?", Toast.LENGTH_SHORT) // in Activity
            toast.show()
        }
        binding.AngerFace.setOnClickListener {
            makeBlack(5)
            binding.textAnger.setTextColor(Color.rgb(235, 139, 139))
            val toast = Toast.makeText(this, "무엇이 당신을 화나게 만들었나요?", Toast.LENGTH_SHORT) // in Activity
            toast.show()
        }
        binding.backButton.setOnClickListener {
            finish()
        }

    }

}