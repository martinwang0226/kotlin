package e.martinwang.kotlin.easyButton

import android.os.Bundle
import e.martinwang.kotlin.R
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.method.DateUtil
import kotlinx.android.synthetic.main.activity_act_first.*
import org.jetbrains.anko.startActivity

/**
 * Created by martinwang on 2018/10/15.
 */
class ParcelableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable_first)
        btn_act_request.setOnClickListener {
            val request = MessageInfo(et_request.text.toString(), DateUtil.nowDateTime)
            startActivity<ParcelableSecondActivity>("message" to request)
        }
    }
}