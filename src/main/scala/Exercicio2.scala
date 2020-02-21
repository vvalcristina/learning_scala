//Treinando utilização de funções anônimas

object Exercicio2 {

  def Calculadora(callback: (Int, Int) => Int, x:Int, y:Int)={
    println(callback(x,y))
  }

  def ContaAteDez(f: Int => Unit): Unit ={
    for (i <-1 to 10) f(i)
  }

  def main (args: Array[String])={
    println("Calculadora")
    Calculadora((x,y)=> x + y,5,3)
    Calculadora((x,y) => x - y,5,3)
    Calculadora((x,y) => x * y,5,3)
    Calculadora((x,y) => x / y,5,3)
  }

  println("Conta Até 10")
  ContaAteDez(i => println(i))

}
