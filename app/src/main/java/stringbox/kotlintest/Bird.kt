package stringbox.kotlintest

/**
 * 内容：GC
 * 作者：StringBOX
 * 时间：2017/10/30 17:01
 */
open class Bird(var name:String,val age: Int){// 默认为final，open是可继承
    init {

    }

    open protected fun ccc(){// 可以实现的方法

    }
}