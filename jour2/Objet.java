class Objet {
    public static void main(String[] args) {
        
        Point p1 = new Point(10, 5);
		Point p2 = new Point(12, 8);
		Point p3 = new Point(12, 16);

      Traingle t1 = new Traingle (p1, p2, p3) ;
        
        System.out.println( t1 );
	    Point a = t1.getA();
		a.setX(500);

		System.out.println( t1 );
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    // Setter de x
    public void setX(int value) {
        if(value < 0) return;
        this.x = value;
    }

    // Setter de y
    public void setY(int value) {
        if(value < 0) return;
        this.y = value;
    }
    
    // Getter de x
    public int getX() {
        return this.x;
    }

    // Getter de y
    public int getY() {
        return this.y;
    }

    public String toString() {
        return String.format("(%d,%d)", this.x, this.y);
    }
	public boolean equals(Point p){
	  return p.getX() == this.getX() && p.getY() == this.getY();
	}
	public Point clone(){ //  method is declared as protected
		return new Point(this.getX(), this.getY());
	}
	
}
      /*
   /*  public class Wrapper1 {
		public static void main(String[] args){
			int entier_primitif = 10; // dans la mémoire, il y a juste la valeur 10 qui est stockée sous la forme 00001010
			Integer entier_objet = 10;
	
			System.out.println(entier_objet.getClass());//je peux accéder à une méthode d'un objet mais pas d'un type primitif
		}
	} */
class Line {
	private Point a;
	private Point b;

	public Line (Point a , Point b){
		this.a =a ;
		this.setB(b);
		
	}
	public Point getA(){
		return this.a;
	}
	public Point getB(){
		return this.b;
	}
	public void setA(Point value){
		if(value.equals(this.b)) return;
		this.a = value;
	}
	public void setB(Point value){
		if(value.equals(this.a)) return;
		this.b = value;
	}
	public String toString(){
		return String.format("%S -> %S" , this.a.toString(), this.b.toString());
		// return this.a.toString() + " ->" + this.b.toString();
	}
	
	
}
class Traingle{
	private Point a;
	private Point b;
	private Point c ;

	public Traingle (Point a , Point b, Point c){ //clone is use so that you can't modifier the triangle 
	    this.a =a.clone();
		this.b =b.clone();
		this.c =c.clone();

	}
	public Point getA(){ // on ne peut pas modifier avec le clone le get
		return this.a.clone();
	}
	public Point getB(){
		return this.b.clone();
	}
	public Point getC(){
		return this.c.clone();
	}
	public String toString(){
		return String.format("a:%s b:%s c:%s" ,a,b,c);
	}
}
