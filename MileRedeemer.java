import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MileRedeemer {

 private ArrayList<Destination> destinationList = new ArrayList<Destination>();
  private int remainingMiles=0;
  

  public void readDestinations(Scanner fileScanner) throws FileNotFoundException {
   
   String data;
  
   
   Scanner scanner = new Scanner(new File(fileScanner.next()));
   
   while(scanner.hasNext()) {
    
    data= scanner.nextLine();
    String [] arraySplit = data.split(";");
       String [] months = arraySplit[4].split("-");
    
       destinationList.add(new Destination(arraySplit[0], Integer.parseInt(arraySplit[1]),
                     Integer.parseInt(arraySplit[2]),
                     Integer.parseInt(arraySplit[3]),
                     Integer.parseInt(months[0]),
                     Integer.parseInt(months[1])));
   }
    scanner.close();
    destinationList.sort(new MileageComparator());
  }
  

  public class MileageComparator implements Comparator<Destination> {
   
   public int compare(Destination d1, Destination d2) {
    
     return (d2.getNormalMiles() - d1.getNormalMiles());
   
    }
   
  }
  

  public String[] getCityNames()
   {
   int i=0;
     String[] city = new String [destinationList.size()];
     
     for(Destination d: destinationList)
        {
      city[i] = d.getDestinationCity();
      i++;
        }
      Arrays.sort(city);
      return city; 
   }   

  
  public int getRemainingMiles() {
   
  return remainingMiles;
   
  }


 public String[] redeemMiles(int miles, int month) {
  

  ArrayList<String> redeemMiles = new ArrayList<String>();
  
  ArrayList<Destination> destinationFlights = new ArrayList<Destination>();
  
  for(Destination dest:destinationList) {

   if(dest.getStartMonth()> month || dest.getEndMonth()< month) {
  
    if(miles-dest.getNormalMiles()>=0) {
     miles = miles-dest.getNormalMiles();
     destinationFlights.add(dest);
    } 
    
   }
   else{
    if(miles-dest.getFrequentFlyerMiles()>=0) {
     miles = miles-dest.getFrequentFlyerMiles();
     destinationFlights.add(dest);
    
    }
    
   }
   
  }
  for(Destination destination : destinationFlights) {
   if(miles-destination.getAdditionalMiles() >= 0) {
    miles = miles - destination.getAdditionalMiles();
    redeemMiles.add("* A trip to "+destination.getDestinationCity()+" in First Class");
   }
   else {
    redeemMiles.add("* A trip to "+destination.getDestinationCity()+" in Economy Class");
   }
  }

  String [] res = (String[])(redeemMiles.toArray(new String[redeemMiles.size()]));
  remainingMiles = miles;
  return res;
 }
 
}

