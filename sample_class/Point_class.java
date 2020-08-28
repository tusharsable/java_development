import java.lang.Math;

//Class definition
public class Point_class {

	//defining instance variables
	public int x,y;

	//defining constructor
	public Point_class(int x,int y) {
		this.x=x;
		this.y=y;
	}

	//defining instance methods
	public float distance_between(Point_class point) {

		float distance = (float) Math.sqrt(Math.pow((this.x-point.x),2)+Math.pow((this.y-point.y),2));
		return distance;
	}

	//defining main method
	public static void main (String[] args) {

		Point_class point1=new Point_class(2,2);
		Point_class point2 = new Point_class(9,10);
		float distance = point1.distance_between(point2);
		System.out.println("distance between points is : "+distance);
	}

}
