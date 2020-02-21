//Funções anônimas e coleção de dados
object Exercicio3 {

  def printList(printFunction: (Int) => Unit, aList: List[Int]): Unit={
    for(i <- aList){
      printFunction(i)
    }
  }
  def main(args:Array[String]){
    val listaIdade = List(5,22,25,27,50)
    println("Idades")
    printList(i => println(i), listaIdade)

    println("Dobro das Idades")
    printList(i => println(i *2), listaIdade)

    println("Filtro de Idade maior que 25")
    val listaFiltrada = listaIdade.filter(i => i >25)
    printList(i => println(i),listaFiltrada)

    println("Filtro de Idade Menor")
    val listaFiltrada2 = listaIdade.filter(i => i<= 25)
    printList(i => println(i), listaFiltrada2)
  }

}
