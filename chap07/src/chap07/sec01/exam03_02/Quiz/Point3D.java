package chap07.sec01.exam03_02.Quiz;

public  class Point3D extends Point{
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		
	
		
	}

	@Override
	public String location() {
	 	return super.location() + ",z= " + z;
 
	}		
	}


