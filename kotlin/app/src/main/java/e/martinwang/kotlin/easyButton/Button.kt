package e.martinwang.kotlin.easyButton

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast


/**
 * Created by martinwang on 2018/10/12.
 */
class Button :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_hello.setOnClickListener { v->
            toast("您点击了控件 : ${(v as Button)}.text")
        }
    }
}