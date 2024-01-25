package seleksi_kondisi;

import java.util.Scanner;

public class latihan_ukl3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] lok = {"", "Dupak", "Waru", "Sidoarjo", "Porong", "Kejapanan"};

        System.out.println("Daerah Asal");
        for (int i = 1; i < lok.length; i++) {
            System.out.println(i + ". " + lok[i]);
        }
        System.out.print("Daerah Asal Anda: ");
        int asal = input.nextInt();
        System.out.println("================================================");

        switch (asal) {
            case 1:
                System.out.println("Nama Ruas: Dupak - Waru");
                System.out.println("================================================");
                System.out.println("Golongan Kendaraan");
                System.out.println("1. Sedan, Jip, Pick Up");
                System.out.println("2. Truk dengan 2 sumbu roda");
                System.out.println("3. Truk dengan 3 sumbu roda");
                System.out.print("Golongan Kendaraan Anda: ");
                int gol = input.nextInt();
                System.out.println("================================================");
                switch (gol) {
                    case 1:
                        System.out.println("Biaya: 5000");
                        break;
                    case 2:
                        System.out.println("Biaya: 8000");
                        break;
                    case 3:
                        System.out.println("Biaya: 8000");
                        break;
                }
                break;

            case 2:
                System.out.println("Daerah Tujuan");
                System.out.println("1. Sidoarjo");
                System.out.println("2. Porong");
                System.out.print("Daerah Tujuan Anda: ");
                int tujuan = input.nextInt();

                switch (tujuan) {
                    case 1:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 6000");
                                break;
                            case 2:
                                System.out.println("Biaya: 9000");
                                break;
                            case 3:
                                System.out.println("Biaya: 9000");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 9000");
                                break;
                            case 2:
                                System.out.println("Biaya: 14000");
                                break;
                            case 3:
                                System.out.println("Biaya: 14000");
                                break;
                        }
                        break;
                }
                break;

            case 3:
                System.out.println("Daerah Tujuan");
                System.out.println("1. Waru");
                System.out.println("2. Porong");
                System.out.print("Daerah Tujuan Anda: ");
                tujuan = input.nextInt();

                switch (tujuan) {
                    case 1:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 6000");
                                break;
                            case 2:
                                System.out.println("Biaya: 9000");
                                break;
                            case 3:
                                System.out.println("Biaya: 9000");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 5500");
                                break;
                            case 2:
                                System.out.println("Biaya: 8500");
                                break;
                            case 3:
                                System.out.println("Biaya: 8500");
                                break;
                        }
                        break;
                }
                break;

            case 4:
                System.out.println("Daerah Tujuan");
                System.out.println("1. Sidoarjo");
                System.out.println("2. Waru");
                System.out.println("3. Kejapanan");
                System.out.print("Daerah Tujuan Anda: ");
                tujuan = input.nextInt();

                switch (tujuan) {
                    case 1:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 5500");
                                break;
                            case 2:
                                System.out.println("Biaya: 8500");
                                break;
                            case 3:
                                System.out.println("Biaya: 8500");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 9000");
                                break;
                            case 2:
                                System.out.println("Biaya: 14000");
                                break;
                            case 3:
                                System.out.println("Biaya: 14000");
                                break;
                        }
                        break;
                        
                        case 3:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 6000");
                                break;
                            case 2:
                                System.out.println("Biaya: 8500");
                                break;
                            case 3:
                                System.out.println("Biaya: 8500");
                                break;
                        }
                        break;
                }
                break;
                
                case 5:
                System.out.println("Nama Ruas: Kajapanan - Gempol");
                System.out.println("================================================");
                System.out.println("Golongan Kendaraan");
                System.out.println("1. Sedan, Jip, Pick Up");
                System.out.println("2. Truk dengan 2 sumbu roda");
                System.out.println("3. Truk dengan 3 sumbu roda");
                System.out.print("Golongan Kendaraan Anda: ");
                gol = input.nextInt();
                System.out.println("================================================");
                switch (gol) {
                    case 1:
                        System.out.println("Biaya: 3000");
                        break;
                    case 2:
                        System.out.println("Biaya: 5000");
                        break;
                    case 3:
                        System.out.println("Biaya: 5000");
                        break;
                }
                break;
                default : System.out.println("SALAHSETAN");
        }
    }
}