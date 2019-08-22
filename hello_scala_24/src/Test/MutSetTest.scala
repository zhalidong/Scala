package Test

import scala.collection.mutable

object MutSetTest extends App {
    //创建一个可变的 HashSet
    val set1 = new mutable.HashSet[Int]()
    //向 HashSet 中添加元素
    set1+=2
    set1.add(4)
    set1++=Set(1,3,5)
    println(set1)

    //删除一个元素
    set1-=5
    set1.remove(2)
    println(set1)

}
