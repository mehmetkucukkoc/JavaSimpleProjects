package HomeWorks.onBirYirmi.SubSuperClass;
public class SubClass extends SuperClass {
    int num = 1453;

    public static void main(String[] args) {

        SubClass obj= new SubClass();
        obj.myMethod();

    }

    public void myMethod() {
        gosterMethod();
        super.gosterMethod();
        System.out.println("sub.num = " + num);
        System.out.println("super.num = " + super.num);

    }

    public void gosterMethod() {
        System.out.println("ben subdan geliyorum");
    }

}
