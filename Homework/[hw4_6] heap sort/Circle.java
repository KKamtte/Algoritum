
public class Circle implements Figure {
	private double radius; //������
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "�� ������=" + radius + " ����=" + getArea();
	}

	public double getArea() {
		return (radius * radius) * 3.14;
	}
}
