package day06

/**
  * 面向对象  包的声明  在同一个源码文件中 可以多次声明
  * 声明的类在最后的那个包中
  * 源码中的类所在的位置 不需要和包路径相同
  * scala中所有的语法都可以进行嵌套
  * package可以使用小括号 小括号内声明的类在这个包中 之外声明的类不在这个包中
  */

package test{
    package test1{

    }
}


object Scala01_package {

    def main(args: Array[String]): Unit = {

        println("zzz")
    }
}


