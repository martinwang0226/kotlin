package e.martinwang.kotlin.method

import java.text.SimpleDateFormat

/**
 * Created by martinwang on 2018/10/11.
 * kotlin中的单例
 */

object DateUtil{
    val nowDateTime:String
        get(){
            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            return sdf.format(this)
        }
}
