object loopQ3 {
  def main(args: Array[String]): Unit = {
    val a:Int=1;
    val b:Int=50;
    var add:Int=0;
    for( i<-a to b) {
      add+= i
    }
    println(s"sum of all numbers from $a to $b is $add")
  }
}

