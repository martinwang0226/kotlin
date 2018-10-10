package e.martinwang.kotlin.dataType

import android.os.Bundle
import e.martinwang.kotlin.R
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/10.
 */
class MapActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var goodsMap:Map<String,String> = mapOf("苹果" to "iPhone8","华为" to "Mate 10")
        var goodsMutMap:MutableMap<String,String> = mutableMapOf(Pair("苹果"," iPhone8"),Pair("华为","Mate10"))

        tv_hello.setOnClickListener {
            var desc = ""
            for(item in goodsMutMap){
                desc = "${desc}厂家:${item.key},名称:${item.value}\n"
            }
            tv_hello.text = "手机畅销榜包含以下${goodsMutMap.size}款手机:\n&desc"
        }

        tv_hello.setOnClickListener {
            var desc= ""
            var iterator = goodsMutMap.iterator()
            while (iterator.hasNext()){
                val item = iterator.next()
                desc = "${desc}厂家:${item.key},名称:${item.value}\n"
            }

            tv_hello.text = "手机畅销榜包含以下${goodsMutMap.size}款手机:\n&desc"
        }

        tv_hello.setOnClickListener {
            var desc = ""
            goodsMap.forEach{
                key,value->desc  = "${desc}厂家:${key},名称:${value}\n"
            }
            tv_hello.text = "手机畅销榜包含以下${goodsMutMap.size}款手机:\n&desc"
        }


    }
}