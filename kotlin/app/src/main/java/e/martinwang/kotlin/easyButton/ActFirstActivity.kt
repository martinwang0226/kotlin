package e.martinwang.kotlin.easyButton

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import e.martinwang.kotlin.method.DateUtil
import kotlinx.android.synthetic.main.activity_act_first.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.newTask
import org.jetbrains.anko.startActivity

/**
 * Created by martinwang on 2018/10/15.
 */
class ActFirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity<ActSecondActivity>(
                Pair("request_time", DateUtil.nowDateTime),
                Pair("request_content", et_request_first.text.toString())
        )

        btn_act_flag.setOnClickListener {
            val intent = intentFor<ActSecondActivity>(
                    Pair("request_time", DateUtil.nowDateTime),
                    Pair("request_content", et_request_first.text.toString())
            )
            startActivity(intent.newTask())
        }
    }


}