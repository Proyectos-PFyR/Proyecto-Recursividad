package object FuncionesRecursivas
{
  def maxLin(list: List[Int]): Int =
  {
    def compararNumero(x:Int, auxList: List[Int]): Int =
    {
      if(!auxList.isEmpty)
         if (x>auxList.head)
           {
             compararNumero(x,auxList.tail)
           }
         else
          {
            compararNumero(auxList.head,auxList.tail)
          }
      else
        x
    }

    if(!list.isEmpty)
    {
      compararNumero(list.head, list.tail)
    }
    else
    {
      0
    }
  }

  /*
  def maxIt(list: List[Int]): Int =
    {

    }

   */
}
