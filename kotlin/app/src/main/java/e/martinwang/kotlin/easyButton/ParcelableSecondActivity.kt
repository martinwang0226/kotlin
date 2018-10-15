package e.martinwang.kotlin.easyButton

import android.os.Bundle
import e.martinwang.kotlin.R
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_parcelable_second.*

/**
 * Created by martinwang on 2018/10/15.
 */
class ParcelableSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable_second)

        val request = intent.extras.getParcelable<MessageInfo>("message")
        tv_response.text = "收到打包好的请求消息:\n请求时间为${request.send_time}\n请求内容为${request.content}"
    }
}