package TP2_Eva3.Tp2;
public class Math{

	private int a=0;
	private int b=0;

	public Math(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public int add(){
		return a+b;
	}
	
	public int subtract(){
		return a-b;
	}

	public static void main (String[] args){
		Math m= new Math(2,2);	
	}
	
	
}
