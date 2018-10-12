package e.martinwang.kotlin.`class`

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by martinwang on 2018/10/11.
 */
class ClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hello.setOnClickListener {
            var animal = Animal()
            tv_hello.text = "简单类的初始化"
        }

        var count: Int = 0
        tv_hello.setOnClickListener {
            when (count % 2) {
                0 -> {
                    var animal = AnimalMain(this, "animalName")
                }
                else -> {
                    var animal = AnimalMain(this, "animalName", 0)
                }
            }
        }

        tv_hello.setOnClickListener {
            when (count % 2) {
                0 -> {
                    var animal = AnimalDefault(this, "animalName")
                }
                else -> {
                    var animal = AnimalDefault(this, "animalName", 0)
                }
            }
        }

        tv_hello.setOnClickListener {
            val animal = when (count % 2) {
                0 -> WildAnimal("animalName")
                else -> WildAnimal("animalName", 0)
            }
            tv_hello.text = "这只${animal.name} 是${if (animal.sex == 0) "公" else "母"}的"
        }

        tv_hello.setOnClickListener {
            val animal = when (count % 2) {
                0 -> WildAnimal("animalName")
                else -> WildAnimal("animalName", 0)
            }
            tv_hello.text = "这只${animal.name} 是${animal.sexName}的"
        }

        tv_hello.setOnClickListener {
            val animal = when (count % 2) {
                0 -> WildAnimalFunction("animalName")
                else -> WildAnimalFunction("animalName", 0)
            }
            tv_hello.text = animal.getDesc("动物园")
        }

        val sexArray: Array<String> = arrayOf("公", "母", "雄", "雌")
        tv_hello.setOnClickListener {
            var sexName: String = sexArray[count++ % 4]
            tv_hello.text = "\"$sexName\"对应的类型是${WildAnimalCompanion.WildAnimal.judgeSex(sexName)}"

        }

        tv_hello.setOnClickListener {
            var sexBird = if (count++ % 3 == 0) Bird.Male else Bird.Female
            var duck = Duck(sex = sexBird)
            tv_hello.text = duck.getDesc("鸟语林")
        }

        tv_hello.setOnClickListener {
            var sexBird = if (count++ % 3 == 0) Bird.Male else Bird.Female
            var ostrich = Ostrich(sex = sexBird)
            tv_hello.text = ostrich.getDesc("鸟语林")
        }

        tv_hello.setOnClickListener {
            tv_hello.text = Cock().callOut(count++ % 10)
        }

        tv_hello.setOnClickListener {
            tv_hello.text = when (count++ % 3) {
                0 -> Goose().fly()
                1 -> Goose().swim()
                else -> Goose().run()
            }
        }

        tv_hello.setOnClickListener {
            var fowl = when (count++ % 6) {
                0 -> WildFlow("老鹰", Bird.Male, BehaviorFly())
                1 -> WildFlow("凤凰", behavior = BehaviorFly())
                else -> WildFlow("企鹅", behavior = BehaviorFly())
            }

            var action = when (count % 11) {
                in 0..3 -> fowl.fly()
                4, 7, 10 -> fowl.swim()
                else -> fowl.run()

            }
            tv_hello.text = "${fowl.name}:$action"
        }
    }
}