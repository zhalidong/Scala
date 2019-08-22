package day03

trait Fly {

    val name:String

    final def fly(name:String)={
        println(s"看  ${name} 在飞")
    }


}
