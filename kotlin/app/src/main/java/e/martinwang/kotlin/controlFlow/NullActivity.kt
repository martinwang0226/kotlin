package e.martinwang.kotlin.controlFlow

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/11.
 */
class NullActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var length: Int = 0

        val strA: String = "非空"
        val strB: String? = null
        val strC: String? = "可空串"

        tv_hello.setOnClickListener {
            length = if (strB != null) strB.length else -1
            tv_hello.text = "字符串B的长度为$length"
        }
        tv_hello.setOnClickListener {
            length = if (strC != null) strC.length else -1
            tv_hello.text = "字符串的长度为$length"
        }

        var length_null:Int?
        tv_hello.setOnClickListener {  }
    }
}