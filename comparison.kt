import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){

    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    val formatted = current.format(formatter)
    println("Date and Time: $formatted")

    compare()

    iffss()

    check()

}

fun compare(){

    var x:Int = 45

    var y:Int = 50

    var z:Int = 55


    //----IF STATEMENTS-----//


    if(x > y){
        println("$x is the largest")
    }

    else if( y > z){
        println("$y is the largest")
    }

    else if(z > x){
        println("$z is the largest")
    }

    else{
        println("Values x, y and z are similar")
    }


    //-----OR-----//


//    if (x >= y && x >= z) {
//
//        println("$x is the greatest")
//
//    } else if (y >= x && y >= z) {
//
//        println("$y is the greatest")
//
//    } else {
//
//        println("$z is the greatest")
//
//    }


    ///----OR------////(MAX OF FOR COMPARISON)


//    val result = maxOf(x,y,z)
//
//    println("$result is the greatest") //Output:100

}

    ///----WHILE LOOP(INCREMENT)-----///

fun iffss(){

    var grade = 10

    while (grade <= 0){
        println(grade)
        grade++
    }


}

fun check(){

    println("Enter desired value: ")

    var value:Int = readLine()!!.toInt()

    if(value < 0){
        println("ERROR 403: NEGATIVE VALUE ENTERED")
    }

    else if(value >= 0 && value < 10  ){
        println("One digit")
    }

    else if(value >= 10 && value < 100){
        println("Two digits")
    }

    else if(value >= 100){
        println("Three or more digits")
    }


}

