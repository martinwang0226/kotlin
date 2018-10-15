package e.martinwang.kotlin.easyButton

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import e.martinwang.kotlin.method.DateUtil
import kotlinx.android.synthetic.main.activity_act_response.*

/**
 * Created by martinwang on 2018/10/15.
 */
class ActResponseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_response)
        btn_act_response.setOnClickListener {
            val response = MessageInfo(et_response.text.toString(), DateUtil.nowDateTime)
            val intent = Intent()
            intent.putExtra("message", response)
            setResult(Activity.RESULT_OK, intent)
            finish()

        }

    }
}