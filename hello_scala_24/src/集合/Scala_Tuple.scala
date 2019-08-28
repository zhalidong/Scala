package 集合

object Scala_Tuple {

    def main(args: Array[String]): Unit = {

        //Tuple:元祖
        //将无关的数据当做整体来使用
        val tuple: (String, Int, String) = ("zhangsan",11111,"xxxxxxx")
        //访问tuple中的数据
        println(tuple._1)
        println(tuple._2)
        println(tuple._3)

        //元祖中最多的元素个数是22

        //循环遍历
        for (elem <- tuple.productIterator) {
            println(elem)
        }

        (1,"zhangsan")


    }

}


class User{
    var username:String= _
    var age:Int= _

}