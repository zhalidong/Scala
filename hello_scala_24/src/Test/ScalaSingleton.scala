package Test

/**
  * 单例对象
  */
object ScalaSingleton {
    def saySomething(msg:String)={
        println(msg)
    }
}


object test{
    def main(args: Array[String]): Unit = {
        ScalaSingleton.saySomething("滚...")
        println(ScalaSingleton)
        println(ScalaSingleton)

    }
}
