
	
//Submited by Ayush binjola
class superDepartment
					 {
						 String departmentName()
						 {
							 String name="Super department";
							 return name;
						 }
						 String getTodaysWork()
						 {
							return "No Work as of now";
						 }
						 String getWorkDeadline()
						 {
							 return "Nil ";
						 }
						 String isTodayAHoliday()
						 {
							 return "Today is not a holiday ";
						 }
		}
	class AdminDepartment extends superDepartment
	{
		String departmentName() {
			return "Admin Department";
		}
		String getTodaysWork()
		{
			return "Complete your documents Submission";

		}
		String getWorkDeadline()
		{
			return "Complete by EOD";
		}
	}
	class HrDepartment extends AdminDepartment
	{
		String departmentName() {
			return "HR Department";
		}
		
		String getTodaysWork()
		{
			return "Fill today’s worksheet and mark your attendance";

		}
		
		String doActivity()
		{
			return "team Lunch";
		}
	}
	
	class TechDepartment extends AdminDepartment
	{
		String departmentName() {
			return "Tech Department";
		}
		
		String getTodaysWork()
		{
			return "Complete coding of module 1";

		}
		String getTechStackInformation()
		{
			return "core Java";
		}
		
	}



public class Driver {
public static void main(String[] args) {
	AdminDepartment ad =new AdminDepartment();
	HrDepartment hr=new HrDepartment();
	TechDepartment th=new TechDepartment();
//	ad.departmentName();
System.out.println("Welcome "+ad.departmentName());
System.out.println(ad.getTodaysWork());
System.out.println(ad.getWorkDeadline());
System.out.println(ad.isTodayAHoliday());
System.out.println("Welcome "+hr.departmentName());
System.out.println(hr.doActivity());
System.out.println(hr.getTodaysWork());
System.out.println(hr.getWorkDeadline());
System.out.println(hr.isTodayAHoliday());
System.out.println("Welcome "+th.departmentName());
System.out.println(th.getTodaysWork());
System.out.println(th.getWorkDeadline());
System.out.println(th.getTechStackInformation());
System.out.println(th.isTodayAHoliday());
	
}
}

