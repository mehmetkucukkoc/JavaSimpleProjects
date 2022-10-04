package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String name="Mehmet";
        int yas=36;
        System.out.println(name.toUpperCase());

        String tc ="1234455";
        String id ="98765";
       int yenitc = Integer.valueOf(tc);
        System.out.println("yenitc = " + yenitc);
        int yeniid = Integer.valueOf(id);
        System.out.println("yeniid = " + yeniid);
        System.out.println(yenitc+yeniid);
        String okulno ="123456";
        int yeniokulno = Integer.valueOf(okulno);
        System.out.println("yeniokulno = " + yeniokulno);
        byte byteMaxDegeri= Byte.MAX_VALUE;
        System.out.println("byteMaxDegeri = " + byteMaxDegeri);
        byte byteMinDegeri = Byte.MIN_VALUE;
        System.out.println("byteMinDegeri = " + byteMinDegeri);
        int intMaxDegeri= Integer.MAX_VALUE;
        System.out.println("intMaxDegeri = " + intMaxDegeri);
        int intMinDegeri= Integer.MIN_VALUE;
        System.out.println("intMinDegeri = " + intMinDegeri);
        long longMaxDegeri =Long.MAX_VALUE;
        System.out.println("longMaxDegeri = " + longMaxDegeri);


    }
}
