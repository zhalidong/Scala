package 集合

import scala.io.Source

object Scala_WordCountFile {

    def main(args: Array[String]): Unit = {

        //从文件中获取数据  统计数量
        Source.fromFile("in/word.txt").getLines().toList


    }




}
