package Test

object ImmutListTest {
    def main(args: Array[String]): Unit = {
        //创建一个不可变的集合
        val list1 = List(1,2,3)
        //将 0 插入到 lst1 的前面生成一个新的 List
        val list2=0::list1
        val list3 = list1.::(0)
        //将一个元素添加到 lst1 的后面产生一个新的集合
        val list6 = list1:+3



    }
}
