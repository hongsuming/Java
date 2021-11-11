
public class Dept {
	
	private int deptno;
	private String dname;
	private String loc;
	
	public Dept() {
		
	}
	public Dept(int deptno, String dname, String loc) {
		this.deptno=deptno;
		this.dname=dname;
		this.loc=loc;
	}
	
	public int getDeptno() {
		return this.deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno=deptno;
	}
	
	public String getDname() {
		return this.dname;
	}
	public void setDname(String dname) {
		this.dname=dname;
	}
	
	public String getLoc() {
		return this.loc;
	}
	public void setLoc(String loc) {
		this.loc=loc;
	}
	
	public String toString() {
		return deptno+"\t"+dname+"\t"+loc;
	}
	
	public String getData() {
		return "getData() = "+this.deptno+"\t"+this.dname+"\t"+this.loc;
	}
	public void printData() {
		String data = this.deptno+"\t"+this.dname+"\t"+this.loc;
		System.out.println("printData() = "+data);
	}
	

}
