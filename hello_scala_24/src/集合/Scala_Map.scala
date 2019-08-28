package 集合

import scala.collection.mutable

object Scala_Map {

    def main(args: Array[String]): Unit = {

        //map集合k-v对
        //scalak-v 采用特殊方式声明
        val map: Map[String, Int] = Map("a"->1,"b"->2,"c"->3)

        val map1: Map[String, Int] = map+("d"->4)
        println(map1.mkString(","))

        //可变map
        val mmap: mutable.Map[String, Int] = mutable.Map("a"->1,"b"->2,"c"->3)



    }

}
