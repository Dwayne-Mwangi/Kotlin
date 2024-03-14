fun main(){

//    ifss()

    ifpositiveornegative()

    gradesys()


}
//
//fun ifss(){
////
////    println("Enter Biology Marks: ")
////
////    println("Enter Grading System to be used: ")
//
//    var biology:Int = 80
//
//    var grade = 80
//
//
//if (biology > grade){
//
//    println("A+")
//}
//    else if(biology == grade){
//
//        println("Biology is equal to Grading System used!!")
//    }
//
//    else{
//        println("A-")
//}
//
//}

fun ifpositiveornegative(){

    println("Enter value X: ")


    var x:Int = readLine()!!.toInt()

if (x == 0){
    println("X is equal to Zero")
}

    else if(x > 0){
        println("X is Positive")
    }

    else{
        println("X is Negative")
    }



}


fun gradesys(){

    println("Maths Score: ")

    println("CRE Score: ")

    println("English Score: ")

    println("Kiswahili Score: ")

    println("Science Score: ")

    println("Social Studies Score: ")


    var math:Int = readLine()!!.toInt()

    var cre:Int = readLine()!!.toInt()

    var english:Int = readLine()!!.toInt()

    var kiswahili:Int = readLine()!!.toInt()

    var science:Int = readLine()!!.toInt()

    var sst:Int = readLine()!!.toInt()

    var sum:Int = (math + english + sst + kiswahili + cre + science)

    var Average:Int = (sum / 6)


if(Average > 80){
    println("Grade: A+")
}
    else if(Average > 75){
        println("Grade: A-")
    }

    else if(Average > 69){
        println("Grade: B+")
    }

    else if(Average > 64){
        println("Grade: B")
    }

    else if(Average > 59){
        println("Grade: B-")
    }

    else if(Average > 54){
        println("Grade: C+")
    }

    else if(Average > 49){
        println("Grade: C")
    }

    else if(Average > 44){
        println("Grade: C-")
    }

    else if(Average > 39){
        println("Grade: D+")
    }

    else if(Average > 34){
        println("Grade: D")
    }

    else if(Average > 29){
        println("Grade: D-")
    }

    else{
        println("Grade: E")
    }


}