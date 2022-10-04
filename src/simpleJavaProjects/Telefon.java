package simpleJavaProjects;

public class Telefon {
    public String renk;
    public String marka;
    public int kamerasayisi;
    public int ram;

    public static void main(String[] args) {
        Telefon telefon=new Telefon();
        telefon.kamerasayisi=2;
        telefon.marka="Huawei";
        telefon.ram=6;
        telefon.renk="Siyah";
        System.out.println(telefon.marka);
    }


}
