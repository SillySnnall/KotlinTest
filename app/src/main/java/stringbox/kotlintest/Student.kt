package stringbox.kotlintest

import android.content.Context
import org.jetbrains.anko.toast

/**
 * 内容：GC
 * 作者：StringBOX
 * 时间：2017/10/30 14:57
 */
class Student(context: Context, a: Int = 123) {// 一级构造

    private var context: Context

    init {
        context.toast("qweqw")
        this.context = context
    }

    /**
     * 二级构造
     */
    constructor(context: Context, a: Int, b: String) : this(context, a) {
        // 调用这个构造，init也会执行
        context.toast("二级构造")
    }

    fun xxx() {
        context.toast("xxx")
    }
}