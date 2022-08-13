fun main() {
    println(removeGivenCharacter("Sahar1",'a'))
    println(primeNumbers(6,21))
    println(repeatedCharacter("sahar",'a'))
}
fun removeGivenCharacter(text : String,n : Char): String{
    val string = text.filter { it != n }
    return string
}
fun repeatedCharacter(text: String,n: Char):Int{
    var count = 0
    text.forEach { if(it == n ) count++}
    return count
}
fun primeNumbers(num1 : Int , num2: Int) :MutableList<Int>{
    var list = mutableListOf<Int>()
    for(num in num1..num2){
        for(i in 2..num){
            if(num % i == 0){
                if(num==i) list.add(num)
                else break
            }
        }
    }
    return list
}