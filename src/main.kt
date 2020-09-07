fun main(args: Array<String>) {
    // **********************************السؤال الثاني من التحدي الرابع***************************
    val list = listOf("Ali","Arwaa","alaa")

    println("The first element "+list.first())
    println("The last element "+list.last())

    // **********************************السؤال الثالث من التحدي الرابع***************************
    
    val sort= listOf<Int>(8,4,7,1,2,3,0,5,6)
    println("Order ascending: ${sort.sorted()}")
    println("Order descending: ${sort.sortedDescending()}")


}