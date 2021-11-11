
public class Engine {
	
	String sn;		// 엔진번호
	String year;	// 제작연도
	
	
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(String sn, String year) {
		super();
		this.sn = sn;
		this.year = year;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Engine [sn=" + sn + ", year=" + year + "]";
	}

	
}
