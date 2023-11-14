
/**
 * Write a description of class עםהסלסית here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class עםהסלסית
{
    public boolean difference (int [] a, int x)
    {
        for(int i = 0; i<a.length ;i++)
        {
        if(Math.abs(a[i]-a[i+1])==x)
            return true;
        }
        return false;
    }
    
   public boolean difference2 (int [] a, int x) 
   {       
       int j=0;     
       for(int i=a.length-1 ; j!=a.length-1 ; i--)  
       {  
           if(Math.abs(a[i]-a[j])>x)        
           return true;      
           if(i==j)         
           {              
               i=a.length;    
               j++;            
            }    
        }       
        return false; 
    }

   public static boolean f(int n,int m)
   {
      while(n>9)
      {
          if(Math.abs(n%10 - n/10%10) != m)
          return false;
         n = n/10;
      }
      return true;
   }
}
