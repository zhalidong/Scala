package day01

object Calculate {

  //add方法拥有两个int类型的参数 返回值为2个Iint的和
  def add(a:Int,b:Int)={
    a+b
  }



  //add2方法拥有3个参数 第一个参数是一个函数 第二个第三个为int类型的参数
  //第一个参数
  //    是拥有2个int类型的参数  返回值是int类型的函数
  def add2(f:(Int,Int) => Int,a:Int,b:Int) ={
    f(a,b)  //f(1,2) => 1+2
  }

  //fxx:(Int,Int) => Int
  val fxx=(a:Int,b:Int) => a+b

  def main(args: Array[String]): Unit = {


      //(1,(2+2)=4)
      val r1 = add(1,2+2)
      println(r1)

      //add(8,8)
      add(fxx(2,6),8)



      add2(fxx,1,2)


  }
}
