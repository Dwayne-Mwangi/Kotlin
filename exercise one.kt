fun main(args: Array<String>){

    println("Enter your name: ")

    println("Enter your year of completion: ")

    println("Enter your previous school: ")

    println("Enter your course: ")


    var name:String = readLine()!!

    var year:Int = readLine()!!.toInt()

    val School:String = readLine()!!

    var Course:String = readLine()!!


    print("Your name is $name and you completed High School in the year $year in $School and are currently pursuing the course $Course ")

}

