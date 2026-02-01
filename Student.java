package week2;

	public class Student{
		private String name;
		private int id;
		private int yearofstudy;
		
		public Student(String name, int id, int yearofstudy) {
			this.name = name;
			this.id = id;
			this.yearofstudy = yearofstudy;
		}
		
		public String getname(){ 
			return name;
		}
		
		public int getid() { 
			return id;
		}
		
		public int getyearofstudy() {
			return yearofstudy;
		}
	
		 
	public static void main(String[] args) {
		Student s = new Student("Almas", 1107, 1);
		
		System.out.println(s.getname());
		System.out.println(s.getid());
		System.out.println(s.getyearofstudy());
		
	}
		

	}
