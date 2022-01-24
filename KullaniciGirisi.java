import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, newPassword;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adı : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika")&&password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        }
        else {
            int secim;
            Scanner input = new Scanner(System.in);
            System.out.println("Bilgileriniz yanlış, Şifrenizi Sıfırlamak ister misiniz?\n1-Sıfırlamak istiyorum.\n2-Sıfırlamak istemiyorum.");
            secim = input.nextInt();

            switch (secim) {
                case 1:
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("Yeni bir şifre giriniz : ");
                    newPassword = input1.nextLine();

                    if (newPassword.equals("java123")){
                        System.out.println("Şifre Oluşturulamadı, Lütfen Başka Şifre Giriniz!");

                    }
                    else {
                        System.out.println("Şifre Oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Şifreniz Değiştirilmedi.");
                    break;
                default:
                    System.out.println("Yanlış bir seçim yaptınız!");
            }

        }

    }
}
