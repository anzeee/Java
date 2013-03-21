/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metoder;

/**
 *
 * @author johand8
 */
public class Support { 
    
        public double tempOmvandling(double f) {
         
           double celsius = (f - 32) / 1.8; 
           
        return celsius; 
        }
        
        
        
        
        public void Soltimmar2(String stad, int soltimmar) {
        
           
            System.out.print("" + stad);
            
            System.out.print(": ");
            
            for (int i = 0; i < soltimmar; i++) {
               
                 System.out.print("*");
            }
        
           System.out.println("");
       
           }//end Soltimmar2
        

     
        
        
        
        
        
        public double area(double radie) {
            
            
              double area;
              
        area = Math.PI * radie * radie;    
        
        
            
          return area;
          
        }//end area
        
        public double omkrets(double radie){
                
                
                double omkrets;
                
                omkrets = 2 * Math.PI * radie;
          
               
                return omkrets;
        
        
  }//end omkrets
        public double volym(double radie) {
            
            double volym;
            volym = 4 * Math.PI * radie * radie * radie / 3;
            
            return volym;
            
                   
          
          
          
        }//end
        public double TalMetod(double tal1, double tal2) {
         
       
        double minst = tal1;
        
     
        
            if (tal2 < tal1) {
            minst = tal2;
            
        }
        
           
        return minst;
    

    
    
    
}//end TalMetod
}//end class

   






