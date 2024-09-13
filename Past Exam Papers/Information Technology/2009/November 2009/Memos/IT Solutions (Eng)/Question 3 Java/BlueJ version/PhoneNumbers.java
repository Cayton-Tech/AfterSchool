
public class PhoneNumbers
{
   
    private String number;
    public PhoneNumbers()
    {
      
    }
   
    public PhoneNumbers(String PhoneNumber)
    {
      number = PhoneNumber.toUpperCase();   
    }


public String Convert (String number)
{
  String newString =  "";
 
  number = number.toUpperCase();   
  for (int ind = 0; ind < number.length(); ind++)
  {
   String thisChar = number.substring(ind,ind+1);
    if (number.charAt(ind) >='A' && number.charAt(ind)<= 'C')
       newString = newString + "2";
   else  if (number.charAt(ind) >='D' && number.charAt(ind)<= 'F')
       newString = newString + "3";
   else   if (number.charAt(ind) >='G' && number.charAt(ind)<= 'I')
       newString = newString + "4";
    else    if (number.charAt(ind) >='J' && number.charAt(ind)<= 'L')
       newString = newString + "5";
   else     if (number.charAt(ind) >='M' && number.charAt(ind)<= 'O')
       newString = newString + "6";
   else     if (number.charAt(ind) >='P' && number.charAt(ind)<= 'S')
       newString = newString + "7";
   else     if (number.charAt(ind) >='T' && number.charAt(ind)<= 'V')
       newString = newString + "8";
   else     if (number.charAt(ind) >='W' && number.charAt(ind)<= 'Z')
       newString = newString + "9";
   else newString = newString + thisChar;    
      
 } // for
 
  newString = newString.substring(0,3) + " " + newString.substring(3,6) + " " + newString.substring(6,10);
  return newString;
 }
 

}
