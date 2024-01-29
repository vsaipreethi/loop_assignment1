object loopQ4 {
  def main(args: Array[String]): Unit = {
    val a:Int=1;
    val b:Int=5;
    val sq:Int=0;
    for (i <- a to b) {
      val sq = i * i
      println(s"The square numbers from $a to $b $i is: $sq")
    }
  }
}
