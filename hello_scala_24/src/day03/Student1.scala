package day03

object Student1 extends StudentTrait {


    override type T = String

    def main(args: Array[String]): Unit = {
        Student1.learn("string")
    }

}


object  Student2 extends StudentTrait{
    override type T = Int

    def main(args: Array[String]): Unit = {
        Student2.learn(99)
    }
}