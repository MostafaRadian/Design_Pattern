package cor.com;
import java.util.ArrayList;

import cor.com.Gateways.*;
import cor.com.Messages.*;
import cor.com.Users.*;


public class Course {
	
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;
	
	ArrayList<Professor> professorsForEmailNotification;
	ArrayList<Professor> professorsForSMSNotification;
	
	ArrayList<TA> TAsForEmailNotification;
	ArrayList<TA> TAsForSMSNotification;
	
	ArrayList<Student> studentsForEmailNotification;
	ArrayList<Student> studentsForSMSNotification;
	
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<String>();
		exams = new ArrayList<String>();
		grades = new ArrayList<String>();
		
		professorsForEmailNotification = new ArrayList<Professor>();
		professorsForSMSNotification = new ArrayList<Professor>();
		
		TAsForEmailNotification = new ArrayList<TA>();
		TAsForSMSNotification = new ArrayList<TA>();
		
		studentsForEmailNotification = new ArrayList<Student>();
		studentsForSMSNotification = new ArrayList<Student>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void subscribeProfessorForEmailNotification(Professor professor) {
		professorsForEmailNotification.add(professor);
	}
	
	public void subscribeProfessorForSMSNotification(Professor professor) {
		professorsForSMSNotification.add(professor);
	}
	
	public void subscribeTAForEmailNotification(TA ta) {
		TAsForEmailNotification.add(ta);
	}
	
	public void subscribeTAForSMSNotification(TA ta) {
		TAsForSMSNotification.add(ta);
	}
	
	public void subscribeStudentForEmailNotification(Student student) {
		studentsForEmailNotification.add(student);
	}
	
	public void subscribeStudentForSMSNotification(Student student) {
		studentsForSMSNotification.add(student);
	}
	
	
	
	public void AddAssignment(String assignBody,users use) {
		if(!(use instanceof Student)){

			String[] placeholders = new String[] {assignBody};
			notifyAllUsers(placeholders);
		}
		else
			System.out.print("Students cannot add assignment");
	}
	public void AddTask(String task, users use) {
		if(!(use instanceof Student)){

			String[] placeholders = new String[] {task};
			notifyAllUsers(placeholders);
		}
		else
			System.out.print("Students cannot add assignment");
	}
	public void PostGrade(String grade, users use) {
		if(!(use instanceof Student)){

			String[] placeholders = new String[] {grade};
			notifyAllUsers(placeholders);
		}
		else
			System.out.print("Students cannot add assignment");
	}
	public void AddExam(String exam, users use) {
		if(!(use instanceof Student)){

			String[] placeholders = new String[] {exam};
			notifyAllUsers(placeholders);
		}
		else
			System.out.print("Students cannot add assignment");
	}
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	private void notifyAllUsers(String[] placeholders) {
		// notify users by email
		TaskAddedEmailMessage msg = new TaskAddedEmailMessage();
		String notification = msg.prepareMessage(placeholders);
		
		// open connection for Email gateway and do some configurations to the object
		
		EmailGateway emailGateway = new EmailGateway();
		
		
		for (Professor professor : professorsForEmailNotification) {
			professor.notifyProfessor(notification);
			emailGateway.sendMessage(notification, professor.getEmail());
		}
		
		for (TA ta : TAsForEmailNotification) {
			ta.notifyTA(notification);
			emailGateway.sendMessage(notification, ta.getEmail());
		}
		
		for (Student student : studentsForSMSNotification) {
			student.notifyStudent(notification);
			emailGateway.sendMessage(notification, student.getEmail());
		}
	}
	
	
	
	
}
