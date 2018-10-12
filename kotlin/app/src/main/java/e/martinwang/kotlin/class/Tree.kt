package e.martinwang.kotlin.`class`

/**
 * Created by martinwang on 2018/10/12.
 */
class Tree(var treeName: String) {
    class Flower(var flowerName: String) {
        fun getName(): String {
            return "这是一朵$flowerName"
        }
    }

    inner class Fruit(var fruitName: String) {
        fun getName(): String {
            return "这是${treeName}长出来的$fruitName"
        }
    }
}