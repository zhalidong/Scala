package day05

/**
  * 泛型 就是类型约束
  *
  */
abstract class Message[T](context:T)

class StrMessage(context:String) extends Message(context)

//定义了一个泛型类衣服
class Clothes[A,B,C](val clothtype:A,val color:B,val size:C)

object ScalaFanXing {

    def main(args: Array[String]): Unit = {

    }

}
