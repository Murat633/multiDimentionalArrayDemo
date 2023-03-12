public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "İzmir";

        sehirler[1][0] = "Adıyaman";
        sehirler[1][1] = "Şanlıurfa";
        sehirler[1][2] = "Diyarbakır";

        sehirler[2][0] = "Mersin";
        sehirler[2][1] = "Giresun";
        sehirler[2][2] = "Hatay";

        for (int i=0;i<sehirler.length;i++){
            String[] cities = sehirler[i];
            for(String city:cities) {
                System.out.println(city);
            }
            System.out.println("------------------------------------------------------------");
        }
    }
}