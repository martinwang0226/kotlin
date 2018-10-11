package e.martinwang.kotlin.method

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by martinwang on 2018/10/11.
 * 时间扩展方法
 */
fun Date.getNowDateTime(): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    return sdf.format(this)
}
