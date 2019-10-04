package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = if(c <= r) {
    if(r==0 || c== 0) 1
    else
      pascal(c-1,r-1) + pascal(c,r-1)
  }else 0

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def loop(acc:Int,chars:List[Char]) : Boolean = {
      if(chars.isEmpty) acc == 0
      else if(acc >= 0 ){
        if(chars.head.equals('(')) loop(acc+1,chars.tail.toList)
        else if (chars.head.equals(')')) loop(acc-1,chars.tail)
        else loop(acc,chars.tail.toList)
      }else false
    }
    loop(0,chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0 )  1
    else if(money > 0 && !coins.isEmpty){
      countChange(money-coins.head,coins) + countChange(money,coins.tail)
    }else 0
  }
}
