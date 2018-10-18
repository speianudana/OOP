package Dana;

public class Main {

    public static void main(String[] args) {
        A aa=new A();
        B bb=new B();
        C cc=new C();
        D dd=new D();
        E ee=new E();
        F ff=new F();
        G gg=new G();
        H hh=new H();
        I ii=new I();
        J jj=new J();
//
        System.out.println(aa.toString());
        System.out.println(bb.toString());
        System.out.println(cc.toString());
        System.out.println(dd.toString());
        System.out.println(ee.toString());
        System.out.println(ff.toString());
        System.out.println(gg.toString());
        System.out.println(hh.toString());
        System.out.println(ii.toString());
        System.out.println(gg.toString());
        A aaa=new A ("aaa",new X("xxx"));
        System.out.println(aaa.toString());

    }
}
class A {
    protected String a="Anabela";
    protected X x=new X("xxx");

    protected A() {
    }

    public A(String a) {
        this.a = a;
    }
    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
    public A(String a, X x){
        this.a=a;
        this.x=x;
    }
}

class B extends A {
    protected String b="Betty";
    protected B() {
    }

    protected B(String b) {
        this.b = b;
    }

//    protected B(String a, String b) {
//        super(a);
//        this.b = b;
//    }
//
    public B(String a, X x, String b) {
        super(a, x);
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}




class C extends B {
    protected String c="Cristina";
    public C() {
    }

    public C(String c) {
        this.c = c;
    }

//    public C(String b, String c) {
//        super(b);
//        this.c = c;
//    }

//    public C(String a, String b, String c) {
//        super(a, b);
//        this.c = c;
//    }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
class D extends C {
    protected String d="Dana";

    protected X x=new X("XDanaX");

    protected D() {
    }

    protected D(String d) {
        this.d = d;
    }

//    public D(String c, String d) {
//        super(c);
//        this.d = d;
//    }
//
//    public D(String b, String c, String d) {
//        super(b, c);
//        this.d = d;
//    }
//
//    public D(String a, String b, String c, String d) {
//        super(a, b, c);
//        this.d = d;
//    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class E extends D {
    protected String e="Elena";
    protected E() {
    }

    protected E(String e) {
        this.e = e;
    }

//    public E(String d, String e) {
//        super(d);
//        this.e = e;
//    }
//
//    public E(String c, String d, String e) {
//        super(c, d);
//        this.e = e;
//    }
//
//    public E(String b, String c, String d, String e) {
//        super(b, c, d);
//        this.e = e;
//    }
//
//    public E(String a, String b, String c, String d, String e) {
//        super(a, b, c, d);
//        this.e = e;
//    }

    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class F extends E{
    protected String f="Florina";
    protected F() {
    }

    protected F(String f) {
        this.f = f;
    }
//
//    public F(String a, String b, String c, String d, String e, String f) {
//        super(a, b, c, d, e);
//        this.f = f;
//    }
//
//    public F(String e, String f) {
//        super(e);
//        this.f = f;
//    }
//

    @Override
    public String toString() {
        return "F{" +
                "f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}


class G extends F {
    protected String g="Gheta";
    protected G() {
    }

    protected G(String g) {
        this.g = g;
    }

//    public G(String a, String b, String c, String d, String e, String f, String g) {
//        super(a, b, c, d, e, f);
//        this.g = g;
//    }
//
//
//    public G(String f, String g) {
//        super(f);
//        this.g = g;
//    }

    @Override
    public String toString() {
        return "G{" +
                "g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class H extends G{
    protected String h="Hartina";
    private X x=new X("xHartinax");
    protected H() {
    }

    protected H(String h) {
        this.h = h;
    }

//    public H(String a, String b, String c, String d, String e, String f, String g, String h) {
//        super(a, b, c, d, e, f, g);
//        this.h = h;
//    }

    @Override
    public String toString() {
        return "H{" +
                "h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}


class I extends H {

    protected String i="Irina";
    protected I() {
    }

    protected I(String i) {
        this.i = i;
    }


//    public I(String a, String b, String c, String d, String e, String f, String g, String h, String i) {
//        super(a, b, c, d, e, f, g, h);
//        this.i = i;
//    }

    @Override
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                //", x=" + x +
                '}';
    }
}

 class J extends I {
    protected String j="Jora";
    protected J() {
    }

//    public J(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j) {
//        super(a, b, c, d, e, f, g, h, i);
//        this.j = j;
//    }

    protected J(String j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "J{" +
                "j='" + j + '\'' +
                ", i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                //", x=" + x +
                '}';
    }
}

 class X {
    private String x;

    @Override
    public String toString() {
        return "X{" +
                "x='" + x + '\'' +
                '}';
    }

    public X(String x) {
        this.x = x;
    }
}