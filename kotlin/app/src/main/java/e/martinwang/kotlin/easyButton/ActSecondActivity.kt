package e.martinwang.kotlin.easyButton

import android.os.Bundle
import e.martinwang.kotlin.R
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_act_second.*

/**
 * Created by martinwang on 2018/10/15.
 */
class ActSecondActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_second)
        var budle = intent.extras
        var request_time = budle.getString("request_time")
        var request_content = budle.getString("request_content")
        tv_response.text = "收到请求信息:\n请求时间为${request_time}\n请求内容为${request_content}"

    }
}