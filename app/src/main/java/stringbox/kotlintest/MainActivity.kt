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
    }

    /**
     * while循环标记跳出,类似于C语言的 goto
     */
    private fun test14() {
        var i = 0
        xxxx@while (i == 100){
            while (i==50){
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
        for (i in 11 until 66) {  }
        // 每次默认递增1，这里改为每次递增4     23-89之间
        for (i in 23..89 step 4) {  }
        // for循环默认递增，这里使用downTo表示递减 50-7之间
        for (i in 50 downTo 7) {  }
    }

    /**
     * 判断变量类型   用 when 加 is 来判断
     */
    private fun test12() {
        var count = 0
        count = (count+1) % 3
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
            1,2,3,4,8 -> "啊哈哈啊哈"
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
