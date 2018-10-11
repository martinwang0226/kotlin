package e.martinwang.kotlin.`class`

import android.content.Context
import org.jetbrains.anko.toast

/**
 * Created by martinwang on 2018/10/11.
 */
class AnimalDefault @JvmOverloads constructor(context: Context, name: String, sex: Int = 0) {
    init {
        var sexName: String = if (sex == 0) "公" else "母"
        context.toast("这只${name}是${sexName}的")
    }
}