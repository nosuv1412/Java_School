
public class Circle {
	private Double radius;
	private String color;
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	public Circle(double r) {
		radius = r;
		color = "red";
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public void setRadius(double radius) {
		this.radius = radius;
		}
	public void setColor(String color) {
		this.color = color;
		}
	public String toString() {
		return "Circle: radius = " + radius + " Color = " + color;
		}
}
	

