package e.martinwang.kotlin.`class`

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*


/**
 * Created by martinwang on 2018/10/12.
 */
class SpecialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hello.setOnClickListener {
            val peachBlossom = Tree.Flower("桃花")
            tv_hello.text = peachBlossom.getName()
        }


        tv_hello.setOnClickListener {
            val peach = Tree("桃树").Fruit("桃子")
            tv_hello.text = peach.getName()
        }

        var count: Int = 0
        tv_hello.setOnClickListener {
            if (count % 2 == 0) {
                tv_hello.text = when (count++ % 4) {
                    SeasonType.Spring.ordinal -> SeasonType.Spring.name
                    SeasonType.Summer.ordinal -> SeasonType.Summer.name
                    SeasonType.Autumn.ordinal -> SeasonType.Autumn.name
                    SeasonType.Winter.ordinal -> SeasonType.Winter.name
                    else -> "未知"
                }
            } else {
                tv_hello.text = when (count++ % 4) {
                    SeasonName.Spring.ordinal -> SeasonName.Spring.seasonName
                    SeasonName.Summer.ordinal -> SeasonName.Summer.seasonName
                    SeasonName.Autumn.ordinal -> SeasonName.Autumn.seasonName
                    SeasonName.Winter.ordinal -> SeasonName.Winter.seasonName
                    else -> "未知"
                }
            }
        }

        tv_hello.setOnClickListener {
            var season = when (count++ % 4) {
                0 -> SeasonSealed.Spring("春天")
                1 -> SeasonSealed.Summer("夏天")
                2 -> SeasonSealed.Autumn("秋天")
                else -> SeasonSealed.Winter("冬天")
            }

            tv_hello.text = when (season) {
                is SeasonSealed.Spring -> season.name
                is SeasonSealed.Summer -> season.name
                is SeasonSealed.Autumn -> season.name
                is SeasonSealed.Winter -> season.name
            }
        }

        var lotus = Plant("莲","莲藕","莲花","莲叶","莲蓬","链子")
        var lotus2 = lotus.copy()
        tv_hello.setOnClickListener {
            lotus2 = when(count++%2){
                0->lotus.copy(flower = "莲花")
                else ->lotus.copy(flower = "荷花")
            }
        }

        var result =if(lotus2.equals(lotus)) "相等" else "不等"
            tv_hello.text = "两个植物的比较结果是${result}\n"+
                    "第一个植物的描述是${lotus.toString()}"+
                    "第二个植物的描述是${lotus2.toString()}"

        tv_hello.setOnClickListener {
            var river = when(count++ %4){
                0 ->River<Int>("小溪",100)
                1 ->River<Float>("瀑布",99.9f)
                else ->River("大河","一千")


            }
            tv_hello.text = river.getInfo()
        }

    }

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


}