package stringbox.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.async
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        test()

        val arrayListOf = (0 until 50).map { "" + it }
        Log.e("xxxxx3", "arrayListOf:" + arrayListOf)
//        test1()
//        test2()
//        test3()
//        test4()
//        test5()
//        test6()
//        test7()
//        test8()
//        test9()
//        test10()
//        test11()
//        test12()
//        test13()
//        test14()
//        test15()
//        println(test16("222", 15, true))
//        println(test17())
//        println(test18(b = 110))
//        println(test19(100,"qwe","trtytr","pppp"))
//        println(test20(200, arrayOf("qwe","trtytr","pppp"), arrayOf("asd","xxxx","21321")))
//        println(test21<String>(220, "qwe","4444","pppp", "asd","xxxx","21321"))
//        test22()
//        test23()
//        test24()
//        test25()
//        test26()
//        test27()
//        test28()
//        test29()
//        test30()
//        test31()
        test32()
    }

    /**
     * 单例
     */
    private fun test32() {
        Single.name = "张三"
        println(Single.name)
    }

    /**
     * 模版类
     */
    private fun test31() {
        var river = when (4) {
        //模板类(泛型类)声明对象时，要在模板类的类名后面加上“<参数类型>”
            0 -> River<Int>("小溪", 100)
        //如果编译器根据输入参数就能知晓参数类型，也可直接省略“<参数类型>”
            1 -> River("瀑布", 99.9f)
        //当然保守起见，新手最好按规矩添加“<参数类型>”
            2 -> River<Double>("山涧", 50.5)
        //如果你已经是老手了，怎么方便怎么来，Kotlin的设计初衷就是偷懒
            else -> River("大河", "一千")
        }
    }

    /**
     * 数据类(bean类)
     */
    private fun test30() {
        val plant = Plant("张三", 13)
        plant.toString()
        val copy = plant.copy()// 复制对象
    }

    /**
     * 密封类
     */
    private fun test29() {
        var season = when (4) {
            0 -> SeasonSealed.Spring("春天")
            1 -> SeasonSealed.Summer("夏天")
            2 -> SeasonSealed.Autumn("秋天")
            else -> SeasonSealed.Winter("冬天")
        }
        //密封类是一种严格的枚举类，它的值是一个有限的集合。
        //密封类确保条件分支覆盖了所有的枚举类型，因此不再需要else分支
        val value = when (season) {
            is SeasonSealed.Spring -> season.name
            is SeasonSealed.Summer -> season.name
            is SeasonSealed.Autumn -> season.name
            is SeasonSealed.Winter -> season.name
        }
    }

    /**
     * 枚举类
     */
    private fun test28() {
        SeasonType.AUTUMN
        SeasonName.SUMMER
        //枚举类的构造函数是给枚举类型使用的，外部不能直接调用枚举类的构造函数
        //SeasonName("未知").name
        when (4) {
        //使用自定义属性seasonName表示更个性化的描述
            SeasonName.SPRING.ordinal -> SeasonName.SPRING.seasonName
            SeasonName.SUMMER.ordinal -> SeasonName.SUMMER.seasonName
            SeasonName.AUTUMN.ordinal -> SeasonName.AUTUMN.seasonName
            SeasonName.WINTER.ordinal -> SeasonName.WINTER.seasonName
            else -> "未知"
        }
    }

    /**
     * 嵌套类,内部类
     */
    private fun test27() {
        Tree.Flower("牡丹").getName()// 嵌套类
        Tree("桃树").Fruit("桃花").getName()// 内部类
    }

    /**
     * 静态变量,方法
     */
    private fun test26() {
        Book.ABC
        Book.qaz = "123"
        Book.wsx(this)
    }

    /**
     * 简化初始化成员变量
     */
    private fun test25() {
        val book = Book("小说", 100)
        book.qqq()
        println(book.toString())
    }

    /**
     * 二级构造
     */
    private fun test24() {
        Animal(this)
        Animal(this,123)
        Animal()
    }

    /**
     * 一级构造
     */
    private fun test23() {
        Student(this,1).xxx()
        Student(this,1,"123").xxx()
    }

    private fun test22() {
        val arrayOf = arrayOf("xxxx", "4353", "999")
        arrayOf.swap(0, 2)
        var re = ""
        for (item in arrayOf) {
            re = "$re,$item"
        }
        println(re)
    }


    /**
     * 扩展函数，给Array增加新的交换方法
     */
    fun <T> Array<T>.swap(pos1: Int, pos2: Int) {
        val tmp = this[pos1] //this表示数组对象自身
        this[pos1] = this[pos2]
        this[pos2] = tmp
    }

    /**
     * 泛型
     */
    private fun <T> test21(i: Int, vararg otherArray: T): String {
        var re = "$i"
        for (item in otherArray) {
            re = "$re,$item"
        }
        return re
    }

    /**
     * 数组可变参数
     */
    private fun test20(i: Int, vararg otherArray: Array<String>): String {
        var re = "$i"
        for (item in otherArray) {
            for (it in item) {
                re = "$re,$it"
            }
        }
        return re
    }

    /**
     * 可变参数
     */
    private fun test19(a: Int, vararg otherArray: String): String {
        var re = "$a"
        for (item in otherArray) {
            re = "$re,$item"
        }
        return re
    }

    /**
     * 指定修改参数值
     */
    private fun test18(a: String = "qqq", b: Int = 12, c: Boolean = true): String {
        return "$a$b$c"
    }

    /**
     * 参数默认值
     */
    private fun test17(a: String = "qqq", b: Int = 12, c: Boolean = true): String {
        return "$a$b$c"
    }

    /**
     * 有参数，有返回值
     */
    private fun test16(a: String, b: Int, c: Boolean): String {
        return a + b + c
    }

    /**
     * 变量空值处理
     */
    private fun test15() {
        /**
         * isNullOrEmpty : 为空指针或者字串长度为0时返回true，非空串与可空串均可调用。
         * isNullOrBlank : 为空指针或者字串长度为0或者全为空格时返回true，非空串与可空串均可调用。
         * isEmpty : 字串长度为0时返回true，只有非空串可调用。
         * isBlank : 字串长度为0或者全为空格时返回true，只有非空串可调用。
         * isNotEmpty : 字串长度大于0时返回true，只有非空串可调用。
         * isNotBlank : 字串长度大于0且不是全空格串时返回true，只有非空串可调用。
         */

        // 声明对象实例时，在类型名称后面加问号，表示该对象可以为空
        var nullStr: String? = null
        var nullStr1: String = ""
        // 调用对象方法时，在实例名称后面加问号，表示一旦实例为空就返回null
        nullStr?.isEmpty()
        nullStr.isNullOrEmpty()
        //  新引入运算符“?:”，一旦实例为空就返回该运算符右边的表达式
        nullStr ?: -1
        // 新引入运算符“!!”，通知编译器不做非空校验，运行时一旦发现实例为空就扔出异常
        nullStr!!
    }

    /**
     * while循环标记跳出,类似于C语言的 goto
     */
    private fun test14() {
        var i = 0
        xxxx@ while (i == 100) {
            while (i == 50) {
                i++
                break@xxxx
            }

        }

    }

    /**
     * for遍历
     */
    private fun test13() {
        // 通过下标取值
        val arrayOf = arrayOf("xxxx", "44444", "ewewewew", "xcxca2121")
        for (i in arrayOf.indices) {
            println(arrayOf[i])
        }

        // 左闭右开区间，合法值包括11，但不包括66  11-66之间
        for (i in 11 until 66) {
        }
        // 每次默认递增1，这里改为每次递增4     23-89之间
        for (i in 23..89 step 4) {
        }
        // for循环默认递增，这里使用downTo表示递减 50-7之间
        for (i in 50 downTo 7) {
        }
    }

    /**
     * 判断变量类型   用 when 加 is 来判断
     */
    private fun test12() {
        var count = 0
        count = (count + 1) % 3
        val countType = when (count) {
            0 -> count.toLong()
            1 -> count.toDouble()
            else -> count.toFloat()
        }
        textview.text = when (countType) {
            is Long -> "啊哈哈啊哈"
            is Int -> "嘻嘻嘻"
            is Double -> "12321321"
            else -> "嘻嘻嘻嘻"
        }
    }

    /**
     * switch替换为了when
     */
    private fun test11() {
        var count = 0
        textview.text = when (count) {
            0 -> "啊哈哈啊哈"
            1 -> "嘻嘻嘻"
            2 -> "12321321"
            else -> "嘻嘻嘻嘻"
        }
        var v0 = 0
        var v1 = 1
        var v2 = 2
        textview.text = when (count) {
            v0 -> "啊哈哈啊哈"
            v1 -> "嘻嘻嘻"
            v2 -> "12321321"
            else -> "嘻嘻嘻嘻"
        }

        textview.text = when (count) {
            1, 2, 3, 4, 8 -> "啊哈哈啊哈"
            in 2..10 -> "嘻嘻嘻"// 在2到10的范围内
            !in 5..60 -> "12321321"// 不在5到60的范围内
            else -> "嘻嘻嘻嘻"
        }
    }

    /**
     * if语句复制到控件中,三元运算符已被取消
     */
    private fun test10() {
        var bo = true
        textview.text = if (bo) {
            "哈哈哈"
        } else {
            "嘻嘻嘻"
        }
        // 三元运算符已被取消
        textview.text = if (bo) "哈哈哈" else "嘻嘻嘻"
    }

    /**
     * 变量与字符串拼接
     */
    private fun test9() {
        var bianliang = "啊哈哈都是西安"
        println("这个变量值为: $bianliang")
        println("这个变量长度: ${bianliang.length}")
        // 输出$符号  ${'$'}  或  \$
        println("${'$'}$bianliang\$")
    }

    /**
     * 切割字符串，for遍历
     */
    private fun test8() {
        var str = "xxxx.44444.ewewewew.xcxca2121"
        val split = str.split(".")
        for (item in split) {
            println(item)
        }
    }

    /**
     * 字符串转换
     */
    private fun test7() {
        var str = "97"
        println(str.toInt())
        println(str.toBoolean())
    }

    /**
     * 数组
     */
    private fun test6() {
        intArrayOf(1, 2, 3, 4)
        charArrayOf('1', '2', '3')
        arrayOf("1", "2", "3")
        arrayOf(1, 2, 3, 4, 5)

        var int_array: Array<Int> = arrayOf(1, 2, 3)
        var long_array: Array<Long> = arrayOf(1, 2, 3)
        var float_array: Array<Float> = arrayOf(1.0f, 2.0f, 3.0f)
        var double_array: Array<Double> = arrayOf(1.0, 2.0, 3.0)
        var boolean_array: Array<Boolean> = arrayOf(true, false, true)
        var char_array: Array<Char> = arrayOf('a', 'b', 'c')

        // 长度
        int_array.size
        // 设置指定位置的值
        int_array[0] = 5
        int_array.set(0, 5)
        // 获取指定位置的值
        int_array.get(1)
        int_array[1]
    }

    /**
     * 类型转换
     */
    private fun test5() {
        var i = 97
        println(i.toChar())
        println(i.toDouble())
    }

    /**
     * AsyncTask
     */
    private fun test4() {
        async {
            val name = Thread.currentThread().name
            Log.e("xxxxx1", "12312321" + name)
            uiThread {
                val name = Thread.currentThread().name
                Log.e("xxxxx2", "12312321" + name)
            }
            val name1 = Thread.currentThread().name
            Log.e("xxxxx3", "12312321" + name1)
        }
    }

    /**
     * 点击事件
     */
    private fun test3() {
        image.setOnClickListener {
            toast("点击了")
        }
        textview.setOnLongClickListener { longToast("长按了"); true }
    }

    /**
     * 设置图片
     */
    private fun test2() {
        image.setImageResource(R.mipmap.ic_launcher)
    }

    /**
     * 设置文字，颜色，字体大小
     */
    private fun test1() {
        textview.text = "你好"
        textview.setTextColor(resources.getColor(R.color.colorPrimary))
        textview.textSize = 40F
    }
}
