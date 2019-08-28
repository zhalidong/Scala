package 集合

object Scala_WordCount {
    def main(args: Array[String]): Unit = {

        val lineslist: List[(String, Int)] = List(("Hello Scala World",4),("Hello World",3),("Hello Hadoop",2),("Hello Hbase",1))

        //将一行一行的数据拆分成一个一个的单词数据
        //("Hello Scala World",4)
        //=> [(Hello),(Scala),(World)]
        //=> [(Hello,4),(Scala,4),(World,4)]
        val flatmaplist = lineslist.flatMap(t => {
            val line = t._1
            val words = line.split(" ")
            words.map(w => (w, t._2))
        })

        //将单词分组(Hello,4) 元祖中第一个元素分组
        val groupWord = flatmaplist.groupBy(t=>t._1)
        //将分组后的数据结构转换
        val wordToSumMap=groupWord.map(t=>{
            val countlist = t._2.map(tt=>tt._2)
            (t._1,countlist.sum)
        })

       //降序排列
        val sortlist=wordToSumMap.toList.sortWith((a,b)=>{a._2>b._2})

        val result = sortlist.take(3)

        println(result)


    }
}
