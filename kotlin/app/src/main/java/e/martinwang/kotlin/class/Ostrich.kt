package e.martinwang.kotlin.`class`

import java.text.Bidi

/**
 * Created by martinwang on 2018/10/11.
 */
class Ostrich(name:String = "鸵鸟",sex:Int = Bird.Male) : Bird(name,sex){
    override public fun getSexName(sex: Int): String {
        return if(sex==Bird.Male)"雄" else "雌"
    }
}
