package javaCoding;

import java.util.Scanner;

public class JavaClass {

	public static void main(String[] args) {

		/*pyramid();
		
		floydtriangle();
		
		stars();
		*/
		triangle();
		
	}
	
	
	public static void pyramid(){
		
		
		for(int i=0; i<4; i++){
			
			for(int j=0; j<=i; j++){
				
				System.out.print("$ ");
				
			}
			
			System.out.println("");
			
		}
		
		for(int i =4; i>=0; i--){
			
			
			for(int j=0; j<=i; j++){
				
				System.out.print("$ ");
			}
			
			System.out.println("");
		}
			
		
	}
	
	public static void floydtriangle(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n value");
		int n = scan.nextInt();
		int k = 1;

		
		for(int x=1; x<=n; x++){
			
			for(int y=1; y<=x; y++ ){
				
				System.out.print(k+" ");
				k++;
				
				
			}
			System.out.println("");
			
			
			
		}
		
		
	}
	
	public static void stars(){
		
		
		
for(int i=1; i<=7; i++){
			
			for(int j=1; j<=7; j++){
				
				System.out.print("* ");
				
			}
			
			System.out.println("");
			
		}
		
	}
	
	
	public static void triangle(){
		int m = 1;
		int space = 8;

		for(int i=1; i<7; i++){
			int num = 0;

			
			for(int h=0; h<space; h++){
				
				System.out.print(" ");
			}
			
			for(int j=1; j<=m; j++){
				
				
				if(j<=i){
					
					num = num+1;			
					
					
				}
				else{
					
					num = num-1;
				}
				
				System.out.print("* ");
				
					
				
			}
			
			System.out.println(" ");
			
			m=m+2;
			space = space-1;
			
			
			
		}
		
	}
	

}
