package day03

case class SendHeartBeat(id:String,time:Long)
case object CheckTimeOutWorker


/**
  * 模式匹配
  * 一旦一个case匹配上了就不会往下匹配了
  *
  */
object ScalaMatchCse {

    def main(args: Array[String]): Unit = {
        //匹配字符串内容
        def contextMatch(str:String)=str match {
            case "hello" => println("hello")
            case "Dog" =>println("Dog")
            case "1" =>println("1")
            case "1" =>println("2")
            case _ =>println("匹配不上")


        }
        println("---------匹配字符串内容------------")
        contextMatch("hello")
        contextMatch("Dog")
        contextMatch("1")
        contextMatch("fuck")
        //匹配数据类型
        def typeMatch(tp:Any)= tp match {
            case x:Int =>println(s"Int $x")
            case y:Long =>println(s"Long $y")
            case z:Boolean =>println(s"Boolean $z")
            case _ =>println("匹配不上")
        }
        println("---------匹配数据类型------------")
        typeMatch(1)
        typeMatch(10L)
        typeMatch(true)
        typeMatch("Scala")
        //匹配array
        def arrayMatch(arr:Any) =arr match {
            case Array(0) =>println("只有一个0元素的数组")
            case Array(0,_) =>println("以0开头的拥有两个元素的数组")
            case Array(1,_,3) =>println("以1开头的3结尾中间任意3个元素的数组")
            case Array(8,_*) =>println("以8开头的N个元素的数组")  //_*标识0个或者多个任意类型的数据
        }
        println("---------匹配array------------")
        arrayMatch(Array(0))
        arrayMatch(Array(0,"1"))
        arrayMatch(Array(1,true,3))
        arrayMatch(Array(8))
        //匹配list
        def listMatch(list:Any) = list match {
            case 0::Nil => println("只有一个0元素的list")
            case 7::9::Nil => println("只有7和9元素的list")
            case x::y::z::Nil => println("只有3个元素的list")
            case m::n if n.length>0 => println("-----")       //拥有head 和tail的数组 if n.length>0 守卫
        }

        listMatch(List(0))
        listMatch(List(7,9))
        listMatch(List(8,9,666))
        listMatch(List(10,100,888,999))


        println("---------匹配list------------")
        //匹配元祖
        def tupleMatch(tuple:Any)= tuple match {
            case (0,_) =>println("元祖的第一个元素为0 第二个元素为任意类型的数据 且只有两个元素")
            case (x,m,k) =>println("拥有三个元素的元祖")
            case (_,"AK-47") =>println("第一个元素是任意类型  第二个必须是 AK-47的元祖")



        }
        tupleMatch((0,1))
        tupleMatch(("2",1,true))
        tupleMatch((ScalaMatchCse,"AK-47"))

        println("---------匹配元祖------------")
        //匹配对象
        def objMatch(obj:Any)=obj match {
            case SendHeartBeat(x,y) => println(s"${x} ${y}")
            case CheckTimeOutWorker => println("CheckTimeOutWorker")
            case "registerWorker" => println("registerWorker")
        }
        println("---------匹配对象------------")

        objMatch(SendHeartBeat("zzzz",System.currentTimeMillis()))
        objMatch(SendHeartBeat("xx",100L))
        objMatch(CheckTimeOutWorker)
        objMatch("registerWorker")
    }

}
