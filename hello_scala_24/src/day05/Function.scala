package day05

object Function {

    def main(args: Array[String]): Unit = {

        //函数式编程

        //函数可以赋值给变量

        //函数可以作为函数的参数

        //函数可以作为函数的返回值
        def f()={
            println("function")
        }

        def f0()={
            //返回函数
            //直接返回函数 有问题 需要添加特殊符号 :下划线
           // f() _
        }

        f0()

        //将函数作为参数传递给另外的函数
        def f4( f:(Int)=>Int )={

        }


        //匿名函数
        def f6( f:()=>Unit )={
            f()
        }

        f6(()=>{println("xxxxx")})


        def f7(f:(Int,Int)=>Int):Int={
            f(10,10)
        }

        def f8(a:Int,b:Int):Int={
            a+b
        }



    }


}
