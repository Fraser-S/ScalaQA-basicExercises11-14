/**
  * Created by Fraser on 05/06/2017.
  */
object Main {
  def displayStringXTimes(text : String, timesToLoop : Int) : Unit= {
    for(i<-1 to timesToLoop)
    {
      println(text)
    }
  }

  def displayStringXTimesFormatted(text : String, timesToLoop : Int) : Unit= {
    for(i<-1 to timesToLoop){
      for(i<-1 to timesToLoop)
      {
       print(f"$text ")
      }

      print("\n")
    }
  }

  def main(args : Array[String]) : Unit = {
    displayStringXTimes("Hi", 3)
    displayStringXTimesRectangle("H", 4)
  }
}
