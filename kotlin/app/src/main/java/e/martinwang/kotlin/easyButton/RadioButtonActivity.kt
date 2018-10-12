package e.martinwang.kotlin.easyButton

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.lang.Appendable
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.layout_radio.*


/**
 * Created by martinwang on 2018/10/12.
 */
class RadioButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rg_sex.setOnCheckedChangeListener { group, checkedId ->
            tv_sex.text = when (checkedId) {
                R.id.rb_male -> "男孩"
                R.id.rb_female -> "女孩"
                else -> ""
            }
        }

    }
}
