package day01

object ScalaFor {
  def main(args: Array[String]): Unit = {
    val array = Array(1, 2, 3, 4, 5, 6)
    for(i <- array){
      println(i)
    }



    val index = Array(0,1,2,3,4)
    for(i <- index){
      println(array(i))
    }

    for(ele <- 0 until  array.length){
      print(array(ele))
    }

    for(i <- array if i%2==0){
          println(i)
    }

    println("============================")

    for(i <- 1 to 3; j <- 1 to 3 if i != j) { println((10 * i + j) + " ") }

    for(e <- array if e % 2 == 0) yield e

    val  fxo=(a:Int,b:Int) =>a+b
    val i = fxo(6,6)
    print(i)

    val f1=(name:String)=> println(name)
    val f2:(String) => Unit=a => println(a)





  }
}
