package day02

object HightFunc extends App{
    // 高阶函数: 将其他函数作为参数或其结果是函数的函数

    // 定义一个方法, 参数为带一个整型参数返回值为整型的函数f 和 一个整型参数v, 返回值为一个函数

    def apply(f: Int => String, v: Int) = f(v) // "[" + 10.toString() + "]"

    // 定义一个方法, 参数为一个整型参数, 返回值为String
    def layout(x: Int) = "[" + x.toString() + "]" // layout: Int => String

    // 调用  方法的第一个函数的参数类型必须匹配 才能传进来 名字无所谓
    println(apply(layout, 10))
}
