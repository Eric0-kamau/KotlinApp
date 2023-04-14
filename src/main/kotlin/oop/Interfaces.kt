package oop

fun main(args: Array<String>) {
    var sch1 = School()
    sch1.motto()
    sch1.mission()
}
interface A{
    fun motto(){
        println("This is our motto")
    }
}
interface B{
    fun mission(){
        println("This is our mission")
    }
}
class School: A, B