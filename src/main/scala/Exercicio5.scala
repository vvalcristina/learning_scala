//Operações com listas
object Exercicio5 {

  //Retorna o último elemento de uma lista
  def lastLista[A](ls: List[A]): A = ls.last

  //Retorna o penultimo elemento de uma lista
  def penultimoLista[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException
    else ls.init.last

  //Retorna o numero de elementos de uma lista
  def tamanhoLista[A](ls: List[A]): Int = ls.length

  //Inverte a ordem dos elementos de uma lista
  def revertLista[A] (ls: List[A]):List[A] = ls.reverse

  def main(args:Array[String]): Unit ={
    println("Lista: 0,1,2,3,4,5,6,7,8,9")
    print("Ultimo Elemento da Lista: ")
    println(lastLista(List(0,1,2,3,4,5,6, 7,8, 9)))
    print("Penúltimo elemento da lista: ")
    println(penultimoLista(List(0,1,2,3,4,5,6, 7,8, 9)))
    print("Numero de elementos da Lista: ")
    println(tamanhoLista(List(0,1,2,3,4,5,6, 7,8, 9)))
    println(revertLista(List(0,1,2,3,4,5,6,7,8,9)))

  }

}
