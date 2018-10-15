package e.martinwang.kotlin.easyButton

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import e.martinwang.kotlin.method.DateUtil
import kotlinx.android.synthetic.main.activity_act_first.*
import kotlinx.android.synthetic.main.activity_act_request.*
import org.jetbrains.anko.startActivityForResult

/**
 * Created by martinwang on 2018/10/15.
 */
class ActRequestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_request)
        btn_act_request.setOnClickListener {
            val info = MessageInfo(et_request.text.toString(), DateUtil.nowDateTime)
            startActivityForResult<ActResponseActivity>(0, "message" to info)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (data != null) {
            val response = data.extras.getParcelable<MessageInfo>("message")
            tv_request.text = "收到返回对象:\n应答时间为${response.send_time}\n应答内容为${response.content}"
        }
    }
}