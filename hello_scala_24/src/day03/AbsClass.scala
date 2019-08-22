package day03

/**
  * 使用关键字abstract定义一个抽象类
  * 可以没有具体实现的方法
  * 也可以具体实现的方法
  */
abstract  class AbsClass {

    def eat(food:String):String

    def swimming(style:String)={
        println(s"$style 这么游...")
    }

}
