package e.martinwang.kotlin.`class`

/**
 * Created by martinwang on 2018/10/11.
 */
abstract class Chicken(name:String,sex:Int,var voice:String) :Bird(name,sex){
    val numberArray:Array<String> = arrayOf("一","二","三")
    abstract fun callOut(times:Int):String
}


