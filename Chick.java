class Chick implements Animal {     
     private String myType;     
     private String mySound;      
     public Chick(String type, String sound , String soundtwo)     {         
         myType = type;         
         double x = Math.random();
         if(x<0.5){
           mySound = sound;     
         }else{
           mySound = soundtwo;
         }
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
