package javaCoding;

public class Practiceclass {
	
	
	
	public static void main(String[] args) {
		
		
int m = 1;
		
		for(int i=1; i<7; i++){
			
			int n = 0;
			
			for(int k=i; k<7; k++){
				
				System.out.print(" ");
			}
			for(int j=1; j<=m; j++){
				
				if(j<=i){
					
					n=n+1;
					
				}
				else
				{
					n=n-1;
				}
				
				System.out.print(n+" ");
				//System.out.print(i+" ");
				
			}
			System.out.println("");
			m= m+2;

			
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}
	


