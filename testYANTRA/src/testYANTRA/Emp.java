package testYANTRA;

public class Emp {
	
	private int eid;
	private String name;
	private double sal;
	
	public int getEid() {
		return eid;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSal() {
		return sal;
	}
	
	public String toString()
	{
		return this.eid+""+this.name+""+this.sal;
		
	}
	public int compareTo(Emp o)
	{
		return this.getEid()-o.getEid();
	}
	

}
