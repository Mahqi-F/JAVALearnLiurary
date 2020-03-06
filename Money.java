public class Money{
    Dollar d = new Dollar();     
     Money() { 
        System.out.println("All money come to my home");
    }
    public static void main(String[] args) {
        Money m = new Money();
    }
}
class Dollar {
    int n = 100;
     Dollar() {
        System.out.println(n +" dollars come to my home");
    }
}
