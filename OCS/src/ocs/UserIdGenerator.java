/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocs;

/**
 *
 * @author UMESH
 */
public class UserIdGenerator {
	private static String uname;
	private UserIdGenerator() {}
        
	public static String getGenerator(){
		return uname;
	}
	public static String setGenerator(String fname,String lname){
	     UserIdGenerator.uname=fname.substring(0,3)+lname.substring(0,3);
	     return uname;
             
	}
}
