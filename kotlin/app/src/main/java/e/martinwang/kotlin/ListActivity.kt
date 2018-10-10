package e.martinwang.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/10.
 */
class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goodsMulList: List<String> = listOf("iPhone8", "Mate10", "小米6", "oppo R11")
        tv_hello.setOnClickListener {
            var desc = ""
            for (i in goodsMulList.indices) {
                val item = goodsMulList[i]
                desc = "${desc}名称:${item}\n"
            }
            tv_hello.text = "手机畅销榜包含以下${goodsMulList.size}款手机:\n$desc"
        }

        var sortAsc = true
        tv_hello.setOnClickListener {
            if (sortAsc) {
                goodsMulList.sortedBy { it.length }
            } else {
                goodsMulList.sortedByDescending { it.length }
            }
        }

        var desc = ""
        for (item in goodsMulList) {
            desc = "${desc}名称:${item}\n"
        }
        tv_hello.text = "手机畅销榜已按照${if (sortAsc) "升序" else "降序"}重新排列:\n$desc"
        sortAsc = !sortAsc
    }
}