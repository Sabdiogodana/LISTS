fun main(){
 evenList(listOf("Mollen","Ahatho","Amina","Jillo","Kimani","Yahya","Najma","Abu","Bilitu","Nasole"))
println(height(listOf(2.3,4.2,3.2)))
 var student1= Person("Diana",20,2.6,55)
 var student2=Person("Jeruto",18,3.4,49)
 var both = listOf( student1,student2,)
 var x = both.sortedByDescending { person -> person.age  }
 println(x)

 var student3 = Person("Sabdio", 24, 1.2, 57)
 var student4 = Person("Wangaree", 16, 2.1, 40)
 var new = mutableListOf(student3,student4)
 println(new.plus(new))

 var a = Car("KCH 224B", 56)
 var b = Car("KDD 671F", 34)
 var cars = listOf(a, b)
 println(carDetails(cars))

}

fun evenList(names:List<String>):List<String>{
 names.forEachIndexed { index, s ->
  if (index % 2 == 0) {
   println(s)
  }
 }
 return names
}
//Given a list of people's heights in metres. Write a function that returns the average height and the total height
fun height(values:List<Double>):String {
 var addition = values.sum()
 var averageHeight = values.average()
 var both = "$addition, $averageHeight"
// println(both)
 return both
}

data class Person(var name:String,var age:Int,var height:Double,var weight:Int)
fun createMorePeople(more:List<Any>):List<Any>{
 return listOf()
}
fun carDetails(f:List<Car>):Int {
 var z = 0
 f.forEach { gari -> gari.mileage
  z += gari.mileage
 }
 var total = z/f.count()
 return total
}

data class Car(var registration:String, var mileage:Int)