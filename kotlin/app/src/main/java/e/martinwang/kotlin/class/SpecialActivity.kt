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
                    else->"未知"
                }
            }
        }
    }


}