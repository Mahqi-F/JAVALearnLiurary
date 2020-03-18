public class Baby2 {
    static int numBabiesMade = 0; 
    String name;
    double weight;
    boolean isMale;
    int numPoops;
    Baby[] siblings;
    
    Baby2(String myname, double myweight, boolean male) {
        name = myname;
        weight = myweight;
        isMale = male; 
      /*  numBabiesMade ++; */
    }   
    void poop() {
        numPoops ++;
        System.out.println("Dear mother,"+"I have pooped. Ready the diaper.");
    }
    void sayHi(){
        System.out.println("Hi, my name is " + name);
    }
    void eat(double foodWeight) {
        weight += foodWeight;
     System.out.println("My weight now is"+ weight);        
    }

public static void main(String[] args) {
Baby2.numBabiesMade = 100; 
System.out.println(Baby2.numBabiesMade);  
/*Baby b1 = new Baby("b1",10,true);*/
/*Baby b2 = new Baby("b2",20,true);*/
/*b1.numBabiesMade = 1;*/
/*b2.numBabiesMade = 2;*/
/*System.out.println(b1.numBabiesMade);*/   
/*System.out.println(b2.numBabiesMade);*/   
/*Baby b3 = new Baby("b3",150,true);*/
/*System.out.println(Baby.numBabiesMade);*/
}
}
