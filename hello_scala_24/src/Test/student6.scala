package Test

class student6 (val name:String,var age:Int){
    var gender:String= _

    def this(name:String,age:Int,gender:String){
        this(name,age)
        this.gender=gender
    }
}

object constr6{
    def main(args: Array[String]): Unit = {
        val s = new student6("laoduan",38)
        println(s"${s.name} ${s.age}")


        val s1 = new student6("laoyang",18,"male")
        println(s"${s1.gender}")
    }
}
