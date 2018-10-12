package e.martinwang.kotlin.`class`

/**
 * Created by martinwang on 2018/10/12.
 */
class River<T>(var name: String, var length: T) {
    fun getInfo(): String {
        var unit: String = when (length) {
            is String -> "米"
            is Number -> "m"
            else -> ""
        }
        return "${name}的长度是$length$unit"
    }
}