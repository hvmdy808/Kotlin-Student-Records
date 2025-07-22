import java.util.LinkedList

fun main() {
    // Req1:
    // I made the map and the list immutable and the set mutable so i confirm that i used both versions of collections
    val studList = listOf("Ahmed", "Mohamed", "Khaled", "Alaa", "Hamdy")
    val studMap = mapOf("Ahmed" to 3.1, "Mohamed" to 3.5, "Khaled" to 3.4, "Alaa" to 4, "Hamdy" to 3.3)
    val gradSet = mutableSetOf("Ahmed", "Mohamed")
    println(studList)
    println(studMap)
    println(gradSet)


    // Req2:
    for (stud in studList) {
        if(!gradSet.contains(stud)) {
            println("Name: $stud -- Score: ${studMap[stud]}")
        }
    }
}