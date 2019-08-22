package Test

/**
  * Scala 的集合有三大类：序列 Seq、集 Set、映射 Map，
  * 所有的集合都扩展自 Iterable 特质
  * 在 Scala 中集合有可变（mutable）和不可变（immutable）两种类型，
  * immutable 类型的集合 初始化后就不能改变了
  *
  */

import scala.collection.mutable.ArrayBuffer

object ArrayTest {
    def main(args: Array[String]): Unit = {
        //初始化一个长度为 8 的定长数组，其所有元素均为 0
        val arr1 = new Array[Int](8)
        //直接打印定长数组，内容为数组的 hashcode 值
        println(arr1)
        //将数组转换成数组缓冲，就可以看到原数组中的内容了
        println(arr1.toBuffer)

        val arr2 = Array[Int](10)
        println(arr2.toBuffer)
        //定义一个长度为 3 的定长数组
        val arr3 = Array("hadoop","stom","spark")
        //使用()来访问元素
        println(arr3(2))

        //数 组 缓 冲
        val ab=ArrayBuffer[Int]()
        ab+=1
        ab+=(2,3,4,5)
        //追加一个数组++=
        ab++=ArrayBuffer(8,9)

        ab.insert(0,-1,0)
        ab.remove(8,2)
        println(ab)
    }
}
