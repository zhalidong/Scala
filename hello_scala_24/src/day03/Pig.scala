package day03

class AnimalImpl(name:String){

}



/**
  * 编译器在编译时会从右往左进行编译检查
  */
object Pig extends  Dog with Animal {

    override def run(): Unit = {
        println("跑....")
    }

    def main(args: Array[String]): Unit = {

        //Pig.run()


    }
}
