package day05

object Function03 {

    def main(args: Array[String]): Unit = {

        //scala是完全面向函数编程语言

        //函数可以赋值给变量

        //函数可以作为函数的参数
        def test():Unit={

        }
        //函数可以做为函数的返回值

        def f():Unit={
            println("function")
        }

        def f0()= {
            //返回函数
            //直接返回函数 有问题 需要增加特殊符号 : 下划线
            f _
        }
        f0()

        def f1()={
            def f2():Unit={
                println("xxxxx")
            }
            f2 _
        }

        f1()()


        //函数科利华
        def f3(i:Int)(j:Int):Int={
            i*j
        }


        //将函数作为参数的传递给另外一个函数
        //() => Unit
        //参数列表  => 返回值类型
        def f4( f : ()=>(Int) ):Int={
            f() + 10
        }

        def f5():Int={5}
        f4(f5)

        //使用匿名函数改善代码
        def f6(f: () =>Unit):Unit={
            f()
        }

        f6(()=>{println("xxxxd")})


        def f7(f:(Int)=>Unit):Unit={
            f( 10)
        }

        def f8(i:Int)={
            println(i)
        }

        f7(f8)

        f7((i:Int)=>{println(i)})
        f7((i)=>{println(i)})
        f7((i)=>println(i))
        f7(println(_))





    }



}
