package day05

import java.io.File

object MyImpicits {
    //定义了一个隐式方法 将file类型变成RichFile类型
    implicit  def file2RichFile(file:File) = new RichFile(file)
}
