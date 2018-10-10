package e.martinwang.kotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/10.
 */
class DataTypeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i: Int = 0
        val origin: Float = 65.0f


        var int_array: IntArray = intArrayOf(1, 2, 3)
        var string_array: Array<String> = arrayOf("How", "are", "you")

        var string_array1: Array<String> = arrayOf("How", "are", "you")
        tv_hello.setOnClickListener({
            var str: String = ""
            var i: Int = 0
            while (i < string_array1.size) {
                str = str + string_array1[i] + " ,"
                i++
            }
            tv_hello.text = str
        })

        

    }
}
