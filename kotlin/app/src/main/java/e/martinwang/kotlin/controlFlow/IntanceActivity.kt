package e.martinwang.kotlin.controlFlow

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/11.
 */
class IntanceActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countType:Number
        var count:Int = 0
        tv_hello.setOnClickListener {
            count = (count +1)%3
            countType = when(count){
                0->count.toLong()
                1->count.toDouble()
                else ->count.toFloat()
            }
            tv_hello.text= when(countType){
                is Long ->"此恨绵绵无绝期"
                is Double -> "树上的鸟儿成双对"
                else ->"门泊东吴万里船"
            }
        }
    }

}