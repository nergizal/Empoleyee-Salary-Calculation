public class muz extends SoyulabilirMeyve{

    //overrriding etme
    @Override //anotasyon //üstte extend ettiği sınıflarda herhangi birinde ye diye bir metot varmış ve bunu override etmiş, haberin olsun
    public void ye(){
        System.out.println("Muzu yedim");
    }
}
//Method overriding(Metodu Geçersiz Kılma)
//Üst sıınıfn metodunu ezmek olarak da bilinir
//Overriding kuralları:
//1. Üst sınıfın metodunun aynı isme, dönüş tipine ve parametre listesine sahip olması gerekir.
//2. final ve static işaretlenmesi gerekir.
//3. Üst sınıf abstract ise abstract metotlar her zaman ovrride edilmelidir.
