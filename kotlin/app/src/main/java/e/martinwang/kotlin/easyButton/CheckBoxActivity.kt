package e.martinwang.kotlin.easyButton

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_checkbox.*

/**
 * Created by martinwang on 2018/10/12.
 */
class CheckBoxActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)
        checkBox.isChecked =false
        checkBox.setOnCheckedChangeListener{buttonView, isChecked ->
            tv_hello.text ="您${if(isChecked) "勾选" else "取消勾选"} 了复选框"
        }

    }
}