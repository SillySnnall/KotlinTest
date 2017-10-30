package stringbox.kotlintest

/**
 * 内容：GC
 * 作者：StringBOX
 * 时间：2017/10/30 17:48
 */
sealed class SeasonSealed {// 避免when分支多了else语句
    //密封类内部的每个嵌套类都必须继承该类
    class Spring (var name:String) : SeasonSealed()
    class Summer (var name:String) : SeasonSealed()
    class Autumn (var name:String) : SeasonSealed()
    class Winter (var name:String) : SeasonSealed()
}