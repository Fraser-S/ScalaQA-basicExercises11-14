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


  def displayStringXTimesRecursive(text: String, timesToLoop: Int, loopCounter: Int): Unit = {
    if(timesToLoop >= loopCounter){
      println(text)
      val counter : Int = loopCounter + 1
      displayStringXTimesRecursive(text, timesToLoop, counter)
    }
  }

  def displayStringXTimesFormattedRecursive(text: String, timesToLoop: Int, loopCounter: Int): Unit = {
    if(timesToLoop >= loopCounter)
    {

      val counter: Int = loopCounter + 1

      for (i <- 1 to timesToLoop) {
        print(f"$text ")
      }
      print("\n")

      displayStringXTimesFormattedRecursive(text,timesToLoop,counter)
    }
  }

  def displayStringsXTimesWithGuardsRecursive(text1 : String, text2 : String, timesToLoop : Int, loopCounter: Int) : Unit = {
    if(timesToLoop >= loopCounter)
    {


      //if i is divisible by 3 and 5 display both strings
      if(loopCounter % 3 == 0 && loopCounter % 5 == 0)
      {
        print(text1+text2)
        //if i is divisible by three display first string
      } else if(loopCounter % 3 == 0)
      {

        print(text1)
        //else if i is divisible by three display first string
      } else if(loopCounter % 5 == 0)
      {
        print(text2)
        //else display i
      } else {
        print(loopCounter)
      }

      //add a comma if not at end of loop
      if(loopCounter < timesToLoop)
        print(",")
      else
        print("\n")

      val counter: Int = loopCounter + 1
      displayStringsXTimesWithGuardsRecursive(text1, text2, timesToLoop, counter)
    }
  }

  def main(args: Array[String]): Unit = {
    //standard
    println("Non-Recursive Loops")
    displayStringXTimes("Hi", 3)
    displayStringXTimesFormatted("H", 4)
    displayStringsXTimesWithGuards("Fizz", "Buzz", 15)

    //recursive
    println("\nRecursive Loops")
    displayStringXTimesRecursive("Hi", 3, 1)
    displayStringXTimesFormattedRecursive("H", 4, 1)
    displayStringsXTimesWithGuardsRecursive("Fizz", "Buzz", 15, 1)
  }
}
