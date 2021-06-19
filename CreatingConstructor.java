package lab2Ex;

	class CreatingConstructor {
		int empId; 
		 String empName; 
		 //parameterized constructor with two parameters 
		 CreatingConstructor(int id, String name){ 
		this.empId = id; 
		this.empName = name; 
		 } 
		void info(){ 
		 System.out.println("Id: "+empId+" Name: "+empName); 
		 } 
		public static void main(String args[]){ 
		 CreatingConstructor obj1 = new CreatingConstructor(10245,"Chaitanya"); 
		 CreatingConstructor obj2 = new CreatingConstructor(92232,"Negan"); 
		 obj1.info(); 
		obj2.info(); 
		 } 
		} 


