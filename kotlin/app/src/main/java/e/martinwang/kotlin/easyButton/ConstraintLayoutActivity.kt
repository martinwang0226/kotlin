package e.martinwang.kotlin.easyButton

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.layout_activity_constraint.*
import org.jetbrains.anko.dip

/**
 * Created by martinwang on 2018/10/12.
 */
class ConstraintLayoutActivity : AppCompatActivity() {

    private var isMoved = false
    private var lastViewId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun addNewView() {
        val tv = TextView(this)
        tv.text = "长按删除该文本"
        val container = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        )

        container.startToStart = lastViewId
        container.topToBottom = lastViewId
        container.topMargin = dip(30)
        tv.layoutParams = container
        tv.setOnLongClickListener { v ->
            cl_content.removeView(v); true
        }
        lastViewId += 1000
        tv.id = lastViewId
        cl_content.addView(tv)
    }

    private fun moveView(){
//        val margin = dip((if(isMoved)) 200 else 20)
    }
}