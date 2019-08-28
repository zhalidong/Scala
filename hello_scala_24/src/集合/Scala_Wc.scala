package 集合

object Scala_Wc {

    def main(args: Array[String]): Unit = {


        //TODO Wordcount 对集合中单词统计出现的次数 按照出现次数降序 取前3名
        val wordlist = List("Hello","Scala","Hello","World","Hbase","Hadoop","Kafka","World","Scala")

        //1.将相同的单词放在一起 (分组) (Hello,List("Hello","Hello"))
        val wordToList: Map[String, List[String]] = wordlist.groupBy(x=>x)
        //2.将数据结构转换 (Hello,次数)  map中只有两个元素就是一个元祖
        val wordToCountMap: Map[String, Int] = wordToList.map(t=>(t._1,t._2.size))
        //3.将数据进行排序 降序
        //list((k1,v1),(k2,v2))
        val sortlist = wordToCountMap.toList.sortWith((x,y)=>{x._2 > y._2})
        //4.取排序后的前3条
        val result: List[(String, Int)] = sortlist.take(3)

        //println(result.mkString(","))

        //TODO 扁平化操作
        //将一个整体中的内容拆成一个一个的个体
        val lineList = List("Hello World","Hello Scala","Hello Hadoop")
        //list => 1,2,3
        val flatmaplist: List[String] = lineList.flatMap(x=>x.split(" "))
        val result2 = flatmaplist.groupBy(x=>x).map(t=>(t._1,t._2.size)).toList.sortWith((x,y)=>(x._2>y._2))
        println(result2)

    }

}
