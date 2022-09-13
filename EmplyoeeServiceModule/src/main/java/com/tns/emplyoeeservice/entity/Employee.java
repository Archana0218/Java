package com.tns.emplyoeeservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer emp_id;
	private Integer shop_id;
	private String emp_name;
	private String emp_dep;
	private float emp_salary;
	private String emp_city;
	public Employee(Integer emp_id, String emp_name, String emp_dep, 
			float emp_salary, String emp_city,Integer shop_id) {
		
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_dep = emp_dep;
		this.emp_salary = emp_salary;
		this.emp_city = emp_city;
		this.shop_id= shop_id;
	}
	public Employee() {
		super();
		
	}
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_dep() {
		return emp_dep;
	}
	public void setEmp_dep(String emp_dep) {
		this.emp_dep = emp_dep;
	}
	public float getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(float emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String getEmp_city() {
		return emp_city;
	}
	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	 public Integer getShop_id() { 
		 return shop_id; }
	 
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", shop_id=" + shop_id + ", emp_name=" + emp_name + ", emp_dep=" + emp_dep
				+ ", emp_salary=" + emp_salary + ", emp_city=" + emp_city + "]";
	}
	
	
	
	
	
}

