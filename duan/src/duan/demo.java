package duan;
public class demo {
	public static void main(String[] args) throws IOException {
		hospitalstaffList list = new hospitalstaffList();
		list.input();

		Scanner sc = new Scanner(System.in);
		int chucnang;

		while (true) {
			System.out.println("\n--------\n");
			System.out.println("1.Export array.");
			System.out.println("2.Sort salary from high to low.");
			System.out.println("3.Print the employee with the highest salary and save it to the file.");
			System.out.println("4.Search employee by ID.");
			System.out.println("5.Update employee information.");
			System.out.println("6.Delete employee.");
			System.out.println("7.Search for employee by name.");
			System.out.println("8.Calculate the total of all employee salary.");
			System.out.println("9.Thoat khoi chuong trinh");

			System.out.println("ENTER FUNCTION:");
			chucnang = sc.nextInt();
			sc.nextLine();
			switch (chucnang) {
			case 1:
				System.out.println("Export array:");
				list.output();
				break;
			case 2:
				System.out.println("Nextwork after sort from high to low according to salary:");
				list.sort();
				list.output();
				break;
			case 3:
				list.sort();
				System.out.println("The employee with the highest salary is:");
				list.the_best_staff_of_file();
				break;
			case 4:
				int timkiem;
				System.out.println("Enter the employee ID you want to find:");
				timkiem = sc.nextInt();
				list.search(timkiem);
				break;
			case 5:
				System.out.println("Update employee information:");
				list.update();
				break;
			case 6:
				System.out.println("Delete employee:");
				list.delete();
				break;
			case 7:
				System.out.println("Search for employee:");
				list.find();
				break;
			case 8:
				list.sumsalary();
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("This function does not exist");
			}
		}
	}
}



	
