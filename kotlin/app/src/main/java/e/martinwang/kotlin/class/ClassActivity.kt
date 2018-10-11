package e.martinwang.kotlin.`class`

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/11.
 */
class ClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hello.setOnClickListener {
            var animal = Animal()
            tv_hello.text = "简单类的初始化"
        }

        var count: Int = 0
        tv_hello.setOnClickListener {
            when (count % 2) {
                0 -> {
                    var animal = AnimalMain(this, "animalName")
                }
                else -> {
                    var animal = AnimalMain(this, "animalName", 0)
                }
            }
        }

        tv_hello.setOnClickListener {
            when (count % 2) {
                0 -> {
                    var animal = AnimalDefault(this, "animalName")
                }
                else -> {
                    var animal = AnimalDefault(this, "animalName", 0)
                }
            }
        }
    }
}