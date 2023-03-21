fun main(args: Array<String>) {
    var names = arrayListOf("Yvonne", "Erick", "Dennis", "Alphy", "Thelma")
    println(names[2])
    names.add("King")
    // use for in loop to print
    for(i in 0 until (names.size - 1)){
        println(names[i])
    }


    // you can use foreach loop as well
    names.forEach{
        println(it)
    }
}