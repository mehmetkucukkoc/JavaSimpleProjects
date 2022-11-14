public class Deneme {

    public static void main(String[] args) {

        String tcNo = "38254791749";
        System.out.println(kontrol(tcNo));
    }

    private static boolean kontrol(String tcNo) {
        int[] sayiDizi = new int[11];

        if (tcNo == null || tcNo.length() != 11) {
            System.out.println("LÜTFEN 11 HANELİ GEÇERLİ BİR T.C. NO GİRİNİZ");
        } else {
        }

        for (int i = 0; i < 11; i++) {
            sayiDizi[i] = Integer.parseInt(tcNo.substring(i, (i + 1)));
        }

        {
            //int[] sayiDizi = parcala(tcNo);

            if (sayiDizi != null) {
                boolean kosul1 = (sayiDizi[0] + sayiDizi[1] + sayiDizi[2] + sayiDizi[3] + sayiDizi[4] + sayiDizi[5] + sayiDizi[6] + sayiDizi[7] + sayiDizi[8] + sayiDizi[9]) % 10 == sayiDizi[10];
                boolean kosul2 = (((sayiDizi[0] + sayiDizi[2] + sayiDizi[4] + sayiDizi[6] + sayiDizi[8]) * 7) + ((sayiDizi[1] + sayiDizi[3] + sayiDizi[5] + sayiDizi[7]) * 9)) % 10 == sayiDizi[9];
                boolean kosul3 = ((sayiDizi[0] + sayiDizi[2] + sayiDizi[4] + sayiDizi[6] + sayiDizi[8]) * 8) % 10 == sayiDizi[10];

                return kosul1 && kosul2 && kosul3;
            }
            return false;
        }

    }
    }
