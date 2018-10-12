package e.martinwang.kotlin.`class`

/**
 * Created by martinwang on 2018/10/11.
 */
class BehaviorFly : Behavior {
    override fun fly(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return "翱翔天空"
    }

    override fun swim(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return "游泳起来"
    }

    override fun run(): String {
        return "能飞干嘛还要走"
    }

    override var skilledSports: String = "飞翔"
}