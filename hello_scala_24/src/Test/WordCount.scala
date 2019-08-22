package Test

object WordCount {
    def main(args: Array[String]): Unit = {
        val words: Array[String] = Array("hello tom hello jim","hello hatano hello 菲菲")
        val wordmap: Array[Array[String]] = words.map((x:String)=>x.split(" "))
        val flword: Array[String] = wordmap.flatten
        val groupword: Map[String, Array[String]] = flword.groupBy((wd:String)=>wd)

        val mapwords: Map[String, Int] = groupword.map(s=>(s._1,s._2.length))


    }
}
