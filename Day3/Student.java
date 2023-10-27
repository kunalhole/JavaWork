package Day3;

public class Student {
	 private int sid;
     private String sname;
     private int m1;
     private int m2;
     private int m3;
     
     //default Constructor
     public Student(){

       sid=0;
       sname=null;
       m1=m2=m3=0;
  	   System.out.println("Default Constructor Called....");
  	   
     }
     
     public Student(int _id,String _sname,int _m1,int _m2,int _m3) {
  	   
  	   this.sid=_id;
  	   this.sname=_sname;
  	   this.m1=_m1;
  	   this.m2=_m2;
  	   this.m3=_m3;
  	   System.out.println("Parameterised Constructor Called....");
  	   
  	   
     }
     
     public void setName(String name) {
  	   
  	   this.sname=name;
  	   
     }
     public void setM1(int m1) {
  	   
  	   this.m1=m1;
  	   
     }
     public void setM2(int m2) {
  	   
  	   this.m2=m2;
  	   
     }
     public void setM3(int m3) {
  	   
  	   this.m3=m3;
  	   
     }
   
     public String getName() {
    	 
    	 return this.sname;
     }
    
     
     public int getId() {
    	 
    	 return this.sid;
     }
     public int getM1() {
    	 
    	 return this.m1;
     }
     public int getM2() {
    	 
    	 return this.m2;
     }
     public int getM3() {
	 
    	 return this.m3;
     }

	
     public String toString() {
    	 return "StudentId: "+this.sid+" having Name: "+this.sname;
     }


}