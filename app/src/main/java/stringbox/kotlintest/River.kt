package stringbox.kotlintest

/**
 * 内容：GC
 * 作者：StringBOX
 * 时间：2017/10/30 18:04
 */
//在类名后面添加“<T>”，表示这是一个模板类
class River<T> (var name:String, var length:T) {
    fun getInfo():String {
        var unit:String = when (length) {
            is String -> "米"
        //Int、Long、Float、Double都是数字类型Number
            is Number -> "m"
            else -> ""
        }
        return "${name}的长度是$length$unit。"
    }
}