package day05

object Function02 {

    def main(args: Array[String]): Unit = {

        //scala可以采用自动推断功能来简化函数的声明

        //1.如果函数声明时 明确无返回值 那么函数体中有return 也不起作用
        /*def test():Unit={
            //println("zld")

        }*/

        //如果将函数体的最后一行进行返回 那么return关键字可以省略
        def test():String={
            "zhangsan"
        }

        //如根据函数的最后一行推断类型  那么函数的返回值类型可以省略
        def test1()={
            "zhangsan"
        }

        //如果函数体只有一行代码  大括号可以省略
        def test2()="zhangsan"

        //如果函数声明中没有参数列表 小括号可以省略
        def test3="zhangsan"

        //匿名函数
        ()->(println("xxxxx"))












    }


}
