package 集合

import scala.collection.mutable.ListBuffer

object Scala_seq {

    def main(args: Array[String]): Unit = {

        //序列 默认scala的集合都是不可变的
        val list: List[Int] = List(1,2,3,4)
        val list1: List[Int] = List(5,6,7,8)
        //通过索引获取数据
        println(list(0))
        //增加数据
        //val list1 = list:+1
        val list2: List[Int] = list.++(list1)
        println(list2.mkString(","))
        //::运算顺序是从右到左
        val list3: List[Int] = list.::(9)

        //特殊List集合 空集合
        println(Nil)
        for (elem <- list3) {
            println(elem)
        }

        //可变集合
        val mlist: ListBuffer[Int] = ListBuffer(1,2,3,4)
        //集合的属性
        println(mlist.head)
        //尾（除了头以外）
        println(mlist.tail)

    }

}
