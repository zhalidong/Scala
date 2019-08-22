package Test

import scala.collection.immutable.HashSet


object ImmutSetTest extends  App {
    val set1 = new HashSet[Int]()
    //将元素和 set1 合并生成一个新的 set，原有 set 不变
    val set2=set1+4
    //set 中元素不能重复
    val set3 = set1++Set(5,6,7)
    val set0 = Set(1,3,4) ++ set1
    println(set0.getClass)




}
