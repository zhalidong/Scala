package Test

import scala.collection.mutable

object MutMapTest extends App {

    val map1 = new mutable.HashMap[String,Int]()
    //向 map 中添加数据
    map1("spark")=1
    map1+=(("hadoop",2))
    map1.put("stom",3)

    println(map1)

    map1-="spark"
    map1.remove("hadoop")
    println(map1)


}
