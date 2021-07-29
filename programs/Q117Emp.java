package day7;
public class Q117Emp {  
int id;  
String name;  
Q117Address address;  
  
public Q117Emp(int id, String name,Q117Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String[] args) {  
	Q117Address address1=new Q117Address("gzb","UP","india");  
	Q117Address address2=new Q117Address("gno","UP","india");  
  
Q117Emp e=new Q117Emp(111,"varun",address1);  
Q117Emp e2=new Q117Emp(112,"arun",address2);  
      
e.display();  
e2.display();  
      
}  
}  


