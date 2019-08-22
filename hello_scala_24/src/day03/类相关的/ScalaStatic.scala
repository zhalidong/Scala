package day03.类相关的

/**
  * 在scala中的object 是一个单例对象，没办法new
  * object中定义的成员变量 和 方法都是静态的
  *
  * 可以通过对象名.方法 或者.成员变量
  */
object ScalaStatic {
    val name:String="zhangsan"

    var age:Int=18

    def saySomething(msg:String)={
        println(msg)
    }


    def apply(food:String) = {
        println(s"沙县小吃 $food")
    }
}
