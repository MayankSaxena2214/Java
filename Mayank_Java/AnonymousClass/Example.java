//parent class of anonymous class
class Greeting
{
	public void sayHello()
	{
		System.out.println("Hello");
	}
}
class India
{	//special syntax for anonymous class
	Greeting g=new Greeting(){
		//we have to override the function
		public void sayHello(){
			System.out.println("Namaste");
		}
	};
}
		
		
class Example
{
	public static void main(String[] args){
		India india=new India();
		india.g.sayHello();
	}
}
