package junit.test.example03.execution;

public class Student {
	int roll_no;
	String name;
	
	float percentage;
	String grade;
	
	public Student(int rn,String nm,float p) {
		this.roll_no=rn;
		this.name=nm;
		this.percentage=p;
	}
	
	public String cal_Grade() {
		if(percentage < 35)
			grade="Fail";
		else if(percentage <  50)
			grade="Pass Class";
		else if(percentage < 60)
			grade="Second Class";
		else if(percentage < 70)
			grade = "First Class";
		else
			grade = "Distinction";
		return grade;
	}
/*
 <35 - Fail
 >= 35 and <50 = pass
  >= 50 and <60 = Second Class
   >= 60 and <70 = First Class
    >= 70 and = Distinction 
*/
	
	public void Display(){
		System.out.println("Roll Number :" + roll_no);
		System.out.println("Name : "+name);
		System.out.println("Percentage : "+percentage);
		System.out.println("Grade : "+grade);
	}
}
