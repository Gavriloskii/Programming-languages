package cass1;

public class Student {
	String name;
	int indexNo;
    int age;
	public Student(String name, int indexNo, int age) {
		this.name=name;
		this.indexNo=indexNo;
		this.age=age;
	}
	public Student withName(String name) {
		this.name = name;
		return this;
	}
	public Student withIndexNo(int indexNo)
	{
		this.indexNo = indexNo;
		return this;
	}
	public Student withAge(int age) {
		this.age= age;
		return this;
	}
	public String getName()
	{
		return name;
	}
	public int getIndex()
	{
		return indexNo;
	}
	public int age()
	{
		return age;
	}
}
