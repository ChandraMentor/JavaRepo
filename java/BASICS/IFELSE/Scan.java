public class Scan
{  
/* function reads a line from key board */         
 public static String readString()
   {
      int inputchar;
      String inputstring = "";
      boolean newline = false;
      while (!newline)
      {
        try
         {
inputchar = System.in.read();
if (inputchar < 0 || (char)inputchar == '\n')
newline = true;
else if ((char)inputchar != '\r') 
inputstring = inputstring + (char) inputchar;
  }
catch(java.io.IOException e)
         {
        newline = true;
         }
      }
      return inputstring;
   }

/* function reads an integer value from key board */         
       
 public static int readInt()
   {
  while(true)
      { 
  try
  {
return (Integer.parseInt(readString().trim()));
         } catch(Exception e)
         {  
System.out.println("Not an integer");
         }
      }
   }

   
    
   public static double readDouble()
   {  while(true)
      {  
         try
         {  return Double.parseDouble(readString().trim());
         } catch(NumberFormatException e)
         {  System.out.println
         ("Not a double");
         }
      }
   }
	
  public static float readFloat()
   {  while(true)
      {  
         try
         {  return Float.parseFloat(readString().trim());
         } catch(NumberFormatException e)
         {  System.out.println("Not a float");
         }
      }
   }
}
