package e.martinwang.kotlin.`class`

/**
 * Created by martinwang on 2018/10/11.
 */
class Goose(name:String="鹅",sex:Int = Bird.Male):Bird(name,sex),Behavior{
    override fun fly(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return "鹅能飞一点点,但飞不高也飞不远"
    }

    override fun swim(): String {
         return "鹅鹅鹅"
    }

    override var skilledSports: String= "游泳"
}