package day05

object Function04 {

    def main(args: Array[String]): Unit = {

        //可变参数
        def test(name:String*):Unit={
            println(name)
        }
        //调用函数的可以传多个参数 也可以不传参数
        test("zhangsan","wangwu")


        //默认参数
        def test01(name:String,age:Int=20):Unit={
            println(s"${name} ${age}")

        }



    }


}
