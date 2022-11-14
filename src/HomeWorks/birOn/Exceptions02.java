package HomeWorks.birOn;

public class Exceptions02 {
    public static void main(String[] args) {
try {
    System.out.println("Fırlatılan Hata Aranıyor");
    hata();
    System.out.println("Hata oluştuğu için burası Çalışmadı");
}catch(IllegalArgumentException e){
    System.out.println(e.getMessage());
    System.out.println("ve hata yakalanarak handle edildi");
}
        System.out.println("bu satırı gördüyseniz hata handle edilmiş demektir");



    }
    static void hata(){
        throw new IllegalArgumentException("Bir Hata Fırlatıldı");
    }
}
