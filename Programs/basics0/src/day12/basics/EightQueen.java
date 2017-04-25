

//**********NOT WORKING PROPERLY (STILL IN DEVELOPMENT STAGE)**********
package day12.basics;


public class EightQueen {
	
	
	private static int[] array = new int[8];
	
	
	private static int access[][]= {{21,21,21,21,21,21,21,21},
		                            {21,23,23,23,23,23,23,21},
		                            {21,23,25,25,25,25,23,21},
		                            {21,23,25,27,27,25,23,21},
		                            {21,23,25,27,27,25,23,21},
		                            {21,23,25,25,25,25,23,21},
		                            {21,23,23,23,23,23,23,21},
		                            {21,21,21,21,21,21,21,21}};
	
	
	
	private static int [][] board = new int[8][8];
	
	private static int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
	
	private static int[] vertical =   {-1,-2,-2,-1,1,2,2,1};
	
	private static int currentRow;
    
	private static int currentColumn;
    
	private static int current1Row;
    
	private static int current1Column;
    
	private static int j,min;
    
	
	public static void main(String[] args) {
	
		
	currentRow=1;
	
	currentColumn=3;
	
	int d=1;
	
	int m=1;
	
	int c=1;
	
	board[1][3]=m;
		
		do
		{
		
    for(int l=0;l<currentColumn;l++)
    	board[currentRow][l]=99;
    for(int l=currentColumn+1;l<=7;l++)
   if(currentColumn+1<=7)
    	board[currentRow][l]=99;
    for(int l=0;l<currentRow;l++)
    	board[l][currentColumn]=99;

    for(int l=currentRow+1;l<=7;l++)
    	if(currentRow+1<=7)
    	board[l][currentColumn]=99;
    for(int l=1;l<=7;l++)
    	if(currentColumn-l>=0 && currentRow-l>=0)
    		board[currentRow-l][currentColumn-l]=99;

    for(int l=1;l<=7;l++)
    	if(currentColumn+l<=7 && currentRow+l<=7)
    		board[currentRow+l][currentColumn+l]=99;		
    for(int l=1;l<=7;l++)
    	if(currentColumn-l>=0 && currentRow+l<=7)
    		board[currentRow+l][currentColumn-l]=99;
		
    for(int l=1;l<=7;l++)
    	if(currentColumn+l<=7 && currentRow-l>=0)
    		board[currentRow-l][currentColumn+l]=99;
		
		
		
		
			
			for(int i=0;i<=7;i++)
			
				
				
				array[i]=99;
       
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
		
		 }while(c<=10 && d<10);
		
		
		
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
        
		System.out.printf("\ntotal moves: %d\n",c);
	
        }
}