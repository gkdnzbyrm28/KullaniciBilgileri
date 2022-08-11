import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, sifirlama, npassword;

        Scanner utp = new Scanner(System.in);

        System.out.print("Kullanici Adinizi Giriniz");
        username = utp.nextLine();
        System.out.print("Sifrenizi Giriniz");
        password = utp.nextLine();

        if ((username.equals("dr1"))&&(password.equals("123")))
        {
            System.out.print("Hosgeldiniz");
        }
        else
        {
            System.out.print("Girdiginiz Bilgiler Dogru Degil!!!\n Sifre Yenilemek Istiyorsaniz 1 " +
                    "yazin istemiyorsaniz 2");
            sifirlama = utp.nextLine();
            if (sifirlama.equals("2"))
            {
                System.out.print("Cikis Yapildi");
            }
            else if (sifirlama.equals("1")) {
                System.out.print("Yeni sifrenizi girin lutfen");
                npassword = utp.nextLine();
                if (npassword.equals("123")){
                    System.out.print("Sifre degistirme isleminiz basarisiz oldu!!!");
                }
                else {
                    System.out.print("Sifreniz basariyla degistirildi");
                }
            }
        }
    }
}
