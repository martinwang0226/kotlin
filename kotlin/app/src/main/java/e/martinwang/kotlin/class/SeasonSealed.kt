package e.martinwang.kotlin.`class`

/**
 * Created by martinwang on 2018/10/12.
 */
sealed class SeasonSealed{
    class Spring(var name:String):SeasonSealed()
    class Summer(var name:String):SeasonSealed()
    class Autumn(var name:String):SeasonSealed()
    class Winter(var name:String):SeasonSealed()
}