package e.martinwang.kotlin.`class`

/**
 * Created by martinwang on 2018/10/11.
 */
class WildAnimal(var name: String, val sex: Int = 0) {
    var sexName: String
    init {
        sexName = if(sex ==0)"公" else "母"
    }
}