import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int len=Student.length();
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
		int i;
		for(i=0;i<=len;i++)
		{
			System.out.println(""+Student[i]);
		}
		
		return null;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException{
	
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException {
		try
		{
			return Student[index];
		}
		
		catch(IllegalArgumentException e)
		{
			
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		Student[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		for(int i=len+1;i>=1;i--)
		{
			Student[i]=Student[i-1];
		}
		Student[0]=student;
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		for(int i=len+1;i==(len-index);i--)
		{
			Student[i]=Student[i-1];
		// Add your implementation here
		}
		Student[len-index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		int l=Student.length();
		for(int i=0;i<=l;i++)
		{
			for(j=i+1;j<=l-1;j++)
			{
				if(Student[i]>Student[j])
				{
				temp=Student[i];
				Student[i]=Student[j];
				Student[j]=temp;
				}
			}
		// Add your implementation here
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		ssss
				
		// Add your implementation here
		return null;
	}
}
