abstract class Person(name:String){
    private var perName:String = name
    abstract var perAge:Int //abstract property
//    init {
//        this.perName = name
//    }
    //general attribute
    abstract fun setPersonAge(age:Int)      //abstract method
    abstract fun getPersonAge():Int             //abstract method

    fun getPersonName() {
        println("Name = $perName")
    }
}

class Employee(perName:String):Person(perName){
    override var perAge:Int = 0

    override fun setPersonAge(age:Int){
        perAge = age
    }
    override fun getPersonAge():Int {
        return perAge
    }
}