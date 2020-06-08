
public class Circle implements Figure {
	private double radius; //반지름
	
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
		return "원 반지름=" + radius + " 면적=" + getArea();
	}

	public double getArea() {
		return (radius * radius) * 3.14;
	}
}
