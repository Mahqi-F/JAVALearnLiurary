public class Baby{
    String name;
    double weight;
    boolean isMale;
    int numPoops;
    Baby[] siblings;
    
    Baby(String myname, double myweight, boolean male) {
        name = myname;
        weight = myweight;
        isMale = male; 
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
    }
    void fight(){
        System.out.println("一技能：万剑归宗");
    }

    public static void main(String[] args) {
        Baby dawa = new Baby("金刚芭比",20,true);
        System.out.println(dawa.name);
        dawa.sayHi();
        System.out.println("我的体重是：");
        dawa.eat(19999);
        System.out.println(dawa.weight);
        dawa.fight();    
    }
 }

