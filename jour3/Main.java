package jour3;
class Main{
	public static void main(String [] args){
		// ok VVV
	Singleton s1 = Singleton.getInstance() ;
	// pas ok XXX
	Singleton s2 = Singleton.getInstance();
	System.out.println(s1 == s2);
	}
}
class Singleton{
	private static  Singleton instance = null;
	private Singleton(){
	}
    public static Singleton getInstance(){
	if (Singleton.instance == null){
    Singleton.instance = new Singleton();
	}
	return new Singleton();
	}
}