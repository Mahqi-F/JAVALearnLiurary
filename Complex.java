import java.util.*;
public class Complex {
    private double a;
    private double b;
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public Complex(double x,double y)
    {
        this.a=x;
        this.b=y;
    }
    public Complex Add(Complex c)
    {
        Complex add=new Complex(this.a+c.a, this.b+c.b);
        return add;
    }
    public Complex sub(Complex c)
    {
        Complex sub=new Complex(this.a-c.a, this.b-c.b);
        return sub;
    }
    
    public String toString()
    {
        if(this.b<0)
            return this.a+"-"+(-this.b)+"i";
        return this.a+"+"+this.b+"i";
    }
    public static void main(String[] args) {
        System.out.println("输入c1的实部和虚部：");
        Scanner in=new Scanner(System.in);
        double a1=in.nextDouble();
        double a2=in.nextDouble();
        System.out.println("输入c2的实部和虚部：");
        double a11=in.nextDouble();
        double a22=in.nextDouble();
        System.out.println("c1:"+a1+"+("+a2+")i");
        System.out.println("c2:"+a11+"+("+a22+")i");
        Complex c1=new Complex(a1,a2);
        Complex c2=new Complex(a11,a22);
        System.out.println("c1和c2的运算结果：");
        System.out.println("c1+c2="+c1.Add(c2));
        System.out.println("c1-c2="+c1.sub(c2));
    }

}
