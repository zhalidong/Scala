package day03

/**
  * case修饰的类 支持 模式匹配 默认实现了Serializable接口
  * 样例类: case class 类名(属性...)
  * 类名的定义必须是驼峰 属性的名称第一给我字母小写
  *
  */
case class Message(sender:String,messageContext:String)

/**
  * 默认实现了Serializable接口
  * 样例对象: case object 对象名
  * 模式匹配
  * 样例对象不能封装数据
  */

case object CheckHearBeat


object TestCaseClass{

    def main(args: Array[String]): Unit = {
        val message = new Message("刘亦菲","今天吃饭")


    }

}
