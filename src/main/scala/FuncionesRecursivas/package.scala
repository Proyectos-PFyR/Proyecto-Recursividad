package object FuncionesRecursivas
{
  def maxLin(list: List[Int]): Int =
  {
    def compararNumero(x:Int, list: List[Int]): Int =
    {
      if(!list.tail.isEmpty)
         if (x>list.head)
           {
             compararNumero(x,list.tail)
           }
         else
          {
            compararNumero(list.head,list.tail)
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
