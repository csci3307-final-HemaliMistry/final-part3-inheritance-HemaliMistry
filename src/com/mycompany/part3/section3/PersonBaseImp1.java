/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author Hemali8413
 *
 */
public abstract class PersonBaseImp1 implements Person {

	public String name;
	
	public PersonBaseImp1(String _name){
		name = _name;
	}
	
	public String getName() {
		return name;
	}

	

	public String getDetails() {
		return null;
	}

}
