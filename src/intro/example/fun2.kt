package intro.example

//fun summer(a:Int,b:Int?)=a+b?:2
fun summer_(a:Int,b:Int?)=a+b!!//assertion operator


//fun getLength(str:String?)=str
fun word_count(sentence:String)
{

}

fun main()
{

    var str1:String?=null

    val a=20
//    var b:Int?=30//Error Kotlin: Type mismatch: inferred type is Nothing? but Int was expected
    var b:Int=30
//    b=null//Error Kotlin: Null can not be a value of a non-null type Int
     val ans= summer(a,b)
    println(ans)
}