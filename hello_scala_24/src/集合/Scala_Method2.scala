package 集合

object Scala_Method2 {

    def main(args: Array[String]): Unit = {

        val list = List(1,2,3,4)

        //数据减少 不是数据减少
        //将集合中数据经过逻辑处理后值保留一个结果 具体的结果需要参考逻辑实现

//        list.reduce((a,b)=>{a+b})
        val result = list.reduce(_+_)
        println(result)


        //折叠 最终的一条结果
        //fold方法可以传递两个部分的参数 第一个参数表示集合之外的数据
        //第二部分参数表示数据进行的逻辑处理
        val i = list.fold(100)(_+_)
        println(i)

    }


}
