package day03.类相关的

/**
  * 在Scala中定义类的用class关键字修饰
  * 这个类默认有一个空参构造器
  *
  * 定义在类名称后面的构造器叫主构造器
  *
  * 类的主构造器中的属性会定义成类的成员变量
  *
  * 如果主构造器中成员属性没有val|var修饰的话，该属性不能被访问,相当于对外没有提供get方法
  * 如果成员属性使用var修饰的话，相当于对外提供了get 和set 方法
  * 如果成员属性使用val修饰的话，相当于对外提供了 get
  *
  * 类的成员属性访问权限：
  *     如果类的主构造器中成员属性是private修饰的，它的set 和 get方法都是私有的，外部不能访问
  *
  *
  * 类的构造器访问权限
  *     在构造器前加修饰权限
  *     private 在主构造器之前，这说明该类的主构造器是私有的，外部类或者外部对象不能访问
  *     也适用于辅助构造器
  *
  *
  * 类的访问权限
  *     类的前面加上private[this] 标识这个类在当前包下都可见，当前包下的子包不可见
  *     类的前面加上private[包名] 表示这个类在当前包及其子包下都可见
  */
private[day03] class Teacher  (private var name:String,val age:Int) {

    var sex:String=_   //_代表空
    var prov:String=_
    //定义一个辅助构造器 def this()
    def this(name:String,age:Int,sex:String)={
        //在辅助构造器中必须先调用主构造器
        this(name,age)
        this.sex=sex
    }

    private  def this(name:String,age:Int,sex:String,prov:String)={
        this(name,age,sex)  //在上面一个辅助构造器调用了主构造器
        this.prov=prov
    }

}
/**
  * object Teacher 叫做类的伴生对象  在伴生对象中可以访问类的私有成员方法和属性
  */
object Teacher {

    def apply(name: String, age: Int): Teacher = {
        // 初始化工作

        new Teacher(name, age, "male", "TaiGuo")
    }

    def main(args: Array[String]): Unit = {
        val t1 = new Teacher("大海",31,"XX","xx")
        println(t1.name)

        val t2 = Teacher("taotao",20)
        println(t2.sex,t2.prov)
    }
}