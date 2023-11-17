package class77;
import java.util.Random;
interface average
{
	float average();
}
interface scholarship
{
	float rate();
}
class person
{
	String p_name;
	public person(String p_name)
	{
		this.p_name=p_name;
	}
}
class employee extends person implements average
{
    int nosalaries;
	double salary[] = new double[12];

	public employee(String p_name, int n) {
		super(p_name);
		this.nosalaries=n;
		this.salary = new double [n];

        // Generate random salarieS
		Random rand = new Random();
   
        for (int i = 0; i < n; i++) {
            this.salary[i] = rand.nextDouble() * 30000;
        }
	}

	@Override
	public float average() {
		if (salary.length == 0) {
	        return 0;
	    }
		double sum = 0;
	    for (double s : salary) {
	        sum += s;
	    }

	    return (float) (sum / salary.length);
	}
	
}
class student extends person implements average, scholarship
{
	int nogrades;
	employee parent1;
    employee parent2;
	int grade[]=new int [6];

	public student(String p_name, int n, employee r1, employee r2) {
		super(p_name);
		this.nogrades=n;
		this.parent1=r1;
		this.parent2=r2;
		Random rand= new Random();
		for (int i = 0; i < grade.length; i++) {
            grade[i] = rand.nextInt(6) + 5;
        }
	}

	@Override
	public float rate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float average() {
		if (grade.length == 0) {
	        return 0;
	    }

	    double sum = 0;
	    for (int g : grade) {
	        sum += g;
	    }

	    return (float) (sum / grade.length);
	}
	
}
public class ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
