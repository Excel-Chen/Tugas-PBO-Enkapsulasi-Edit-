import java.util.Scanner;

public class MainBangunRuang {

    public static void main(String[] args) {
        char yn = 'n';

        Scanner isi = new Scanner(System.in);
        do {
            System.out.println("Program untuk menghitung Rumus Bangun Ruang");
            System.out.println("====================================================");
            System.out.println("Pilihan  : 1. Tabung");
            System.out.println("           2. Kubus");
            System.out.println("           3. Balok");
            System.out.println("           4. Exit");
            int p = isi.nextShort();
            System.out.println("====================================================");
            
            // p == 1 , Rumus Tabung
            if (p == 1) {
                System.out.println("Program untuk menghitung Luas dan Volume Tabung");
                RumusTabung tab = new RumusTabung();
                System.out.println("r : ");
                int r = isi.nextInt();
                System.out.println("t : ");
                int t = isi.nextInt();
        
                //Getter / Proses Tabung
                tab.setJari(r);
                tab.setTinggi(t);
        
                //Output 
                System.out.println("============================================");
                System.out.println(tab.toString());
                System.out.println("Luas Permukaan Tabung : " + tab.LuasTabung() + " cm^2");
                System.out.println("Volume Tabung : " + tab.VolTabung() + " cm^3");
                System.out.println("============================================");
            }
            
            // p == 2 , Rumus Kubus
            else if (p == 2) {
                System.out.println("Program untuk menghitung Luas dan Volume Kubus");
                RumusKubus kub = new RumusKubus();
                System.out.println("s : ");
                int s = isi.nextInt();
                
                //Getter / Proses Kubus
                kub.setSisi(s);
        
                //Output 
                System.out.println("============================================");
                System.out.println(kub.toString());
                System.out.println("Luas Permukaan Kubus : " + kub.LuasKubus() + " cm^2");
                System.out.println("Volume Kubus : " + kub.VolKubus() + " cm^3");
                System.out.println("============================================");
            }
            
            // p == 3 , Rumus Balok
            else if (p == 3) {
                RumusBalok bal = new RumusBalok();
                System.out.println("p : ");
                int panj = isi.nextInt();
                System.out.println("l : ");
                int l = isi.nextInt();
                System.out.println("t : ");
                int t = isi.nextInt();
                //Getter / Proses Kubus
                bal.setPanjang(panj);
                bal.setLebar(l);
                bal.setTinggi(t);

                //Output 
                System.out.println("Program untuk menghitung Luas dan Volume Balok");
                System.out.println("============================================");
                System.out.println(bal.toString());
                System.out.println("Luas Permukaan Balok : " + bal.LuasBalok() + " cm^2");
                System.out.println("Volume Balok : " + bal.VolBalok() + " cm^3");
                System.out.println("============================================");
            }
            // p == 4 , Exit
            else if (p == 4) {
                System.out.println("Exit Program");
                System.exit(0);
            }

            else {
                System.out.println("Pilihan hanya [ 1 - 4 ]");
            }

            // Perulangan (ingin mengulang ?)
            System.out.println("Repeat This Program ? [y / n] :"); 
            isi.nextLine();
            String yesno = isi.nextLine();
            yn = yesno.charAt(0);
        }while(yn == 'y' || yn == 'Y');
            
        isi.close();

        }
}


