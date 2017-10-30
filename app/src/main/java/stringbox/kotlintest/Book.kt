package stringbox.kotlintest

import android.content.Context
import org.jetbrains.anko.toast

/**
 * 内容：GC
 * 作者：StringBOX
 * 时间：2017/10/30 15:15
 */
class Book(var name: String, private val page: Int) {

    fun qqq(): String {
        return "$name,$page"
    }

    override fun toString(): String {
        qaz = "无哦去额哦热情"
        return "Book(name='$name', page=$page,$qaz)"
    }

    /**
     * 伴生对象(创造静态成员和函数)
     */
    companion object Xxx {
        val ABC = 1// 静态常量
        var qaz = "哈哈哈"
        fun wsx(context: Context) {// 静态方法
            context.toast("静态方法")
        }
    }
}