import java.util.Scanner;
    import java.util.Scanner;
    public class OceanProject {
        public static void main(String[] args) {
            int choice;
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to my Divine Ocean Tour");
            System.out.println("Rank 1- Pacific Ocean" );
            System.out.println("Rank 2- Atlantic Ocean Ocean" );
            System.out.println("Rank 3- Indian Ocean" );
            System.out.println("4 Exit" );
            System.out.println("Please select Breathtaking oceanic scroll! from 1-3 ,where you want to take trip to");
            do {
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Pacific Ocean is the largest Ocean in the world.\n" +
                                "Area (sq km)- 168.7 million. Key Region-Between Asia & Americas");
                        break;

                    case 2:
                        System.out.println("Atlantic Ocean is the  2nd largest Ocean in the world \n" +
                                "Area (sq km)- 85.1 million. Key Region-Between Americas & Europe/Africa");
                        System.out.println("Close your eyes and breathe with the waves... 🌊🧘‍♀️");


                        break;

                    case 3:
                        System.out.println("Indian Ocean is the  3rd largest Ocean in the world \n" +
                                "Area (sq km)- 70.6 million. Key Region-Between Africa, Asia & Australia\n" +
                                "Indian Ocean is the vast water body.Bay of Bengal-which is near Bengal, Tamil Nadu, Odisha \n" +
                                "and Arabian Sea-which is near Maharashtra,Kerala,Gujrat these are 2 arms seas of Indian Ocean \n" +
                                "And tamil nadu -Dhanushcodi is the point where these 2 Amrs joined to Pranam Lord Shiva 🙏");
                        System.out.println("🌊 Watch breathtaking sea tour: https://www.msn.com/en-in/news/us/pearl-harbor-drone-flight-over-o%CA%BBahus-wwii-memorial/vi-AA1KSF0H?ocid=widgetonlockscreen&category=takeabreak&subcategory=momentofzen&segment=Videos&fromWidget=true&serviceActivityId=a1722b4a-fb9c-4a75-827d-a225037a056d");


                        break;

                    case 4:
                        System.out.println("🙏 Thank you- Hope you enjoyed gem of  Sea!");
                        break;

                    default:
                        System.out.println("❌ Invalid choice. Please try again.");
                }
            }while (choice!=4);

            sc.close();


        }
    }


