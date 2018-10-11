package e.martinwang.kotlin.controlFlow

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/11.
 */
class CycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val poemArray: Array<String> = arrayOf("liverpool", "chelsa", "inter", "milan")
        tv_hello.setOnClickListener {
            var poem: String = ""
            for (item in poemArray) {
                poem = "$poem $item,\n"
                tv_hello.text = poem
            }
        }

        tv_hello.setOnClickListener {
            var poem: String = ""
            for (i in poemArray.indices) {
                if (i % 2 == 0) {
                    poem = "$poem${poemArray[i]},\n"
                } else {
                    poem = "$poem${poemArray[i]}.\n"
                }
            }
            tv_hello.text = poem

        }

        tv_hello.setOnClickListener {
            var poem1: String = ""
            var pos: Int = -1
            var count: Int = 0
            while (pos < poemArray.size) {
                pos++
                if (poemArray[pos].isNullOrBlank())
                    continue
                if (count % 2 == 0) {
                    poem1 = "$poem1{poemArray[pos]}，\n"
                } else {
                    poem1 = "$poem1${poemArray[pos]}.\n"
                }
                count++
                if (count == 4)
                    break
            }
            tv_hello.text = poem1

            tv_hello.setOnClickListener {
                var i: Int = 0
                var is_found = false
                outside@ while (i < poemArray.size) {
                    var j: Int = 0
                    var item = poemArray[i]
                    while (j < item.length) {
                        if (item[j] == '-') {
                            is_found = true
                            break@outside
                        }
                        j++
                    }
                    if (is_found)
                        break
                    i++
                }
                tv_hello.text = if (is_found) "我找到-子" else "没有找到一字"
            }

        }

    }
}