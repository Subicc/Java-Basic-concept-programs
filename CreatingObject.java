package lab2Ex;

class Student 	{
		int age;
		String name,city;
		static int m;
		
		
		public void PutData() {
			System.out.println("Age:"+age);
			System.out.println("Name:"+name);
			System.out.println("City:"+city);
	     	System.out.println();
		}
		
	
}

class CreatingObject{
public static void main(String arg[]) {	
	Student s1=new Student();
    Student s2=new Student();
    s1.age=22;
     s1.name="Subic";
     s1.city="Nellai";
     s1.PutData();
     s2.age=20;
     s2.name="Alan";
     s2.city="Nellai";
     s2.PutData();
     s1.m=20;
     s2.m=22;
     Student.m=21;
     System.out.println("S1.m:"+s1.m);
     System.out.println("S2.m:"+s2.m);
     System.out.println("Student:"+Student.m);
     
     

}
    
    
 }


