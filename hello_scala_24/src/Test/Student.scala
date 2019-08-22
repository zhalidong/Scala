package Test
/** 在 Scala 中，类并不用声明为 public。
  * 如果你没有定义构造器, 类会有一个默认的空参构造器
  * var 修饰的变量, 这个变量对外提供 getter setter 方法
  * val 修饰的变量, 对外提供了 getter 方法,没有 setter
  */
class Student {
    var name:String= _
    val age:Int=10
}

object Test{
    val name:String="zhangsan"
    def main(args: Array[String]): Unit = {
        // 调用空参构造器,可以加() 也可以不加
        val student = new Student()
        student.name="laoyang"

        println(s"student.name ===== $student.name $student.age")
        println(s"test.name ===== "+Test.name)



    }
}
