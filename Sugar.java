class Sugar extends Cookie{

String shape;
boolean decorated;


Sugar(){

shape = "";
decorated = false;

}


Sugar(String aShape, boolean aDecorated){
shape = aShape;
decorated = aDecorated;

}

String getShape(){
  return shape;
}


void setShape(String aShape){
  shape = aShape;
}


void cuttheShape(String aShape, int anQuantity){
shape = aShape;
setQuantity(anQuantity); 

System.out.println(Quantity + " cookies were cut into " + shape);
//super.print();
}

void isDecorated(){

if (baked==true){
  decorated = true;
  System.out.println("The cookies were decorated.");
  
  


}

else {
  System.out.println("Make sure to bake cookies first");
}

}


}