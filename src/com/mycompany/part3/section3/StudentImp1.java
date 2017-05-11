/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author Hemali8413
 *
 */
public class StudentImp1 extends PersonBaseImp1 implements Student {

	String takenCourseTitle;
	
	public StudentImp1(String _name, String _takenCourseTitle){
		super(_name);
		takenCourseTitle = _takenCourseTitle;
	}
	public String studiesFor() {
		return takenCourseTitle;
	}

}
