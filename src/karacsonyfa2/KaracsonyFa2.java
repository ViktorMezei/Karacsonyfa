package karacsonyfa2;


public class KaracsonyFa2 {

    
    public static void main(String[] args) {
        
      String rendezett = rendezes();
      String eldontes = eldont();
     
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

    private static String rendezes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static String eldont() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
