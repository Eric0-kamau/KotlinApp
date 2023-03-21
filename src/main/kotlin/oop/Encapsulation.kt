package oop

fun main(args: Array<String>) {
    var p1 = Person("king", "100")
    // Request salary and residence through access modifiers
    p1.setSalary(3000000.0)
    p1.setResidence("Nairobi")

    // Print salary and residence through access modifiers
    println(p1.getSalary())
    println(p1.getResidence())

}

class Person(var name:String, var age:String){
    private var salary:Double = 0.0
    private var residence:String = ""
    fun setSalary(salary:Double){
        this.salary = salary
    }
    fun getSalary():Double{
        return this.salary
    }
    fun setResidence(residence:String){
        this.residence = residence
    }
    fun getResidence():String{
        return this.residence
    }
    fun walk(){
        println("Yeah, i can walk")
    }
    fun run(){
        println("Yeah, i can run")
    }
}