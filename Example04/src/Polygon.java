
public class Polygon {
	protected int width;
	protected int height;
	public void setValues(int a, int b){
		width = a;
		height = b;
	}
public class Rectangle extends Polygon{
	public int area(){
		return(width*height);
	}
public class Triangle extends Polygon{
	public int area(){
		return(width*height/2);
	}
}
}
}


