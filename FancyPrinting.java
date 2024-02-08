//Austin Ellis
// 2/7/24



public class FancyPrinting extends Thread
{
   String word = "";
   
   public static void fancy(String w)
   {
      String out = "";
      
      for(int i = 0; i < w.length(); i++)
      {
         for(int j = 0; j <= w.charAt(i); j++)
         {
            System.out.println(out + (char)j);
            try {
               Thread.sleep(10);
            }catch(InterruptedException e){
               e.printStackTrace();
            }
         }
      out += w.charAt(i);
      }     
   }
}