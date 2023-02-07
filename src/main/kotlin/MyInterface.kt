interface MyInterface{
    var id:Int //abstract property
    fun absMethod():String //abstract Method
    fun doSomthing(){ //General Method
        println("MyInterface doing some work")
    }
}
interface MyInterface1{
    //fun soundMethod() //abstract method
    fun soundMethod(){
        println("Cat Meow!!")
    }
    fun eatMethod() //abstract method
}
interface MyInterface2{
    //fun eatMethod() //abstract method
    fun soundMethod(){
        println("Cat Meow Meow!!")
    }
    fun eatMethod(name:String) //abstract method
}

class Cat:MyInterface1,MyInterface2{
    override fun soundMethod(){
        super<MyInterface1>.soundMethod()
        super<MyInterface2>.soundMethod()
    }
    override fun eatMethod(){
        println("Cat eat Fish")
    }
    override fun eatMethod(n:String){
        println("Cat eat Fish $n")
    }
}

class InterfaceTest:MyInterface{
    override var id:Int = 101
    override fun absMethod():String{
        return "Implementing abstract method"
    }
}