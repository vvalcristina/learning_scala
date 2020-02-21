object Main {
  //def : declaração de função -> def nome(parâmetros)=> retorno
  //não precisa utilizar return
  //Unit -> função não retorna nada
  //Scala permite a utilização de funções anônimas
  def Calc(callback: (Int, Int) => Int, x:Int, y:Int): Unit ={
    println(callback(x,y))
  }

  def soma (x: Int, y: Int): Int={
    x + y
  }

  def multiplicacao (x: Int, y: Int): Int={
    x * y
  }

  def divisao (x:Int, y: Int): Int ={
    x / y
  }

  def subtracao (x:Int, y:Int): Int ={
    x -y
  }

  def main (args: Array[String])={
    Calc(soma,5,3)
    Calc(divisao,5,3)
    Calc(multiplicacao,5,3)
    Calc(subtracao,5,3)
  }

}
