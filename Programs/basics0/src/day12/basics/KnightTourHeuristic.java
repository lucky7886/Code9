package day12.basics;


public class KnightTourHeuristic {
	
	
	private static int[] array = new int[8];
	
	
	private static int access[][]= {{2,3,4,4,4,4,3,2},
		                            {3,4,6,6,6,6,4,3},
		                            {4,6,8,8,8,8,6,4},
		                            {4,6,8,8,8,8,6,4},
		                            {4,6,8,8,8,8,6,4},
		                            {4,6,8,8,8,8,6,4},
		                            {3,4,6,6,6,6,4,3},
		                            {2,3,4,4,4,4,3,2}};
	
	
	
	private static int [][] board = new int[8][8];
	
	private static int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
	
	private static int[] vertical =   {-1,-2,-2,-1,1,2,2,1};
	
	private static int currentRow;
    
	private static int currentColumn;
    
	private static int current1Row;
    
	private static int current1Column;
    
	private static int j,min;
    
	
	public static void main(String[] args) {
	
		
	currentRow=3;
	
	currentColumn=7;
	
	int d=1;
	
	int m=1;
	
	int c=1;
	
	board[3][7]=m;
		
		
		
		
		
		while(c<=64 && d<100)
		
		
		{
		
			
			for(int i=0;i<=7;i++)
			
				
				
				array[i]=9;
       
		j=0;
		
		
		for(int i=0;i<=7;i++)
		
		
		{
			
			
			if(currentRow+vertical[i]<=7 && currentRow+vertical[i]>=0 && 
        	
					
					currentColumn+horizontal[i]<=7 && currentColumn+horizontal[i]>=0)
              
				
				if(board[currentRow+vertical[i]][currentColumn+horizontal[i]]==0)
              
              
              {
            	
            	  
            	  array[j]=  access[currentRow+vertical[i]][currentColumn+horizontal[i]];
            	
            	
            	j++;
        
              
              }
		
		
		}
		
		
		min=array[0];
		
		
		for(int name:array)
        
			
			if(name<min)
        
        	   
        	   min=name;
		
		
		current1Row=currentRow;
		
		
		
		current1Column=currentColumn;
		
		
		for(int i=0;i<=7;i++)
		
		
		{
			
			
			if(currentRow+vertical[i]<=7 && currentRow+vertical[i]>=0 && 
        	
					
					currentColumn+horizontal[i]<=7 && currentColumn+horizontal[i]>=0)
			{
				
				
				
				
				if((board[currentRow+vertical[i]][currentColumn+horizontal[i]]==0))
			
				
				{
					
						
					if(access[currentRow+vertical[i]][currentColumn+horizontal[i]]==min)
			
					
					
					{
						
						
				currentRow+=vertical[i];
			
				currentColumn+=horizontal[i];
				
				board[currentRow][currentColumn]=++m;
			    
				c++;	
				
				break;
			
			
			}
				
				
				}
				
				
				else
		
					
					d++;
		
			
			}
		
		
		}
		
		
		for(int i=0;i<=7;i++)
		
		
		
		{
        	
			
			
			if(current1Row+vertical[i]<=7 && current1Row+vertical[i]>=0 && 
        
        			
        			
        			current1Column+horizontal[i]<=7 && current1Column+horizontal[i]>=0)
        	
        	
        	    	{
        	
        		
        			--access[current1Row+vertical[i]][current1Column+horizontal[i]];
        	
        	         
        	    	}
        	
		     }
		
		 }
		
		
		
		for(int i=0;i<=7;i++)
        
		{
        
			for(int y=0;y<=7;y++)
        		
        System.out.printf("%2d   ",board[i][y]);
        
			
			System.out.println();
        
		}
	
		System.out.println();
        
		for(int i=0;i<=7;i++)
        
        
        
        {
        	for(int y=0;y<=7;y++)
        		
        System.out.printf("%2d   ",access[i][y]);
        
        	System.out.println();
        
        }
        
		System.out.println();
        
		System.out.printf("\ntotal moves: %d\n%d",c,d);
	
        }
}