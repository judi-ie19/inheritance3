fun main(){
 var teacher=MathsTeacher(age = 18, name = "Veronica")
    teacher.teachMaths()
   println( teacher.age)
   println( teacher.name)
 var footballer=Footballer(age = 25, name = "Jack")
    println(footballer.age)
    println(footballer.name)
    footballer.playFootball()



}

 open class Person(var age:Int,var name:String){

}
class MathsTeacher( age: Int, name:String):Person( age,name){
       fun teachMaths(){
           println("teach in primary school")
       }
}
class Footballer(age: Int,name:String):Person(age,name){
    fun playFootball(){
        println("play football with his friends")
    }

}