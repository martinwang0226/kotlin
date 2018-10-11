package e.martinwang.kotlin.method

/**
 * Created by martinwang on 2018/10/11.
 */
fun <T> Array<T>.swap(pos1: Int, pos2: Int) {
    val tmp = this[pos1]
    this[pos1] = this[pos2]
    this[pos2] = tmp
}