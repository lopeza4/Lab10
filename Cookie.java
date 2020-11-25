class Cookie {

public int Quantity;
public int temp;
public int timeBaked;
public boolean baked;

Cookie (){
Quantity = 0;
temp = 0;
timeBaked = 0;
baked = false;

}


Cookie(int anQuantity, int aTemp, int aTimeBaked, boolean aBaked){

  Quantity = anQuantity;
  temp = aTemp;
  timeBaked = aTimeBaked;
  baked = aBaked;

}

boolean getIsReady(){
  return baked;
}


void setQuantity(int anQuantity){
  Quantity = anQuantity;
}


void  areBaked(int aTemp, int aTimeBaked){

temp = aTemp;
timeBaked = aTimeBaked;
baked = true;


System.out.println(Quantity + " cookies were baked at " + temp +  " degrees F for "+ timeBaked +  " minutes");


}


















}