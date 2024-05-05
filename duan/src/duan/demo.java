package duan;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

interface Iemployee {
	double countofsalary();
}

abstract class hospitalstaff implements Iemployee {

	int ID;
	private int Age;
	String Name;
	private String Gender;
	private String Birthday;
	private String Birthplace;
	private String People;
	private String Address;
	private String Phonenumber;
	private double Basicsalary;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBirthday() {
		return Birthday;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
	}

	public String getBirthplace() {
		return Birthplace;
	}

	public void setBirthplace(String birthplace) {
		Birthplace = birthplace;
	}

	public String getPeople() {
		return People;
	}

	public void setPeople(String people) {
		People = people;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}

	public double getBasicsalary() {
		return Basicsalary;
	}

	public void setBasicsalary(double basicsalary) {
		Basicsalary = basicsalary;
	}

	public hospitalstaff(int iD, int age, String name, String gender, String birthday, String birthplace, String people,
			String Address, String phonenumber, double basicsalary) {
		super();
		ID = iD;
		Age = age;
		Name = name;
		Gender = gender;
		Birthday = birthday;
		Birthplace = birthplace;
		People = people;
		Address = Address;
		Phonenumber = phonenumber;
		Basicsalary = basicsalary;
	}

	hospitalstaff() {
		this.ID = 0;
		this.Age = 0;
		this.Name = "";
		this.Gender = "";
		this.Birthday = "";
		this.Birthplace = "";
		this.People = "";
		this.Address = "";
		this.Phonenumber = "";
		this.Basicsalary = 0;

	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID: ");
		this.setID(sc.nextInt());
		sc.nextLine();

		System.out.print("Age: ");
		this.setAge(sc.nextInt());
		sc.nextLine();

		System.out.print("Name: ");
		this.setName(sc.nextLine());

		System.out.print("Gender: ");
		this.setGender(sc.nextLine());

		System.out.print("Birthday: ");
		this.setBirthday(sc.nextLine());

		System.out.print("Birthplace: ");
		this.setBirthplace(sc.nextLine());

		System.out.print("People: ");
		this.setPeople(sc.nextLine());

		System.out.print("Address: ");
		this.setAddress(sc.nextLine());

		System.out.print("Phonenumber: ");
		this.setPhonenumber(sc.nextLine());

		System.out.print("Basicsalary: ");
		this.setBasicsalary(sc.nextDouble());

	}

	void output() {
		System.out.println("ID:" + this.getID());
		System.out.println("Age:" + this.getAge());
		System.out.println("Name:" + this.getName());
		System.out.println("Gender:" + this.getGender());
		System.out.println("Birthday:" + this.getBirthday());
		System.out.println("Birthplace:" + this.getBirthplace());
		System.out.println("People:" + this.getPeople());
		System.out.println("Address:" + this.getAddress());
		System.out.println("Phonenumber:" + this.getPhonenumber());
		System.out.println("Basicsalary:" + this.getBasicsalary());

	}

	public abstract double countofsalary();

}

class Doctor extends hospitalstaff {
	private String Level;
	private String Office;
	private double Salarybonus;

	public String getLevel() {
		return Level;
	}

	public void setLevel(String Level) {
		Level = Level;
	}

	public String getOffice() {
		return Office;
	}

	public void setOffice(String Office) {
		Office = Office;
	}

	public double getSalarybonus() {
		return Salarybonus;
	}

	public void setSalarybonus(double salarybonus) {
		Salarybonus = salarybonus;
	}

	public Doctor() {

	}

	public Doctor(int iD, int age, String name, String gender, String birthday, String birthplace, String people,
			String Address, String phonenumber, double basicsalary, String level, String office, double salarybonus) {
		super(iD, age, name, gender, birthday, birthplace, people, Address, phonenumber, basicsalary);
		Level = level;
		Office = office;
		Salarybonus = salarybonus;
	}

	@Override
	void input() {
		super.input();
		Scanner sc = new Scanner(System.in);

		System.out.print("Level: ");
		this.setLevel(sc.nextLine());

		System.out.print("Office: ");
		this.setOffice(sc.nextLine());

		System.out.print("Salarybonus: ");
		this.setSalarybonus(sc.nextDouble());
		sc.nextLine();
	}

	void output() {
		super.output();
		System.out.println("Level: " + this.getLevel());
		System.out.println("Office: " + this.getOffice());
		System.out.println("Salarybonus: " + this.getSalarybonus());

	}

	@Override
	public double countofsalary() {
		double salary = 0;
		salary = this.getBasicsalary() + this.getSalarybonus();
		return salary;

	}
}

