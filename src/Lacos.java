package cadeiraoo;


public class Lacos {
	
	  public void testefor (int n1,int n2, Boolean crecente){
	      if(crecente == true){
	        for(int i=n1; i <= n2;i++){
	            System.out.println(i);   
	        }
	      }
	      else{
	        for(int i=n2; i >= n1;i--){
	            System.out.println(i);
	        }
	      }

	    }
	  public void testewhile(int n1, int n2,Boolean crecente){
	      if(crecente==true){
	        int i=n1;
	          while(i<=n2){
	            System.out.println(i);
	            i++;
	          }
	      }
	      else{
	        int i=n2;
	        while(i>=n1){
	        System.out.println(i);
	        i--;
	      }
	    }
	  }
	public void testedoWhile(int n1 ,int n2 , Boolean crecente){
		int i;
		
		if(crecente==true){
		do {
			i=n1;
		   System.out.println(i);
		   i++;
		}while(i<=n2);
	   }else {
		do {
			i=n2;
			System.out.println(i);
			i--;
		}while(i>=n1);
		
	}
		
  }
	
}
