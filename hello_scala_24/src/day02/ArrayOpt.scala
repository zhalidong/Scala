package day02

object ArrayOpt {
    def main(args: Array[String]): Unit = {

        var arr = Array[Int](1,3,5,8,9)


        //map 映射
        val fx = (x:Int) => x*10
        // arr 经过map映射操作之后会返回一个新的数组
        val r1 = arr.map(fx)

        //简写方式
        arr.map((x: Int) => x * 10)
        arr.map(x=>x*10)
        arr.map(_ * 10)

        // flatten 扁平化操作
        val arr1:Array[String] = Array("hello hello tom","hello jerry")
        //Array(Array("hello","hello","tom"), Array("hello", "jerry"))
        val r2: Array[Array[String]] = arr1.map(_.split(" "))
        //Array("hello","hello","tom", "hello", "jerry") 扁平化操作
        r2.flatten

        // flatMap = map -> flatten
        arr1.flatMap(_.split(" "))

         arr1.flatMap(_.split(" ")).foreach(x=>println(x))

        // 求每个单词出现的数量 word count
        /*
            思路：
                1.对数组中使用flatMap切分 产生一个数组中包含所有的单词
                2.使用groupBy对数组中所有相同的单词进行分组 产生一个map
                3.使用mapvalues 取出map中的所有values 产生一个数组
                4._.length  对取出的values进行计算长度 产生一个map
                5.toList.sortBy(x=>x._2）把map 变成一个list 然后按照list中第二个元素进行排序
         */
        //Array("hello","hello","tom", "hello", "jerry")
        val r3 = arr1.flatMap(x =>x.split(" "))

                // Map("hello"  -> Array("hello", hello, hello), tom -> Array("tom")
                .groupBy(x => x)

                //.map(x => x._2.length)
                .mapValues(x => x.length).toList.sortBy(x => - x._2)

        println(r3)


    }
}
