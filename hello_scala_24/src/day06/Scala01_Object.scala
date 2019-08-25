package day06


/**
  * 面向对象
  */


object Scala01_Object {

    def main(args: Array[String]): Unit = {
        //创建类的对象
        val user:User = new User()

        user.username="zhangsan"

        println(user.username)



    }
}

//声明类
class User{
    //类体
    var username:String= _
    var age:Int= _

    def login():Boolean={
        true
    }


}
