import java.util.LinkedList

fun main() {
    // Req1:
    // I made the map and the list immutable and the set mutable so i confirm that i used both versions of collections
    // I did not read the 3rd req so i thought that the score means gpa but, i modified them to be a grade out of 100
    val studList = listOf("Ahmed", "Mohamed", "Khaled", "Alaa", "Hamdy")
    val studMap = mapOf("Ahmed" to 78, "Mohamed" to 81, "Khaled" to 85, "Alaa" to 100, "Hamdy" to 94)
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


    // Req3:
    studList.filter { studMap[it]!! > 80 }
        .map { stud -> stud.uppercase() }
        .forEach { println(it) }


    //Req4:
    //Total score:
    val total:Int = studList.map { it -> studMap[it]!! }
        .reduce { a, b -> a+b }
    println("Total score: $total")

    //Fold:
    val result = studMap.entries.fold("") { acc, (name, score) ->
        "$acc$name: $score | "
    }.removeSuffix(" | ")
    println(result)
}