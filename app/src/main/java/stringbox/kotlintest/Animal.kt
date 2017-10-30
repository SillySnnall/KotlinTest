package stringbox.kotlintest

import android.content.Context
import org.jetbrains.anko.toast

/**
 * 内容：GC
 * 作者：StringBOX
 * 时间：2017/10/30 14:51
 */
class Animal{
    /**
     * 二级构造（空参）
     */
    constructor()
    /**
     * 二级构造
     */
    constructor(context:Context){
        context.toast("哈哈哈")
    }
    /**
     * 二级构造
     */
    constructor(context: Context,a:Int){
        context.toast("$a")
    }
}