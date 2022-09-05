package earth.system;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		India i=new India();
		America a=new America();
		China c=new China();
		Shrilanka sh=new Shrilanka();
		int ch ;
		int p;
		
	do {
		
		System.out.println("1.India");
	    System.out.println("2.America");
	    System.out.println("3.China");
		System.out.println("4.Shrilanka");
		
	    System.out.println(" ");
		 
		System.out.println("enter your choice--->");
		Scanner s=new Scanner(System.in);
		p=s.nextInt();
		
		do {
			 System.out.println("1.religeous:---- ");
			 System.out.println("2.lengauge:----- ");
			 System.out.println("3.currency:------ ");
			 System.out.println("4.population:----- ");
			 System.out.println(" ");
			 
			System.out.println("enter your choice--->");
			Scanner s1=new Scanner(System.in);
			ch=s1.nextInt();
		
		switch(ch) {
		
		case 1:
			if(p==1) {
			i.religeous();
			System.out.println(" "); 
            break;
			}else if(p==2) {
			a.religeous();
			System.out.println(" "); 
	        break;
			}else if(p==3) {
			c.religeous();
			System.out.println(" "); 
            break;
		    }else if(p==4) {
            sh.religeous();
			System.out.println(" "); 
            break;
		    }
			
			
		case 2:
			if (p==1) {
			i.langauge();
		    System.out.println(" ");
	        break;
			}else if(p==2) {
			a.langauge();
		    System.out.println(" ");
		    break;
			}else if(p==3) {
			c.langauge();
			System.out.println(" ");
			break;
		    }else if(p==4) {
		    sh.langauge();	
			System.out.println(" ");
			break;
		    }
	    
	  case 3:
		  if(p==1) {
			i.curencey();
		    System.out.println(" ");
			break;
		  }else if(p==2){
			a.curencey();
			System.out.println(" ");
		    break; 
		  }else if(p==3){
			c.curencey();
			System.out.println(" ");
		    break; 
		  }else if(p==4){
			sh.curencey();
			System.out.println(" ");
		    break; 
		  }
		  
		case 4:
			if(p==1) {
			i.population();
			System.out.println(" ");
			break;
			}else if(p==2) {
			a.population();
		    System.out.println(" ");
			break;
			}else if(p==3) {
			c.population();
			 System.out.println(" ");
			 break;
		    }else if(p==4) {
		    sh.population();
		    System.out.println(" ");
		    break;
		    } 
		 
		default:
			 System.out.println("sorry ,invalide choice ");
			s1.close();
		}
		
	}while(ch>0);
	s.close();	
}while(p>0);
	
	}
	
}		
		
		
		
		
		
		
		
		

