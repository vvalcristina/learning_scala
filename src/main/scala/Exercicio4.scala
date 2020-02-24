//Resolve fatorial
object Exercicio4 {

  def fatorial(n : Int) : Int = {
    var res : Int = 1
    if (n >= 1)
      res = n * fatorial(n - 1)
    res
  }

  def main(args:Array[String]): Unit ={
    print(fatorial(2))
  }

}
