package e.martinwang.kotlin.`class`

/**
 * Created by martinwang on 2018/10/11.
 */
open class Bird(var name: String, val sex: Int = 1) {
    var sexName: String

    init {
        sexName = getSexName(sex)
    }

    open protected fun getSexName(sex: Int): String {
        return if (sex == 1) "公" else "母"
    }

    fun getDesc(tag:String):String{
        return "欢迎来到$tag:这只${name}是${sexName}的"
    }

    companion object BirdStatic{
        val Male = 0
        val Female = 1
        val Unknown = -1
        fun judgeSex(sexName: String): Int {
            var sex: Int = when (sexName) {
                "公", "雄" -> Male
                "母", "雌" -> Female
                else -> Unknown
            }
            return sex
        }

    }
}