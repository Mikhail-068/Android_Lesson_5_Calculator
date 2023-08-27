package com.example.lesson_5calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button // переменная для обращения к кнопке
    private lateinit var editText1: EditText // переменная для обращения к первому поля ввода
    private lateinit var editText2: EditText // переменная для обращения ко второму поля ввода

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button) // находим кнопку на экране
        editText1 = findViewById(R.id.editTextNumber) // находим первое поле ввода на экране
        editText2 = findViewById(R.id.editTextNumber2) // находим второе поле ввода на экране

        // задаем обработчик нажатий
        button.setOnClickListener {
            // первое число
            val num1 = if (editText1.text.isNotEmpty()) editText1.text.toString().toInt() else 0

            // второе число
            val num2 = if (editText2.text.isNotEmpty()) editText2.text.toString().toInt() else 0

            // вычисляем сумму чисел через функцию
            val sum = calculateSum(num1, num2)

            // выводим результат вычислений на экран через Toast
            Toast.makeText(
                this@MainActivity,
                "сумма введенных чисел = $sum",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

// функция, которая возвращает сумму двух чисел
fun calculateSum(firstNum: Int, secondNum: Int): Int {
    return firstNum + secondNum
}
