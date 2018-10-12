package e.martinwang.kotlin.`class`

/**
 * Created by martinwang on 2018/10/12.
 */
class WildFlow(name:String,sex:Int=0,behavior: Behavior):Bird(name, sex),Behavior by behavior{

}