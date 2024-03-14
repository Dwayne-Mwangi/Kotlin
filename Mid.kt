import com.sun.jdi.IntegerType

fun main(){
    trial()

//    println(name)
//
//    println(age)
//
//    println(opinion)
//
//    println(money)
//
//    println(grade)

    operators()

}

fun trial(){

    println("Dante is the GREATEST OF ALL TIMEEEEEEE!!!!!!!")

}

//<----///VARIABLES///---->
//
//var name:String = "Dwayne"
//
//var age:Int = 19
//
//var opinion:Boolean = true or false
//
//var money:Double = 0.0758
//
//val grade:Char = 'A'


//<------//OPERATORS//----->//

fun operators(){

    println("Enter a number x: ")

    println("Enter a number y: ")

    val physics:Int = readLine()!!.toInt()

    val geography:Int = readLine()!!.toInt()

    var modulas:Int = (physics % geography)

    var multiplication:Int = (physics * geography)

    var division:Int = (physics / geography)

    var addition:Int = (physics + geography)

    var subtraction:Int = (physics - geography)

    println("Remainder: $modulas")

    println("Multiplication: $multiplication")

    println("Quotient: $division")

    println("Sum: $addition")

    println("Subtraction: $subtraction")

}
