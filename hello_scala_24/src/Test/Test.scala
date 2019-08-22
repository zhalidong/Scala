package Test

object Test {



    def main(args: Array[String]): Unit = {
        val ss: Array[Int] = Array[Int](1,3,5,8,9)
        //map 映射
        val fx=(x:Int) =>x*10
        // arr 经过map映射操作之后会返回一个新的数组
        val s2: Array[Int] = ss.map(fx)
        ss.map((s:Int)=>s*10)
        ss.map(x=>x*10)
        ss.map(_ *10)

        // flatten 扁平化操作
        val arr1:Array[String] = Array("hello hello tom","hello jerry")
        arr1.flatten

        arr1.flatMap(_.split(" "))
        arr1.flatMap(_.split(" ")).foreach(x=>println(x))


        arr1.flatMap(x=>x.split(" ")).groupBy(x=>x).mapValues(S=>S.length).toList.sortBy(x=>x._2).foreach(s=>println(s))




    }

}
