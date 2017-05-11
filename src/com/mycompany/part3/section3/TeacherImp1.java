/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author Hemali8413
 *
 */
public class TeacherImp1 extends PersonBaseImp1 implements Teacher {
	String thoughtCourseTitle;
	
	public TeacherImp1(String _name, String _thoughtCourseTitle){
		super(_name);
		thoughtCourseTitle = _thoughtCourseTitle;
	}
	
	public String teacherFor() {
		return thoughtCourseTitle;
	}

}
