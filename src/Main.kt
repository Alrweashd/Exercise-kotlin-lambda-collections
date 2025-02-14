import javax.swing.text.StyledEditorKit.BoldAction

fun main() {

    //Part 1
    val numbers = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    val numbersDoubled = numbers.map{it*2};
    println(numbersDoubled)

    //Part 2
    val names = mutableListOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David");
    println(filterWithA("alice"))
    println(filterNames(names,filterWithA))

    //Part 3
    val fruits = mutableListOf("apple", "banana", "kiwi", "strawberry", "grape")
    println(sortedList(fruits,findWordLength))

    //Part 4
    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it > 5 })
    //or
    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),biggerThanFive))


    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 2 == 0 })
    //or
    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),isEven))


    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 3 == 0 })
    //or
    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),multiplesOfThree))



}

//For part 2
fun filterNames(list:List<String>, filteringFun: (String)->(Boolean)): List<String>{
    return list.filter{filteringFun(it)}

}


val filterWithA: (String) -> Boolean = {
        it -> it.startsWith("A")
}


//for part 3
fun sortedList(list:List<String>, filteringFun: (String) -> Int): List<String>{
    return list.sortedByDescending(filteringFun)
}
val findWordLength: (String) -> Int = {
    it -> it.length
}

//for part 4
fun customFilter(list: List<Int>, filteringFun: (Int) -> Boolean): List<Int>{
    return list.filter(filteringFun)
}
val biggerThanFive: (Int) -> Boolean = {
    it -> it > 5
}
val isEven: (Int) -> Boolean = {
        it -> it % 2 == 0
}
val multiplesOfThree: (Int) -> Boolean = {
        it -> it % 3 == 0
}
