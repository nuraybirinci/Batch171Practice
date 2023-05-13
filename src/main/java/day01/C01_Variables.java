package day01;

public class C01_Variables {

    public static void main(String[] args) {

        //Bir variable olustur, yazdır
        int  yas  = 36;

        //syntax : variable data türü + variable isim + atama operatoru + variable deger

         int sayi = 50;

        System.out.println(yas);//ctrl + d ile satırı alt alta cogaltabiliriz
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);


        //(sayi = 50) seklinde yazdır
        System.out.println("sayi = "+sayi);

        //sayi variable ini etiketiyle birlikte yazdirma
        //ctrl + l kodlarimizi düzenlemeye yarar
        //bir variable ı etiketiyle birlikte yazdırmanın kısa yolu = soutv
        System.out.println("sayi = " + sayi);
        System.out.println(sayi);
        System.out.println("yas = " + yas);
        //string bir variable olusturalım --> non-primitive bir data turu, "" içinde yazılır, buyuk harfle baslar
        String isim = "Ali";

        //isim variable ını etiketiyle yazdır
        System.out.println("isim = " + isim);

        //Olusturdugun variable'ı farkli bir variable'a kopyala
        //yeni bir variable olusturacagim  : benimYasim ve bu variable ın degeri yas variable ının degerine esit olsun
        //benimYasim variable degeri de yas variable nın degeri gibi 36 olsun
        int benimYasim = yas;

        //onunIsmi variable ının degeri "Ali" olsun ve bunu kopyalama işlemi ile yapalım
        String onunIsmi = isim;
        System.out.println("onunIsmi =" + onunIsmi);


        //camelCase
        //PascalCase
        //snake_case
        //kebab-case

        //Aynı satırda coklu variable deklare et
        int yil = 2023, ay =5, gun = 15;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);

        //Bir variable degerini guncelle
        //az once olusturdugumuz isim variable nın degerini Veli olarak güncelle
         isim = "Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);
        //Java yukarıdan asagıya soldan saga çalıır

        //Degişkenleri(variable) yazdır


        //Bir variable deklere et : x  ---> delare etmek = tanımlamak --> data turu + data ismi
        double x;

        //Bir variable baslat : y
        double y = 12.5;

        //Başka bir variable başlat : z
        double z = 33; // java buraya yazdığımız 33 degerini 33.0 olarak algıladı ve hata vermedi

        //x degişkenini y degişkeni ile başlat
         x = y; //bir variable bir scope (main method) da sadece bir kez deklare edilebilir

        //Variable y'i guncelle
        y = 13.9; // ondalıklı sayılarda virgül degil "." (nokta) kullanırız

        //Degişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


        /* Not:bir öğrencinin hazırladığı data kontrol et!
        int year = 2023, day = 4, month = 5;
        System.out.println("Date = " +day + "/" + month + "/" + year);
         */


    }



}
