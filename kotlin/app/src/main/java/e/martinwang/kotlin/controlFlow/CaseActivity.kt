package e.martinwang.kotlin.controlFlow

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/10.
 */
class CaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var is_odd: Boolean = true
        tv_hello.setOnClickListener {
            tv_hello.text = if (is_odd == true) {
                "凉风有信的谜底是讽"
            } else {
                "秋月无边的谜底是二"
            }
        }

        var count: Int = 0
        tv_hello.setOnClickListener {
            when (count) {
                0 -> tv_hello.text = "凉风有信的谜底为讽"
                1 -> tv_hello.text = "秋月无边的谜底为二"
                else -> tv_hello.text = "好诗"
            }
            count = (count + 1) % 3
        }

        var odd: Int = 0
        var even: Int = 1
        tv_hello.setOnClickListener {
            tv_hello.text = when (count) {
                odd -> "凉风有信的谜底为讽"
                even -> "秋月无边的谜底为二"
                else -> "好诗"
            }
            count = (count +1 ) % 3
        }
    }
}