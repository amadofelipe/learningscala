object Main extends App{

  def mainMethod(args: Array[String]) = {
    val stringVal:String = "essa é uma string"
    var stringVar:String = "essa também é uma string"
    
      val doubleVal:Double = 3.14
      var doubleVar:Double = 1.123
      
      val int = 1
      
      if(fact(3) == 6) println("promissor!") else ()
      
  }
  mainMethod(null);
  
  
  
  def fact(n:Int):Int = if (n == 1) 1 else n*fact(n-1)
    
 
}

class CuteTestClass {
	def sayHello() {
	  println("Oi, tudo bem? sou a classe CuteTestClass, muito prazer!")
	}
}

class AngryTestClass(n:Int) {
	def sayHello() {
	  println("Aqui é a AngryTestClass, vai arranjar o que fazer em vez de ficar me enchendo com esses números! O que quer que eu faça com " + n + "?")
	}
}

case class DepressiveCaseClass(n:Int) {
  def sayHello() {
	  println("Ninguém me ama, ninguém me quer.. por que " + n + "?")
  }
}

case class UselessCaseClass {
  
}