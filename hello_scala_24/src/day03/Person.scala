package day03

class Student{

}




object Person {



    def main(args: Array[String]): Unit = {
        /**
          * 在scala中可以动态混入N个特质
          */
        val student = new Student with Fly with ScalaTrait {
            override val name = "zld"
        }

        student.fly("gaoxing")
        student.small("丁丁")

    }

}
