package e.martinwang.kotlin.method

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/11.
 */
class SpecialMethodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0
        tv_hello.setOnClickListener {
            tv_hello.text = when (count % 3) {
                0 -> appendString<String>("古代的四大发明", "造纸术", "印刷术")
                else -> appendString<Int>("小于10的素数", 2, 3, 5)
            }
        }
        count++

        var string_array: Array<String> = arrayOf("How", "do", "you", "do", "I'm", "fine")
        tv_hello.setOnClickListener {
            tv_hello.text = when (count % 4) {
                0 -> "字符串数组的默认最大值为${string_array.max()}"
                1 -> "字符串数组按长度比较的最大值为${maxCustom<String>(string_array, { a, b -> a.length > b.length })}"
                2 -> "字符串数组的默认最大值为${maxCustom(string_array, { a, b -> a > b })}"
                else -> "字符串数组按去掉空格再比较长度的最大值为${maxCustom(string_array, { a, b -> a.trim().length > b.trim().length })}"
            }
        }
        count++
    }

    var int_array: Array<Int> = arrayOf<Int>(1, 2, 3)

    fun setArrayNumber(array: Array<Number>) {
        var str: String = "数组元素依次排列"
        for (item in array) {
            str = str + item.toString() + ","
        }
        tv_hello.text = str
    }

    inline fun <reified T : Number> setArrayStr(array: Array<T>) {
        var str: String = "数组元素依次排列"
        for (item in array) {
            str = str + item.toString() + ","
        }
        tv_hello.text = str
    }

    fun fractorial(n: Int): Int = if (n <= 1) n else n * fractorial(n - 1)

    tailrec fun findFixPoint(x: Double = 1.0): Double
            = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

    fun <T> maxCustom(array: Array<T>, greater: (T, T) -> Boolean): T? {
        var max: T? = null
        for (item in array)
            if (max == null || greater(item, max))
                max = item
        return max

    }

    fun anonymous(a: String, b: String): Boolean {
        var result: Boolean = a.length > b.length
        return result
    }


}