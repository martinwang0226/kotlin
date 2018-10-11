package e.martinwang.kotlin.controlFlow

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

/**
 * Created by martinwang on 2018/10/11.
 */
class EqualActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloHe = "你好"
        val helloShe = "侬好"
        var isEqual: Boolean = false
        tv_hello.setOnClickListener {
            if (isEqual) {
                tv_hello.text = "比较$helloHe 和 $helloShe 是否相等"
                val result = helloHe == helloShe
                tv_hello.text = "==的比较结果是 $result"
            } else {
                tv_hello.text = "比较$helloHe 和 $helloShe 是否不等"
                val result = helloHe != helloShe
                tv_hello.text = "！ =的比较结果是 $result"
            }
            isEqual = !isEqual
        }

        val date1: Date = Date()
        val date2: Any = date1.clone()
        var count: Int = 0
        tv_hello.setOnClickListener {
            when (count++ % 4) {
                0 -> {
                    tv_hello.text = "比较 date1 和date2 是否结构相等"
                    val result = date1 == date2
                    tv_hello.text = " == 的比较结果是$result"
                }
                1 -> {
                    tv_hello.text = "比较 date1 和 date2 是否结构不等"
                    val result = date1 != date2
                    tv_hello.text = "！ =的比较结果是 $result"
                }
                2 -> {
                    tv_hello.text = "比较 date1 和date 2的引用是否相等"
                    val result = date1 === date2
                    tv_hello.text = "=== 的比较结果是$result"
                }
                else -> {
                    tv_hello.text = "比较 date1和date2是否引用不等"
                    val result = date1 !== date2
                    tv_hello.text = "！==的比较结果是$result"
                }
            }
        }
    }
}