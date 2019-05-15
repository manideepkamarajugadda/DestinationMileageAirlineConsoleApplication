public class Destination {
 
 private String destinationCity;
 private int normalMiles;
 private int frequentFlyerMiles;
 private int additionalMiles;
 private int startMonth;
 private int endMonth;
 
 
 public String getDestinationCity() {
  return destinationCity;
 }
 

 public void setDestinationCity(String destinationCity) {
  this.destinationCity = destinationCity;
 }

 
 public int getNormalMiles() {
  return normalMiles;
 }
 

 public void setNormalMiles(int normalMiles) {
  this.normalMiles = normalMiles;
 }


 public int getFrequentFlyerMiles() {
  return frequentFlyerMiles;
 }


 public void setFrequentFlyerMiles(int frequentFlyerMiles) {
  this.frequentFlyerMiles = frequentFlyerMiles;
 }

 
 public int getAdditionalMiles() {
  return additionalMiles;
 }


 public void setAdditionalMiles(int additionalMiles) {
  this.additionalMiles = additionalMiles;
 }

 
 public int getStartMonth() {
  return startMonth;
 }

 
 public void setStartMonth(int startMonth) {
  this.startMonth = startMonth;
 }


 public int getEndMonth() {
  return endMonth;
 }


 public void setEndMonth(int endMonth) {
  this.endMonth = endMonth;
 } 

 
 public Destination(String destinationCity, int normalMiles, int frequentFlyerMiles, 
   int additionalMiles,int startMonth, int endMonth) {
  
  this.destinationCity=destinationCity;
  this.normalMiles=normalMiles;
  this.frequentFlyerMiles=frequentFlyerMiles;
  this.additionalMiles=additionalMiles;
  this.startMonth=startMonth;
  this.endMonth=endMonth;
  
 }

}
