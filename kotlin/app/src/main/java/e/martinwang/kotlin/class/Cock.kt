package e.martinwang.kotlin.`class`

/**
 * Created by martinwang on 2018/10/11.
 */
class Cock(name: String = "鸡", sex: Int = Bird.Male, voice: String = "喔喔喔") : Chicken(name, sex, voice) {
    override fun callOut(times: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        var count = when {
            times <= 0 -> 0
            times >= 10 -> 9
            else -> times
        }
        return "$sexName$name${voice}叫了${numberArray[count]}声,原来踏在报晓呀"
    }
}