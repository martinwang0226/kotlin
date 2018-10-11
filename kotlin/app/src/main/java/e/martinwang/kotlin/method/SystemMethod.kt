package e.martinwang.kotlin.method

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/11.
 */
class SystemMethod() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val array: Array<Double> = arrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
        array.swap(0, 3)
        var count: Int = 0
        var string_array: Array<String> = arrayOf("How", "do", "you", "do", "I'm", "fine")
        tv_hello.setOnClickListener {
            tv_hello.text = when (count % 4) {
                0 -> "字符串数组的默认最大值为${string_array.max()}"
                1 -> "字符串数组按长度比较的最大值为${string_array.maxCustomize({ a, b -> a.length > b.length })}"
                2 -> "字符串数组的默认最大值为${string_array.maxCustomize({ a, b -> a > b })}"
                else -> "字符串数组按去掉空格再比较长度的最大值为${string_array.maxCustomize({ a, b -> a.trim().length > b.trim().length })}"
            }
        }

        tv_hello.setOnClickListener {
            tv_hello.text = "单例对象：" + when (count++ % 5) {
                0 -> "当前日期时间为${DateUtil.nowDateTime}"
                else -> {
                }
            }
        }
    }


}