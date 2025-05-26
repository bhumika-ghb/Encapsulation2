package com.school;

public class School {
	private String schoolName;
	private String schoolAddress;
	private String schoolMotto;
	private School(String schoolName,String schoolAddress,String schoolMotto){
		this.schoolName=schoolName;
		this.schoolAddress=schoolAddress;
		this.schoolMotto=schoolMotto;
	}
	public String getschoolName(){
		return schoolName;
	}
	public String getschoolAddress(){
		return schoolAddress;
	}	
	public String getschoolMotto(){
		return schoolMotto;
	}
	public void setschoolName(String schoolName){
		this.schoolName=schoolName;
	}
	public void setschoolAddress(String schoolAddress){
		this.schoolAddress=schoolAddress;
	}
	public void setschoolMotto(String schoolMotto){
		this.schoolMotto=schoolMotto;
	}
	public String toString(){
		return "School[School Name:"+schoolName+",School Address:"+schoolAddress+", School Motto:"+schoolMotto+"]";
	}
	public static School getschoolobject(String schoolName,String schoolAddress,String schoolMotto){
		if(schoolName==null||schoolAddress==null||schoolMotto==null||schoolName.isEmpty()||schoolAddress.isEmpty()||schoolMotto.isEmpty()) {
			             return null;
		}
		else {
			return new School(schoolName,schoolAddress,schoolMotto);
		}
	}
	public static void main(String[] args){
		School schoolobject=School.getschoolobject("UHS","PUSAPADU","Presentation Skills ");
		System.out.println(schoolobject);
	}
}


