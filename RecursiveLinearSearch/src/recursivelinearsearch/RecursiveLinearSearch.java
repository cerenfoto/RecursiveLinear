
package recursivelinearsearch;


import java.util.Scanner;
 
public class RecursiveLinearSearch
{
   public static void main( String args[] )
   {
      
      Scanner input = new Scanner( System.in );
 
      int aranacak_sayi; 
      int pozisyon;
 

      LinearArray searchArray = new LinearArray( 10 );
      System.out.println( searchArray );
 
      
      System.out.print(
         "Lütfen arama yapmak için integer bir sayi giriniz (-1 programı sonlandırır): " );
      aranacak_sayi = input.nextInt(); 
 
      
      while ( aranacak_sayi != -1 )
      {
         
         pozisyon = searchArray.performSearch( aranacak_sayi );
 
         if ( pozisyon == -1 ) 
            System.out.println( "Sayi " + aranacak_sayi +
               " bulunamadı.\n" );
         else 
            System.out.println( "Sayi" + aranacak_sayi +
               " bulunduğu pozisyon " + pozisyon + ".\n" );
 
         
         System.out.print(
            "Lütfen arama yapmak için integer bir sayi giriniz (-1 programı sonlandırır): " );
         aranacak_sayi = input.nextInt();
      } 
   } 
} 
