package ejcMedios;

public class MCD {
	
public static int gcd(int a, int b) {
		
		//caso base
		
		a=Math.abs(a);
		b=Math.abs(b);	
		
		if(b==0){
			return a;
		}
	// paso recursivo
		
	return gcd(a, a%b); // buscamos el minimo comun divisor
	}
	

	public static void main(String[] args) {
		
		
		System.out.println(gcd(48,18));
		// TODO Auto-generated method stub

	}


	

}
