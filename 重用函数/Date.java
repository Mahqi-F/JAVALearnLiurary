public class Date{
    void date(String a,String b,String c){
        System.out.println(a+"/"+b+"/"+c);
    }
    void date(String a,int b,int c){
        System.out.println(a+","+b+","+c);
    }
    void date(int a,int b,int c){
        System.out.println(a+"年"+b+"月"+c+"日");
    }
    public static void main(String[] args){
        Date obj = new Date();
        obj.date("May","3","2020");
        obj.date("May",3,2020);
        obj.date(2020,4,3);
    }
}