package lab5;

public class Circle {
	double r;/* the radius */
	Point c;/* the centre */
	
	public Circle(double r, Point c) {
		this.r=r;
		this.c=c;
	}
	
	public double circumference() {
		return this.r*2*Math.PI;
	}
	
	public boolean issame(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (r != other.r)
			return false;
		if (c.x != other.c.x)
			return false;
		if(c.y != other.c.y)
			return false;
		return true;
	}
}