package oop2;

public class SuperInitialize {
	public static void main(String args[]) {
		Point3D p3d = new Point3D();
		System.out.println("p3d.x = " + p3d.x);
		System.out.println("p3d.y = " + p3d.y);
		System.out.println("p3d.z = " + p3d.z);
	}
	
}


class Point1{
	int x=10;
	int y=20;
	
	Point1(int x, int y){
		//super();
		this.x = x;
		this.y = y;
	}
	
}

class Point3D extends Point{
	int z = 30;
	
	Point3D() {
		this(100, 200, 300);
	}
	
	Point3D(int x, int y, int z){
		super(x,y);
		this.z=z;
	}
}