package cadeiraoo;


public class Lacos {
	
	  public void Testefor (int n1,int n2, Boolean crecente){
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
	  public void Testewhile(int n1, int n2,Boolean crecente){
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
