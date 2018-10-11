package e.martinwang.kotlin.`class`

import android.content.Context
import org.jetbrains.anko.toast
import java.security.AccessControlContext

/**
 * Created by martinwang on 2018/10/11.
 */
class AnimalMain {
    constructor(context: Context, name: String) {
        context.toast("这是只$name")
    }

    constructor(context: Context, name: String, sex: Int) : this(context, name) {
        var sexName: String = if (sex == 0) "公" else " 母"
        context.toast("这只 ${name}是${sexName} 的")
    }
}