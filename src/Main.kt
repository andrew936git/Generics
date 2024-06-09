//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val text = "Привет мир"
    val number = 256
    val decimal = 25.05
    val bool = true
    printGeneric(text)
    printGeneric(number)
    printGeneric(decimal)
    printGeneric(bool)
    printGeneric("---------------------------------")
//2
    val personOne = Person("Alex", 89525227787)
    val personTwo = Person("Mike", "+79525227787")
    personOne.printInfo()
    personTwo.printInfo()
    printGeneric("----------------------------------")
//3
    val num = 25
    val string = "Привет, мир!"
    val array = listOf(1,5,6,8,0,3)
    val symbol = 'O'
    decoration(num,'{')
    decoration(string,'"')
    decoration(array, '<')
    decoration(symbol,'\'')
}
fun <T> printGeneric(element: T){
    println("$element ")
}

fun <T> decoration(element: T, decor: Char) {
    when (decor) {
        '{' -> println("{$element}")
        '\"' -> println("[$element]")
        '<' -> println("\"$element\"")
        '\'' -> println("($element)")
    }
}