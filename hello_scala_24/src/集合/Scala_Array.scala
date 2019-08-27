package 集合

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala_Array {

    def main(args: Array[String]): Unit = {
        //scala中的数组 使用Array对象实现 使用中括号声明数组的类型
        //创建数组
        //Array可以通过apply方法创建数组对象
        val ints: Array[Int] = Array(1,2,3,4)
        //访问数组:使用（）增加索引的方式来访问数组
        println(ints(0))
        //数组的长度
        println(ints.length)
        println(ints)

        //将数组转换为字符串打印出来
        println(ints.mkString(","))

        //将数组中的每个元素打印出来
        for (elem <- ints) {
            println(elem)
        }

        def printlnxxx(i:Int):Unit={
            println(i)
        }
        //foreach会将数组中每个元素循环遍历
        //ints.foreach(printlnxxx)

        ints.foreach((i)=>{println(i)})

        //修改元素
        ints.update(1,5)
        println(ints.mkString(","))

        //增加元素
        //采用方法向数组中增加新的元素 不会对原有数组造成影响 而是产生新的数组
        ints:+(5)


        //可变数组
        val arrayBuffer = ArrayBuffer(1,2,3,4)
        //修改值
        arrayBuffer(0)=9

        arrayBuffer.foreach(println)
        arrayBuffer+=(9)

        arrayBuffer.remove(1)

        //可变数组和不可变数组的转换
        val buffer: mutable.Buffer[Int] = ints.toBuffer


    }

}
