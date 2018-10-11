package e.martinwang.kotlin.method

/**
 * Created by martinwang on 2018/10/11.
 */
fun <T> appendString(tag: String, vararg otherInfo: T?): String {
    var str: String = "$tag:"
    for (item in otherInfo) {
        str = "$str${item.toString()}"
    }
    return str
}