package e.martinwang.kotlin.`class`

/**
 * Created by martinwang on 2018/10/11.
 */
interface Behavior {
    open abstract fun fly(): String
    fun swim(): String
    fun run(): String {
        return "大多数鸟儿跑得并不像样，只有鸵鸟等少数鸟类才擅长奔跑"
    }

    var skilledSports: String
}
