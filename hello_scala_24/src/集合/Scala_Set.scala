package 集合

import scala.collection.mutable

object Scala_Set {

    def main(args: Array[String]): Unit = {

        //set集合  无序 不可重复 默认scala的set集合是不可变的
        val set: Set[Int] = Set(1,2,3,4,1,5,6,7,8)

        println(set.mkString(","))

        //可变set集合
        mutable.Set

    }

}
