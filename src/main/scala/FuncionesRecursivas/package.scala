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

  def movsTorresHanoi(n: Int): BigInt =
  {
    def calMovs(x: Int,y: Int): BigInt =
    {
      if(x==1)
        {
          y
        }
      else
        {
          calMovs(x-1, 2*(y+1)-1)
        }
    }

    if (n == 0)
    {
      0
    }
    else if (n == 1)
    {
      1
    }
    else
    {
      calMovs(n, 1)
    }
  }
}
