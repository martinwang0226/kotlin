package e.martinwang.kotlin.dataType

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/10.
 */
class SetActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val satellites:List<String> = listOf("水星","金星","地球","火星","木星" ,"土星")

        //set
        val goodsMueSet:Set<String> = setOf("iPhone8","Mate10", "小米6","oppo R11")
        tv_hello.setOnClickListener{
            var desc = ""
            for(item in goodsMueSet){
                desc = "${desc}名称:${item}\n"
            }

            tv_hello.text = "手机畅销榜包含以下${goodsMueSet.size}款手机:\n$desc"
        }

        tv_hello.setOnClickListener {
            var desc = ""
            val iterator = goodsMueSet.iterator()
            while (iterator.hasNext()){
                val item = iterator.hasNext()
                desc = "${desc}名称:${item}\n"
            }
            tv_hello.text = "手机畅销榜包含以下${goodsMueSet.size}款手机:\n$desc"
        }

        tv_hello.setOnClickListener {
            var desc =""
            goodsMueSet.forEach{desc = "${desc}名称:${it}\n"}
            tv_hello.text = "手机畅销榜包含以下${goodsMueSet.size}款手机:\n$desc"
        }

    }
}
