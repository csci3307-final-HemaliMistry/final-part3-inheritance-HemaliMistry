/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author Hemali8413
 *
 */
public class MainEntry {

	
	public static void main(String[] args) {
		Teacher t = new TeacherImp1("ilker" , "java");
		Student s = new StudentImp1("Hemali", "java");
		Person p1 = t;
		Person p2 = (Person) s;
		
		System.out.println("Teacher: " + p1.getName());
		System.out.println("Student: " + p2.getName());
		
	}

}
