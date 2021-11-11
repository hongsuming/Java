
public class Car {
	
	Engine engine;			// 다른 클래스를 멤버변수로 가짐 - has a 관계
	String modelName;		// 자동차 모델 이름
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Engine engine, String modelName) {
		super();
		this.engine=engine;
		this.modelName=modelName;
	}
	
	public Engine getEngine() { // 객체를 리턴타입으로
		return this.engine;
	}
	public void setEngine(Engine engine) { // 객체를 매개변수로
		this.engine=engine;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", modelName=" + modelName + "]";
	}
	
	

}
