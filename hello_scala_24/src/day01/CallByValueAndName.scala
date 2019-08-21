package day01

object CallByValueAndName {
  var money=50
  def huaQian():Unit={
    money=money-5
  }

  def shuQian()={
    huaQian()
    money

  }
  def printByValue(x:Int)={
    for(a<- 0 until 3){
      println(s"测试 ${x}")
    }
  }
  //printbyName  参数是一个函数 没有参数 返回值是 Int的函数
  def printbyName(x: =>Int) ={
    for(b<- 0 to 3){
      println(s"每次都算算还剩:${x}")
    }
  }

  def main(args: Array[String]): Unit = {

    //传值调用 printByValue 参数是一个具体的数值
    //1.计算 shuQian的返回值是  =45
    //2.将45  作为参数传入printByValue
    //printByValue(shuQian())


    //传名（函数）调用
    //1.将shuQian方法名称传递到方法的内部执行
    printbyName(shuQian())


  }
}
