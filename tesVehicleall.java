import java.util.Scanner;

public class tesVehicleall {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("1.Car or 2.Bicycle?");
        int pilihan = in.nextInt();

        if (pilihan==1){

            System.out.println("Berapa jumlah rodanya?");
            int numWheels = in.nextInt();
            System.out.println("Berapa jumlah pintunya?");
            int numDoors = in.nextInt();
            in.nextLine();
            System.out.println("Is electric?");
            boolean isElectric = in.nextBoolean();
            in.nextLine();
            System.out.println("moonroof, sunroof, panoramic roof");
            String roofType = in.nextLine();

            System.out.println("Berapa harganya?");
            double price =in.nextDouble();
            System.out.println("Dapatkan diskon");
            int Diskon =in.nextInt();


            Car a = new Car(numDoors, isElectric);
            in.nextLine();
            

           

        }else if (pilihan==2){

            System.out.println("apa tipe sepedanya?");
            in.nextLine();
            String bikeType = in.nextLine();

        }

        int diskon;
        for (int i = 1; i<diskon; i++);

      
        


       
        

      
       


    }
        
} 
    

