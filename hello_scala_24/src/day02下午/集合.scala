package day02下午

object 集合 {
    /**
      * Array:
      *     内容都可变
      *
      *     长度可变数组（ArrayBuffer）和长度不可变数组 Array
      *
      * 在Scala中，集合分为可变集合（mutable）和不可变集合(immutable)
      *
      * 可变集合：长度可变，内容可变
      * 不可变集合：长度不可变，内容也不可变
      *
      */

    def main(args: Array[String]): Unit = {
        val list = List(3,5,1)
        //fold(初始值)(叠加的函数)
        //计算流程
        //(0 +3)
        //(3 + 5)
        //(8 + 1)



        list.fold(0)(_ + _)				//9


    }

}
