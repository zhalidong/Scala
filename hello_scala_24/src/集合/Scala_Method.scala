package 集合

object Scala_Method {

    def main(args: Array[String]): Unit = {
        //集合常用方法
        val list = List(1,2,4,3,1)
        println(list.sum)        //求和

        println(list.max)           //最大值

        println(list.min)          //最小值

        println("product"+list.product)     //乘积

        //TODO 反转 无排序
        println("reverse = "+list.reverse)

        //TODO 分组(通过制定函数的返回值进行分组)
        //val intToInts: Map[Int, List[Int]] = list.groupBy(x=>x)
        //intToInts.foreach(t=>{println(t._1+"="+t._2)})

        // 11,22,23,14
        val stringlie = List("11","22","14","23")
        //val stringToStrings: Map[String, List[String]] = stringlie.groupBy(x=>x.substring(0,1))
        //stringToStrings.foreach(t=>{println(t._1+"="+t._2)})

        //  TODO 排序 按照指定规则进行排序
        val sortList: List[Int] = list.sortBy(x=>x)
        println(sortList.mkString(","))

        val sortStringList: List[String] = stringlie.sortBy(x=>x.substring(1))
        println(sortStringList.mkString(","))

        // TODO 指定排序方式 升序 从小到大
        val ints: List[Int] = list.sortWith((x, y)=>{x<y})
        println(ints.mkString(","))

        //降序  从大到小
        val ints1: List[Int] = list.sortWith((x, y)=>{x>y})

        val yy: List[String] = stringlie.sortWith((x, y) => {
            x.substring(1) > y.substring(1)
        })

        println(yy.mkString(","))
        //TODO 获取集合的前n个
        list.take(10)

        //TODO 迭代
        for (elem <- list.iterator) {
            println(elem)
        }


        //TODO 映射
        val list1: List[(Int, Int)] = list.map(x=>{(x,1)})
        val intToTuples: Map[Int, List[(Int, Int)]] = list1.groupBy(t=>t._1)
        //(k,list) => (k.size)
        val intToInt: Map[Int, Int] = intToTuples.map(t=>(t._1,t._2.size))

        println(intToInt.mkString(","))

        //TODO 对集合数据过滤 true保留
        val filterlist = list.filter(x=>x%2==0)
        println(filterlist)

        // TODO 拉链ZIP
        val list2=List(1,2,3,7)
        val list3=List(4,5,6)
        //将两个集合数据关联 关联后的数据形成了元祖
        val tuples: List[(Int, Int)] = list2.zip(list3)
        println(tuples)

        //集合的并集
        list2.union(list3)    //1,2,3,4,5,6,7


        //集合的交集
        list2.intersect(list3)




    }

}
