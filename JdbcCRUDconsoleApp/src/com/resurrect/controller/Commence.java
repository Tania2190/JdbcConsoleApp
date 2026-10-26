package com.resurrect.controller;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.resurrect.dto.Trainee;
import com.resurrect.service.ITraineeService;
import com.resurrect.servicefactory.TraineeServiceFactory;

public class Commence {

	private static void insertOperation() {

		Scanner scanner = new Scanner(System.in);
		ITraineeService trnService;

		trnService = TraineeServiceFactory.getTraineeServiceObject();

		System.out.print("Enter your name :: ");
		String name = scanner.next();

		System.out.print("Enter the email :: ");
		String mail = scanner.next();

		System.out.print("Enter the course enrolled :: ");
		String course = scanner.next();

		LocalDateTime enrollmentDate = LocalDateTime.now();
		System.out.print("Your enrollment date :: " + enrollmentDate + "\n\n");

		String msg = trnService.addTrainee(name, mail, course, enrollmentDate);
		if (msg.equalsIgnoreCase("success")) {
			System.out.println("record inserted succesfully");
		} else {
			System.out.println("record insertion failed");
		}
		scanner.close();
	}

	private static void selectOperation() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the trainee id :: ");
		int tid = scanner.nextInt();

		ITraineeService trnService = TraineeServiceFactory.getTraineeServiceObject();
		Trainee trainee = trnService.searchTrainee(tid);
		if (trainee != null) {
			System.out.println("ID \tNAME\tE-mail\t\tCOURSE_ENROLLED\tENROLLMENT_DATE");
			System.out.println(trainee.getTid() + "\t" + trainee.getTname() + "\t" + trainee.getTemail() + "\t"
					+ trainee.getTcourse() + "\t" + trainee.getEnrollmentDate());
		} else {
			System.out.println("Record not found for the given id :: " + tid);
		}

		scanner.close();
	}
	
	private static void updateOperation() {}
	
	private static void deleteOperation() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the trainee id :: ");
		int tid = scanner.nextInt();
		
		ITraineeService trnService = TraineeServiceFactory.getTraineeServiceObject();
		String deleteMsg = trnService.deleteTrainee(tid);
		
		if (deleteMsg.equalsIgnoreCase("success")) {
			System.out.println("record deleted succesfully");
		} else if (deleteMsg.equalsIgnoreCase("not found")) {
			System.out.println("record not avilable for the given id ::" + tid);
		} else {
			System.out.println("record deletion failed");
		}
		
		scanner.close();
	}

	public static void main(String[] args) {

		//insertOperation();
		//selectOperation();
		//updateOperation();
		deleteOperation();

	}

}
