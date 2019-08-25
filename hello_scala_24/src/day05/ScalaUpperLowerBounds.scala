package day05

class CmpInt(a:Int,b:Int){
    def bigger = if(a>b) a else b
}
//<: 上界
class CmpComm[T <: Comparable[T]](o1:T,o2:T){

    def bigger = if(o1.compareTo(o2) >0 ) o1 else o2

}


class Students(val name:String,val age:Int) extends Ordered[Students]{
    override def compare(that: Students) = this.age-that.age

    override def toString = this.name+"\t"+this.age
}

object ScalaUpperLowerBounds {

    def main(args: Array[String]): Unit = {
        val cmpint = new CmpInt(8,9)
        println(cmpint.bigger)

        val cmpcomm = new CmpComm(Integer.valueOf(1),Integer.valueOf(2))
        println(cmpcomm.bigger)


        val tom = new Students("Tom",18)
        val jim = new Students("jim",20)
        val com = new CmpComm(tom,jim)



    }

}
