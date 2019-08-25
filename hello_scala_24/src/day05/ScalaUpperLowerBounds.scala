package day05

class CmpInt(a:Int,b:Int){
    def bigger = if(a>b) a else b
}
//<: 上界
class CmpComm[T <: Comparable[T]](o1:T,o2:T){

    def bigger = if(o1.compareTo(o2) >0 ) o1 else o2

}


object ScalaUpperLowerBounds {

    def main(args: Array[String]): Unit = {
        val cmpint = new CmpInt(8,9)
        println(cmpint.bigger)

        val cmpcomm = new CmpComm(Integer.valueOf(1),Integer.valueOf(2))
        println(cmpcomm.bigger)

    }

}
