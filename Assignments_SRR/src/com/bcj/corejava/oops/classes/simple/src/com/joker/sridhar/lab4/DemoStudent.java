package com.joker.sridhar.lab4;

class DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		
		student.setStudentId(1001);
		student.setQualifyingExamMarks(95.0f);
		student.setResidentialStatus('D');
		student.setYearOfEngg(2);
		System.out.println("studentid : "+student.getStudentId());
		System.out.println("qualifying Exam Marks :"+student.getQualifyingExamMarks());
		System.out.println("residential status : "+student.getResidentialStatus());
		System.out.println("current year of engg"+student.getYearOfEngg());
		
		

	}

}
