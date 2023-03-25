package object FuncionesRecursivas
{
  def maxLin(list: List[Int]): Int =
  {
    def max(primerValor: Int, segundoValor: Int): Int =
    {
      if (primerValor > segundoValor)
      {
        primerValor
      }
      else
      {
        segundoValor
      }
    }

    if(list.isEmpty)
    {
    0
    }
    else if (list.tail.isEmpty)
    {
      list.head
    }
    else
    {
      max(list.head, maxIt(list.tail))
    }

  }

  def maxIt(list: List[Int]): Int =
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

  def movsTorresHanoi(n: Int): BigInt =
  {
    def calMovs(x: Int): Int =
    {
      if (x == 1)
      {
        1
      }
      else
      {
        operarMovs(calMovs(x-1))
      }
    }

    def operarMovs(a: Int): Int =
    {
      (2*a)+1
    }

    if (n == 0)
    {
      0
    }
    else
    {
      calMovs(n)
    }
  }

}
