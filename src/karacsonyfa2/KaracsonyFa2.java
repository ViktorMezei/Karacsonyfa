package karacsonyfa2;


public class KaracsonyFa2 {

    
    public static void main(String[] args) {
        
      
     
      int startIndex = 0;
      
      
      String concat = " ";
      
      String treePart = "x";
      
      String treeExpansion = treePart+treePart;	  

      
      int treeHeight = 20;
      
      int middleIndex = treeHeight;
      
      
     for (int j = 0; j<treeHeight; j++){ 
     
            for (int i = startIndex; i<middleIndex; i++){
          
                    
                    System.out.print(concat);
          
                    if(i == middleIndex-1){
          
                    System.out.print(treePart);
          
                    }
          
          }
          
          treePart = treePart + treeExpansion;
          
          middleIndex -- ;
          
          System.out.println();
        
        
        
    } System.out.println("git added");
    
  } 
  
}
