package day03

object ScalaTraitImpl extends ScalaTrait with Fly {


    override val name = "bird"

    /**
      * 如果特质中hello方法没有实现的话 子类在实现的时候可以不加overrid关键字
      *
      * @param name
      */
    override def hello(name: String): Unit = {
        println(s"hello $name")
    }

    /**
      * 如果特质中 方法有具体实现  在子类继承重写的时候必须使用override关键字
      * @param name
      */
    override def small(name: String): Unit = {
        println(s"丁丁对 $name 哈哈大笑")
    }

    def main(args: Array[String]): Unit = {
        ScalaTraitImpl.hello("查力冬")
        ScalaTraitImpl.small("老段")
        ScalaTraitImpl.fly("老杨")
    }


}
