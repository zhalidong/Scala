package day03

/**
  * 在scala中第一个继承抽象类或者特质  只能使用关键字extends
  * 如果想继承多个特质的话 可以在extends之后使用with关键字
  */
object AbsClassImpl extends AbsClass with Fly {

   /* override def eat(food: String) = {
        s"$food 炒着吃"
    }*/

    override def eat(food: String) = ???

    override val name = "zld"

    def main(args: Array[String]): Unit = {

        AbsClassImpl.swimming("飘着")

    }

}
