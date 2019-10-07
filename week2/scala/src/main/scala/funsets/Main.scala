package funsets

object Main extends App {

  import FunSets._

  println(contains(singletonSet(3), 1))
  val s1 = singletonSet(1000)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)
  val s = union (union(s1, s2),s3)
  forall(s1,(p)=> true);
}