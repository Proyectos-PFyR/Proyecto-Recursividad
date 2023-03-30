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

    if (list.tail.isEmpty)
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
    def max(n:Int, list: List[Int]): Int =
    {
      if(list.isEmpty)
      {
        n
      }
      else
      {
        if (n > list.head)
        {
          max(n, list.tail)
        }
        else
        {
          max(list.head, list.tail)
        }
      }
    }
    max(list.head, list.tail)
  }

  def movsTorresHanoi(n: Int): BigInt =
  {
    if (n == 1)
    {
      1
    }
    else
    {
      2 * (movsTorresHanoi(n - 1)) + 1
    }
  }

  def torresHanoi(n: Int, t1: Int, t2: Int, t3: Int): List[(Int, Int)] =
  {
    if(n == 1)
    {
      List((t1, t3))
    }
  else
    {
      torresHanoi(n - 1 , t1, t3, t2) ++ List((t1, t3)) ++ torresHanoi(n - 1 , t2, t1, t3)
    }
  }
}
