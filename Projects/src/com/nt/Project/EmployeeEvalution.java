package com.nt.Project;

public class EmployeeEvalution {
	
	private String employeeName;
	private String department;
	private double baseSalary;
	private int performanceScore;
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public int getPerformanceScore() {
		return performanceScore;
	}
	public void setPerformanceScore(int performanceScore) {
		this.performanceScore = performanceScore;
	}
	
	public double calculateBonus() {
		double bonus=0.0;
		if(performanceScore>=8 && performanceScore<10)
		{
			bonus=baseSalary*0.2;
		}
		else if(performanceScore>=5 && performanceScore<7) {
			bonus=baseSalary*0.1;
		}
		else if(performanceScore<=5) {
			System.out.println("There is no bonus:"+bonus);
			
		}
			return bonus;
	}
	
	public static void main(String[] args) {
		EmployeeEvalution e1=new EmployeeEvalution();
		e1.setEmployeeName("Lavanya");
		e1.setDepartment("Faculty");
		e1.setBaseSalary(987678);
		e1.setPerformanceScore(10);
		
		System.out.println(e1.getEmployeeName());
		System.out.println(e1.getDepartment());
		System.out.println(e1.getBaseSalary());
		System.out.println(e1.getPerformanceScore());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
