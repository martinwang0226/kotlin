package e.martinwang.kotlin.method

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/11.
 */
class MethodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hello.setOnClickListener {
            getDinnerCanNull(2, 111.111, null, 1000f)
        }
    }

    fun getDinnerEmpty() {
        tv_hello.text = "hello"
    }

    fun getDinnerInput(egg: Int, leek: Double, water: String, shell: Float) {
        tv_hello.text = "$egg"
    }

    fun getDinnerCanNull(egg: Int, leek: Double, water: String?, shell: Float) {

    }

    fun getDinnerOutput(): String {
        var dinner: String = "巧妇难为无米之炊"
        return dinner
    }

    fun getFourBigDefault(general: String, first: String = "造纸术"): String {
        var answer: String = "$general:$first"
        return answer
    }

    fun getFourBigVararg(general: String,first: String="造纸术",vararg  otherArray:String?):String{
        var answer:String = "$general:$first"
        for (item in otherArray){
            answer = "$answer,$item"
        }
        return answer
    }

    fun getFourBigArray(general: String,first: String="造纸术",vararg otherArray:Array<String>):String{
        var  answer:String = "$general:$first"
        for(array in otherArray){
            for(item in array){
                answer = "$answer,$item"
            }
        }
        return answer
    }
}