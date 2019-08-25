package day05

object Function01 {

    def main(args: Array[String]): Unit = {
        //函数 入参   出参


        //无参 无返回值
        def test():Unit={
            println("test")
        }

        //有参  无返回值 函数没有重载的概念
        //如果在同一个作用域中 函数不能同名

        def test01(s:String)={
            println(s)
        }
        //有参 有返回值
        def test2(s:String):String={
            "zld"
        }

        //无参  有返回值
        def test3():String={
            "zld"
        }


        //scala没有throw关键字 如果函数中有异常发生 也不需要函数声明时抛出异常




    }


}
