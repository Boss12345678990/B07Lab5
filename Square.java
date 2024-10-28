package lab5;

public class Square {
	Point r;
	Point c;
	
	public Square(Point r, Point c) {
		this.r = r;
		this.c = c;
	}
	
	public double circumference() {
		return Math.sqrt(32)*Math.sqrt(Math.pow(this.r.x, 2)+Math.pow(this.r.y, 2));
	}

	public double area() {
		return 2*(Math.pow(this.r.x, 2)+Math.pow(this.r.y, 2));
	}

	@Override
	public int hashCode() {
		return (int)(3*this.r.x + 5*this.r.y + 7*this.c.x + 2*this.c.y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		if(this.c.x!=other.c.x||this.c.y!=other.c.y)
			return false;
		if((this.r.x!=other.r.x||this.r.y!=other.r.y)&&(-this.r.y!=other.r.x||this.r.x!=other.r.y)&&(-this.r.x!=other.r.x||-this.r.y!=other.r.y)&&(this.r.y!=other.r.x||-this.r.x!=other.r.y))
			return false;
		return true;
	}
}
