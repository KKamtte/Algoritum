
public class Triangle implements Figure{
	private double baseline;
	private double height;
	
	public Triangle (double baseline, double height) {
		this.baseline = baseline;
		this.height = height;
	}
	
	public double getBaseline() {
		return baseline;
	}

	public void setBaseline(double baseline) {
		this.baseline = baseline;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "»ï°¢Çü ¹Øº¯=" + baseline + " ³ôÀÌ=" + height + "¸éÀû=" + getArea();
	}

	public double getArea() {
		return ( baseline * height ) / 2;
	}
}
