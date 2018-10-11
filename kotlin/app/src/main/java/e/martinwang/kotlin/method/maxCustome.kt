package e.martinwang.kotlin.method

/**
 * Created by martinwang on 2018/10/11.
 */
fun <T> Array<T>.maxCustomize(greater: (T, T) -> Boolean): T? {
    var max: T? = null
    for (item in this)
        if (max == null || greater(item, max))
            max = item
    return max

}