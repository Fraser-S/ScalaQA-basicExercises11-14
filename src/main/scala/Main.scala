/**
  * Created by Fraser on 05/06/2017.
  */
object Main {
  def displayStringXTimes(text: String, timesToLoop: Int): Unit = {
    for (i <- 1 to timesToLoop) {
      println(text)
    }
  }

  def displayStringXTimesFormatted(text: String, timesToLoop: Int): Unit = {
    for (i <- 1 to timesToLoop) {
      for (i <- 1 to timesToLoop) {
        print(f"$text ")
      }

      print("\n")
    }
  }

  def displayStringsXTimesWithGuards(text1 : String, text2 : String, timesToLoop : Int) : Unit = {
    for(i <- 1 to timesToLoop){
      //if i is divisible by 3 and 5 display both strings
      if(i % 3 == 0 && i % 5 == 0)
      {
        print(text1+text2)
        //if i is divisible by three display first string
      } else if(i % 3 == 0)
      {

        print(text1)
        //else if i is divisible by three display first string
      } else if(i % 5 == 0)
      {
        print(text2)
        //else display i
      } else {
        print(i)
      }

      //add a comma if not at end of loop
      if(i < timesToLoop)
        print(",")
      else
        print("\n")
    }
  }

  def main(args: Array[String]): Unit = {
    displayStringXTimes("Hi", 3)
    displayStringXTimesFormatted("H", 4)
    displayStringsXTimesWithGuards("Fizz", "Buzz", 15);
  }
}
