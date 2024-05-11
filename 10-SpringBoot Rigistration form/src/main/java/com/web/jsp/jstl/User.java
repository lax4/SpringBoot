package com.web.jsp.jstl;

import java.util.List;

public class User {
		private String name;
		private String Password;
		private String cnfmPassword;
		private String email;
		private List<String> gender;
		private List<String> courses;
		private List<String> batchs;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getCnfmPassword() {
			return cnfmPassword;
		}
		public void setCnfmPassword(String cnfmPassword) {
			this.cnfmPassword = cnfmPassword;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public List<String> getGender() {
			return gender;
		}
		public void setGender(List<String> gender) {
			this.gender = gender;
		}
		public List<String> getCourses() {
			return courses;
		}
		public void setCourses(List<String> courses) {
			this.courses = courses;
		}
		public List<String> getBatchs() {
			return batchs;
		}
		public void setBatchs(List<String> batchs) {
			this.batchs = batchs;
		}
		public User(String name, String password, String cnfmPassword, String email, List<String> gender,
				List<String> courses, List<String> batchs) {
			super();
			this.name = name;
			Password = password;
			this.cnfmPassword = cnfmPassword;
			this.email = email;
			this.gender = gender;
			this.courses = courses;
			this.batchs = batchs;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", Password=" + Password + ", cnfmPassword=" + cnfmPassword + ", email="
					+ email + ", gender=" + gender + ", courses=" + courses + ", batchs=" + batchs + "]";
		}
				
		
}
