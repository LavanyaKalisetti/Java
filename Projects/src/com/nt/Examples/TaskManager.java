/*
 *  A task manager stores up to 10 tasks. Initially, the manager stores 9 tasks.
    When a new task is created, the user should specify at which position they want
    to insert the new task. Write a program to insert the new task at the desired
    position and display the final schedule.
 */
package com.nt.Examples;

import java.util.Scanner;

public class TaskManager {
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	        String[] tasks = new String[10];
	        for (int i = 0; i < 9; i++) {
	            tasks[i] = "Task " + (i + 1); 
	        }
	        System.out.print("Enter the new task name: ");
	        String newTask = sc.nextLine();
	        System.out.print("Enter the position to insert the new task (1-10): ");
	        int position = sc.nextInt();
	        if (position < 1 || position > 10) {
	            System.out.println("Invalid position. Must be between 1 and 10.");
	            return;
	        }
	        for (int i = 9; i >= position; i--) {
	            tasks[i] = tasks[i - 1];
	        }
	        tasks[position - 1] = newTask;
	        System.out.println("\nFinal Task Schedule:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Position " + (i + 1) + ": " + tasks[i]);
	        }
	    }
	}
