fun main(args: Array<String>) {

    println("2.Implementing multiple interface")
    val cat = Cat()
    cat.soundMethod()
    cat.eatMethod()

    println()
    println("1.Interface in Kotlin")
    val obj = InterfaceTest()
    obj.doSomthing()
    val make:String = obj.absMethod()
    println(make)

    println()
    val employee = Employee("Mark")
    employee.setPersonAge(45)
    employee.getPersonAge()
    employee.getPersonName()
    println("Age = " + employee.getPersonAge())
}