class Parent{
}
class Child extends Parent {
    public String name; 
    public void setName (String s) {
        name = s;
}
}
public class TestParent {
    public static void main(String[ ] args) {
    Parent a = new Child( );
    a. setName("悟空");
    System. out. pr intln(a. name) ;
}
}