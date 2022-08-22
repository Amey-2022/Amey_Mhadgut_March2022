//package miniproject;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.*;

class SindhudurgTourism {
    public static void main(String[] args) throws IOException {

        //first display page
        WelcomeSindhudurg ws = new WelcomeSindhudurg();
        ws.display();
		ws = null;

        Date d = new Date();

        //beach names
        Beach b = new Beach();
        b.setBeachNames();
        b.getBeachNames();
        b.setSelectionBeach();
        b = null;

        //fort names
        Fort f = new Fort();
        f.setFortNames();
        f.getFortNames();
        f.setSelectionFort();
        f = null;

        //Waterfall names

        Waterfall w = new Waterfall();
        w.setWaterfallNames();
        w.getWaterfallNames();
        w.setSelectionWaterfall();
        w = null;

        //Religious Places names
        ReligiousPlace rp = new ReligiousPlace();
        rp.setReligiousPlaceNames();
        rp.getReligiousPlaceNames();
        rp.setSelectionReligiousPlace();
        rp = null;

        //fort names
        Lake l = new Lake();
        l.setLakeNames();
        l.getLakeNames();
        l.setSelectionLake();
        f = null;

        //island names
        Island is = new Island();
        is.setIslandNames();
        is.getIslandNames();
        is.setSelectionIsland();
        is = null;

        //LightHouse names
        LightHouse lh = new LightHouse();
        lh.setLightHouseNames();
        lh.getLightHouseNames();
        lh.setSelectionLightHouse();
        lh = null;

        //other names
        Other o = new Other();
        o.setOtherNames();
        o.getOtherNames();
        o.setSelectionOther();
        o = null;

		//displaying packages
        ServicePackages p = new ServicePackages();
        p.displayHeading();
        p.silverPackage();
        p.goldenPackage();
        p.platinumPackage();
        p.diamondPackage();
        p.selectPackage();

		//date selection from available dates
        d.DateSelection();

        //display user info
        UserInfo ui = new UserInfo();
        ui.setUserInfo();

		//logic part 
        TourismParent tp = new TourismParent();
        //wishlist
        tp.selectionSize();
        tp.TourismParent();
        tp.displayVisitingDetails();
        tp.pricing();

    }
}

class WelcomeSindhudurg {
    void display() {
        //first display page
        System.out.println("\n\n\n");
        String str1 = String.format("%90s", "WELCOME TO SINDHUDURG TOURISM GUIDE");

        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Date d = new Date();
        d.TodaysDate();




        System.out.print(String.format("%-45s", "                 BEACHES"));
        System.out.print(String.format("%-35s", "RELIGIOUS PLACES"));
        System.out.print(String.format("%-30s", "FORTS"));
        System.out.print(String.format("%-35s", "WATERFALLS"));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-45s", "                 LIGHTHOUSE"));
        System.out.print(String.format("%-35s", "ISLAND"));
        System.out.print(String.format("%-30s", "LAKES"));
        System.out.print(String.format("%-35s", "SAWANTWADI PALACE"));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-45s", "                 WAX MUESEUM"));
        System.out.print(String.format("%-35s", "WINDMILL GARDEN"));
        System.out.print(String.format("%-30s", "ROCK GARDEN"));
        System.out.print(String.format("%-35s", "ZIP LINE"));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-45s", "                 PARAGLIDING"));
        System.out.print(String.format("%-35s", "WATER SPORTS"));
        System.out.print(String.format("%-30s", "DOLPHIN SAFARI"));
        System.out.print(String.format("%-35s", "SCUBA DIVING"));
        System.out.println("\n\n\n");
    }
}

class UserInfo {

    byte age;
    static byte numOfPersons;
    String name, gender, village, district, state, country, Idproof, email;
    long mobileNum;


    void setUserInfo() {
        //user information form

        String str2 = String.format("%79s", "ENTER YOUR INFORMATION");
        Scanner sc = new Scanner(System.in);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str2);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n");
        System.out.print("               Enter Your Full Name : ");
        name = sc.nextLine();
        System.out.println("\n");
        System.out.print("               Enter Your Gender(M/F/T) : ");
        gender = sc.nextLine();
        System.out.println("\n");
        System.out.print("               Enter Age : ");
        this.age();
        System.out.println("\n");
        System.out.println("               Enter Your Address Details");
        System.out.println("\n");
        System.out.print("               Enter Your Village : ");
        village = sc.nextLine();
        System.out.println("\n");
        System.out.print("               Enter Your District : ");
        district = sc.nextLine();
        System.out.println("\n");
        System.out.print("               Enter Your State : ");
        state = sc.nextLine();
        System.out.println("\n");
        System.out.print("               Enter Your Country : ");
        country = sc.nextLine();
        System.out.println("\n");
        System.out.print("               Enter Your Aadhar ID/Passport Number : ");
        Idproof = sc.nextLine();
        System.out.println("\n");
        System.out.print("               Enter Your Mobile Number : ");
        this.mobileNum();
        System.out.println("\n");
        System.out.print("               Enter Your email id : ");
        String email = sc.nextLine();
        System.out.println("\n");
        System.out.print("               Enter Number of visiting persons with you: ");
        this.numOfPersons();
        System.out.println("\n\n");
    }

    void age() {
        Scanner sc = new Scanner(System.in);
        try {
            this.age = sc.nextByte();
        } catch (Exception e) {
            System.out.print("               Please Enter Number :");
            age();
        }
    }

    void mobileNum() {
        Scanner sc = new Scanner(System.in);
        try {
            this.mobileNum = sc.nextLong();
        } catch (Exception e) {
            System.out.print("               Please Enter Mobile Number :");
            mobileNum();
        }
    }

    void numOfPersons() {
        Scanner sc = new Scanner(System.in);
        try {
            this.numOfPersons = sc.nextByte();
        } catch (Exception e) {
            System.out.print("               Please Enter Number :");
            numOfPersons();
        }
    }

}

class Date {
	
	
    void TodaysDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        //printing LocalDate
        System.out.println("                 Today's Date : " + formatter.format(date));
        System.out.println("\n");
    }

    void DateSelection() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n");
        String str1 = String.format("%76s", "SELECT YOUR DATE");

        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        //printing LocalDate
        System.out.println("                    Today's Date : " + formatter.format(date));
        System.out.println("\n\n");
        for (int j = 1; j <= 91; j++) {
            System.out.print(String.format("%-48s", "                    " + j + ". " + formatter.format(date.plusDays(j))));
            j++;
            if (j == 91) {
                break;
            }
            System.out.print(String.format("%-27s", j + ". " + formatter.format(date.plusDays(j))));
            j++;
            if (j == 91) {
                break;
            }
            System.out.print(String.format("%-27s", j + ". " + formatter.format(date.plusDays(j))));
            j++;
            if (j == 91) {
                break;
            }
            System.out.print(String.format("%-27s", j + ". " + formatter.format(date.plusDays(j))));
            System.out.println("\n\n");
        }
        System.out.println("\n\n");



        char ch = 'Y';
        while (ch == 'Y') {
            System.out.print("                    Enter Number on which date you are visiting : ");
            int n = sc.nextInt();
            LocalDate visitDate = date.plusDays(n);
			if (n > 0 && n < 91) {
                System.out.println("\n\n");
                System.out.println("                    Your Visiting Date : " + formatter.format(visitDate));
                System.out.println("\n\n");
                break;
            } else {
                System.out.println("                    Sorry...Date is not available ");
                ch = 'Y';

            }
        }
		     
    }
}

class TourismParent extends UserInfo {
    static String sel[] = new String[73];
    static int selsize;
    static int i = 0;
    static byte selectpackage;

    void TourismParent() {

        System.out.println("\n\n\n");
        String str1 = String.format("%85s", "YOUR WISHLIST :" + selsize + " PLACES SELECTED");

        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Date d = new Date();
        d.TodaysDate();


        for (int i = 0; i <= 72; i++) {
            System.out.println();
            if (sel[i] == null)
                break;
            System.out.print(String.format("%-55s", "                    " + sel[i]));
            i++;
            if (sel[i] == null)
                break;
            System.out.print(String.format("%-40s", sel[i]));
            i++;
            if (sel[i] == null)
                break;
            System.out.print(String.format("%-30s", sel[i]));
            System.out.println("\n\n");
        }
        //visit again
    }

    static void displayVisitingDetails() {

        System.out.println("\n\n\n");
        String str1 = String.format("%80s", "YOUR FINAL TOUR DETAILS");

        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Date d = new Date();
        d.TodaysDate();
        ServicePackages sp = new ServicePackages();

        switch (selectpackage) {
            case 1:
                sp.silverPackage();
                break;
            case 2:
                sp.goldenPackage();
                break;
            case 3:
                sp.platinumPackage();
                break;
            case 4:
                sp.diamondPackage();
                break;



        }

    }

    static void selectionSize() {

        for (int i = 0; i < 73; i++) {
            if (sel[i] == null) {

                selsize = i;
                break;
            }
        }
        //System.out.println("size of selection array : "+selsize);
    }

    static void pricing() {

        int days = 0;
        int rupees = 0;
        if (selsize <= 3)
            days = 1;
        else if (selsize > 3 && selsize <= 8)
            days = 2;
        else if (selsize > 8 && selsize <= 12)
            days = 3;
        else if (selsize > 12 && selsize <= 20)
            days = 4;
        else if (selsize > 20 && selsize <= 35)
            days = 5;
        else if (selsize > 35 && selsize <= 50)
            days = 6;
        else if (selsize > 50 && selsize <= 60)
            days = 7;
        else if (selsize > 60 && selsize <= 72)
            days = 8;
        if (selectpackage == 1)
            rupees = 1000;
        else if (selectpackage == 2)
            rupees = 2500;
        else if (selectpackage == 3)
            rupees = 5000;
        else if (selectpackage == 4)
            rupees = 25000;
        int price = days * rupees * numOfPersons;

        System.out.println("");
        String str1 = String.format("%90s", "TOTAL COST FOR " + days + " DAYS TOUR : Rs." + price + "+GST");

        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();


    }


}

class Beach extends TourismParent {

    static String beach[] = new String[18];
    static int num1;

    void setBeachNames() {
        this.beach[0] = "DEVGAD BEACH";
        this.beach[1] = "MITHMUMBARI BEACH";
        this.beach[2] = "KUNKESHWAR BEACH";
        this.beach[3] = "MITHBAV BEACH";
        this.beach[4] = "AACHRA BEACH";
        this.beach[5] = "TONDAVLI BEACH";
        this.beach[6] = "DEVBAG BEACH";
        this.beach[7] = "TARKARLI BEACH";
        this.beach[8] = "BHOGAVE BEACH";
        this.beach[9] = "KONDURA BEACH";
        this.beach[10] = "KHAVANE BEACH";
        this.beach[11] = "NIVATI BEACH";
        this.beach[12] = "SAGARESHWAR BEACH";
        this.beach[13] = "MOCHEMAD BEACH";
        this.beach[14] = "VELAGAR BEACH";
        this.beach[15] = "REDI BEACH";
        this.beach[16] = "SHIRODA BEACH";
        this.beach[17] = "GO TO NEXT CATEGORY";

    }

    void getBeachNames() {

        System.out.println("\n\n\n");
        String str1 = String.format("%80s", "WELCOME TO PARADISE...");

        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Date d = new Date();
        d.TodaysDate();

        System.out.print(String.format("%-55s", "                    1." + beach[0]));
        System.out.print(String.format("%-40s", "2." + beach[1]));
        System.out.print(String.format("%-30s", "3." + beach[2]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    4." + beach[3]));
        System.out.print(String.format("%-40s", "5." + beach[4]));
        System.out.print(String.format("%-30s", "6." + beach[5]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    7." + beach[6]));
        System.out.print(String.format("%-40s", "8." + beach[7]));
        System.out.print(String.format("%-30s", "9." + beach[8]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    10." + beach[9]));
        System.out.print(String.format("%-40s", "11." + beach[10]));
        System.out.print(String.format("%-30s", "12." + beach[11]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    13." + beach[12]));
        System.out.print(String.format("%-40s", "14." + beach[13]));
        System.out.print(String.format("%-30s", "15." + beach[14]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    16." + beach[15]));
        System.out.print(String.format("%-40s", "17." + beach[16]));
        System.out.print(String.format("%-30s", "18." + beach[17]));
        System.out.println("\n\n\n");

    }


    static void setSelectionBeach() {

        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.print("               Do you want to visit all Beaches (Yes=1/No=0) : ");
        try {
            x = sc.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.print("               You have entered invalid character \n\n");
            setSelectionBeach();
        }
		
        if (x == 1) {
            for (int j = 1; j < 18; j++) {
                sel[i] = beach[j - 1];
                i++;
            }
        } else {
            int n = 1;
            while (n == 1) {
                System.out.println();
                System.out.print("               Select number to add beach : ");
				num1 = sc.nextInt();
				if (num1 == 18)
                    break;
                ArrayException();
                if (num1 == 18)
                    break;
                i++;
                System.out.print("\n               want to select more beach Y/N:1/0  ");
                n = sc.nextInt();
                System.out.println();
            }

        }
	}

    static void ArrayException() {
        Scanner sc = new Scanner(System.in);

        try {
            sel[i] = beach[num1 - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("               Please Enter Numbers Which are Displayed on Screen : ");
            num1 = sc.nextInt();
            ArrayException();
        }
    }

}

class Fort extends TourismParent {


    static String fort[] = new String[10];
    static int num2;


    void setFortNames() {
        this.fort[0] = "VIJAYDURG FORT";
        this.fort[1] = "DEVGAD FORT";
        this.fort[2] = "SINDHUDURG FORT";
        this.fort[3] = "SARJEKOT FORT";
        this.fort[4] = "RANGANAGAD FORT";
        this.fort[5] = "RAMGAD FORT";
        this.fort[6] = "NIVATI FORT";
        this.fort[7] = "HANUMANTGAD FORT";
        this.fort[8] = "YASHWANTGAD FORT";
        this.fort[9] = "GO TO NEXT CATEGORY";


    }

    void getFortNames() {
        String str1 = String.format("%75s", "HISTORICAL QUOTES");
        System.out.println("\n\n\n");
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Date d = new Date();
        d.TodaysDate();

        System.out.print(String.format("%-55s", "                    1." + fort[0]));
        System.out.print(String.format("%-40s", "2." + fort[1]));
        System.out.print(String.format("%-30s", "3." + fort[2]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    4." + fort[3]));
        System.out.print(String.format("%-40s", "5." + fort[4]));
        System.out.print(String.format("%-30s", "6." + fort[5]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    7." + fort[6]));
        System.out.print(String.format("%-40s", "8." + fort[7]));
        System.out.print(String.format("%-30s", "9." + fort[8]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    10." + fort[9]));
        System.out.println("\n\n\n");

    }


    static void setSelectionFort() {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("               Do you want to visit all Forts (Yes=1/No=0) : ");
        try {
            x = sc.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.print("               You have entered invalid character \n\n");
            setSelectionFort();
        }
        if (x == 1) {
            for (int j = 1; j < 10; j++) {
                sel[i] = fort[j - 1];
                i++;
            }
        } else {

            int n = 1;
            while (n == 1) {
                System.out.println();
                System.out.print("               Select number to add Fort : ");
                num2 = sc.nextInt();
                if (num2 == 10)
                    break;
                ArrayException();
                if (num2 == 10)
                    break;
                i++;
                System.out.print("\n               want to select more Lake Y/N:1/0  ");
                n = sc.nextInt();
                System.out.println();
            }
        }
    }

    static void ArrayException() {
        Scanner sc = new Scanner(System.in);

        try {
            sel[i] = fort[num2 - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("               Please Enter Numbers Which are Displayed on Screen : ");
            num2 = sc.nextInt();
            ArrayException();
        }
    }
}

class Waterfall extends TourismParent {
    static String waterfall[] = new String[10];
    static int num3;

    void setWaterfallNames() {
        this.waterfall[0] = "AMBOLI WATERFALL";
        this.waterfall[1] = "NAPNE WATERFALL";
        this.waterfall[2] = "SAVDAV WATERFALL";
        this.waterfall[3] = "SHIVDAV WATERFALL";
        this.waterfall[4] = "KUMBHAVDE WATERFALL";
        this.waterfall[5] = "NATAL WATERFALL";
        this.waterfall[6] = "CHANDER-MASURE WATERFALL";
        this.waterfall[7] = "MANCHE WATERFALL";
        this.waterfall[8] = "NHAVANKOND WATERFALL";
        this.waterfall[9] = "GO TO NEXT CATEGORY";

    }

    void getWaterfallNames() {

        System.out.println("\n\n\n");
        String str1 = String.format("%80s", "FEEL THE RAIN...");

        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Date d = new Date();
        d.TodaysDate();

        System.out.print(String.format("%-55s", "                    1." + waterfall[0]));
        System.out.print(String.format("%-40s", "2." + waterfall[1]));
        System.out.print(String.format("%-30s", "3." + waterfall[2]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    4." + waterfall[3]));
        System.out.print(String.format("%-40s", "5." + waterfall[4]));
        System.out.print(String.format("%-30s", "6." + waterfall[5]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    7." + waterfall[6]));
        System.out.print(String.format("%-40s", "8." + waterfall[7]));
        System.out.print(String.format("%-30s", "9." + waterfall[8]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    10." + waterfall[9]));
        System.out.println("\n\n\n");

    }

    void setSelectionWaterfall() {


        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("               Do you want to visit all Forts (Yes=1/No=0) : ");
        try {
            x = sc.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.print("               You have entered invalid character \n\n");
            setSelectionWaterfall();
        }
        if (x == 1) {
            for (int j = 1; j < 10; j++) {
                sel[i] = waterfall[j - 1];
                i++;
            }
        } else {
            int n = 1;
            while (n == 1) {
                System.out.println();
                System.out.print("               Select number to add Waterfall : ");
                num3 = sc.nextInt();
                if (num3 == 10)
                    break;
                ArrayException();
                if (num3 == 10)
                    break;
                i++;
                System.out.print("\n               want to select more Waterfall Y/N:1/0  ");
                n = sc.nextInt();
                System.out.println();
            }
        }

    }

    static void ArrayException() {
        Scanner sc = new Scanner(System.in);

        try {
            sel[i] = waterfall[num3 - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("               Please Enter Numbers Which are Displayed on Screen : ");
            num3 = sc.nextInt();
            ArrayException();
        }
    }


}

class ReligiousPlace extends TourismParent {


    static String relplc[] = new String[15];
    static int num4;

    void setReligiousPlaceNames() {
        this.relplc[0] = "KUNKESHWAR TEMPLE";
        this.relplc[1] = "BHALCHANDRA MAHARAJ SANSTHANAM";
        this.relplc[2] = "ANGANEWADI TEMPLE";
        this.relplc[3] = "MANGAON DATTATRAY TEMPLE";
        this.relplc[4] = "JAITIR TEMPLE, TULAS";
        this.relplc[5] = "VETOBA TEMPLE, ARAVLI";
        this.relplc[6] = "REDI GANESH TEMPLE";
        this.relplc[7] = "BANDESHWAR TEMPLE, BANDA";
        this.relplc[8] = "SAWANTWADI CHURCH";
        this.relplc[9] = "MALWAN CHURCH";
        this.relplc[10] = "VENGURLA ROMAN CATHOLIC CHURCH";
        this.relplc[11] = "SHIRODA CHURCH";
        this.relplc[12] = "REDEGHUMAT,SAWANTWADI";
        this.relplc[13] = "JAMA MASJID, DEVGAD";
        this.relplc[14] = "GO TO NEXT CATEGORY";
    }

    void getReligiousPlaceNames() {
        String str1 = String.format("%75s", "DEVOTEES QUOTES");
        System.out.println("\n\n\n");
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Date d = new Date();
        d.TodaysDate();

        System.out.print(String.format("%-55s", "                    1." + relplc[0]));
        System.out.print(String.format("%-40s", "2." + relplc[1]));
        System.out.print(String.format("%-30s", "3." + relplc[2]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    4." + relplc[3]));
        System.out.print(String.format("%-40s", "5." + relplc[4]));
        System.out.print(String.format("%-30s", "6." + relplc[5]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    7." + relplc[6]));
        System.out.print(String.format("%-40s", "8." + relplc[7]));
        System.out.print(String.format("%-30s", "9." + relplc[8]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    10." + relplc[9]));
        System.out.print(String.format("%-40s", "11." + relplc[10]));
        System.out.print(String.format("%-30s", "12." + relplc[11]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    13." + relplc[12]));
        System.out.print(String.format("%-40s", "14." + relplc[13]));
        System.out.print(String.format("%-30s", "15." + relplc[14]));
        System.out.println("\n\n\n");

    }

    static void setSelectionReligiousPlace() {

        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("               Do you want to visit all Forts (Yes=1/No=0) : ");
        try {
            x = sc.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.print("               You have entered invalid character \n\n");
            setSelectionReligiousPlace();
        }
        if (x == 1) {
            for (int j = 1; j < 15; j++) {
                sel[i] = relplc[j - 1];
                i++;
            }
        } else {
            int n = 1;
            while (n == 1) {
                System.out.println();
                System.out.print("               Select number to add ReligiousPlace : ");
                num4 = sc.nextInt();
                if (num4 == 15)
                    break;
                ArrayException();
                if (num4 == 15)
                    break;
                i++;
                System.out.print("\n               want to select more ReligiousPlace Y/N:1/0  ");
                n = sc.nextInt();
                System.out.println();
            }
        }
    }

    static void ArrayException() {
        Scanner sc = new Scanner(System.in);

        try {
            sel[i] = relplc[num4 - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("               Please Enter Numbers Which are Displayed on Screen : ");
            num4 = sc.nextInt();
            ArrayException();
        }
    }

}

class Lake extends TourismParent {


    static String lake[] = new String[5];
    static int num5;

    void setLakeNames() {
        this.lake[0] = "DHAMAPUR LAKE";
        this.lake[1] = "MOTI LAKE";
        this.lake[2] = "HARKUL LAKE";
        this.lake[3] = "OSARGAON RESERVOIR";
        this.lake[4] = "GO TO NEXT CATEGORY";


    }

    void getLakeNames() {
        String str1 = String.format("%75s", "LAKE QUOTES");
        System.out.println("\n\n\n");
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Date d = new Date();
        d.TodaysDate();

        System.out.print(String.format("%-55s", "                    1." + lake[0]));
        System.out.print(String.format("%-40s", "2." + lake[1]));
        System.out.print(String.format("%-30s", "3." + lake[2]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    4." + lake[3]));
        System.out.print(String.format("%-40s", "5." + lake[4]));
        System.out.println("\n\n\n");


    }

    static void setSelectionLake() {

        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("               Do you want to visit all Forts (Yes=1/No=0) : ");
        try {
            x = sc.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.print("               You have entered invalid character \n\n");
            setSelectionLake();
        }
        if (x == 1) {
            for (int j = 1; j < 5; j++) {
                sel[i] = lake[j - 1];
                i++;
            }
        } else {
            int n = 1;
            while (n == 1) {
                System.out.println();
                System.out.print("               Select number to add Lake : ");
                num5 = sc.nextInt();
                if (num5 == 5)
                    break;
                ArrayException();
                if (num5 == 5)
                    break;
                i++;
                System.out.print("\n               want to select more Lake Y/N:1/0  ");
                n = sc.nextInt();
                System.out.println();
            }
        }
    }

    static void ArrayException() {
        Scanner sc = new Scanner(System.in);

        try {
            sel[i] = lake[num5 - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("               Please Enter Numbers Which are Displayed on Screen : ");
            num5 = sc.nextInt();
            ArrayException();
        }
    }
}

class Island extends TourismParent {
    static String island[] = new String[7];
    static int num6;

    void setIslandNames() {
        this.island[0] = "TSUNAMI ISLAND";
        this.island[1] = "SEAGULL ISLAND";
        this.island[2] = "JUVE ISLAND";
        this.island[3] = "KHOT JUVA ISLAND";
        this.island[4] = "PANKHOL JAVA ISLAND";
        this.island[5] = "NIVATI ISLAND";
        this.island[6] = "GO TO NEXT CATEGORY";

    }

    void getIslandNames() {

        System.out.println("\n\n\n");
        String str1 = String.format("%70s", "ISLNAD");

        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Date d = new Date();
        d.TodaysDate();

        System.out.print(String.format("%-55s", "                    1." + island[0]));
        System.out.print(String.format("%-40s", "2." + island[1]));
        System.out.print(String.format("%-30s", "3." + island[2]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    4." + island[3]));
        System.out.print(String.format("%-40s", "5." + island[4]));
        System.out.print(String.format("%-30s", "6." + island[5]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    7." + island[6]));
        System.out.println("\n\n\n");

    }

    void setSelectionIsland() {


        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("               Do you want to visit all Forts (Yes=1/No=0) : ");
        try {
            x = sc.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.print("               You have entered invalid character \n\n");
            setSelectionIsland();
        }
        if (x == 1) {
            for (int j = 1; j < 7; j++) {
                sel[i] = island[j - 1];
                i++;
            }
        } else {
            int n = 1;
            while (n == 1) {
                System.out.println();
                System.out.print("               Select number to add Island : ");
                num6 = sc.nextInt();
                if (num6 == 7)
                    break;
                ArrayException();
                if (num6 == 7)
                    break;
                i++;
                System.out.print("\n               want to select more Island Y/N:1/0  ");
                n = sc.nextInt();
                System.out.println();
            }
        }



    }

    static void ArrayException() {
        Scanner sc = new Scanner(System.in);

        try {
            sel[i] = island[num6 - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("               Please Enter Numbers Which are Displayed on Screen : ");
            num6 = sc.nextInt();
            ArrayException();
        }
    }



}

class LightHouse extends TourismParent {


    static String lighthouse[] = new String[5];
    static int num7;

    void setLightHouseNames() {
        this.lighthouse[0] = "DEVGAD LIGHTHOUSE";
        this.lighthouse[1] = "ACHRA LIGHTHOUSE";
        this.lighthouse[2] = "VENGURLA LIGHTHOUSE";
        this.lighthouse[3] = "NIVATI LIGHTHOUSE";
        this.lighthouse[4] = "GO TO NEXT CATEGORY";


    }

    void getLightHouseNames() {
        String str1 = String.format("%75s", "LIGHTHOUSE QUOTES");
        System.out.println("\n\n\n");
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Date d = new Date();
        d.TodaysDate();

        System.out.print(String.format("%-55s", "                    1." + lighthouse[0]));
        System.out.print(String.format("%-40s", "2." + lighthouse[1]));
        System.out.print(String.format("%-30s", "3." + lighthouse[2]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    4." + lighthouse[3]));
        System.out.print(String.format("%-40s", "5." + lighthouse[4]));
        System.out.println("\n\n\n");


    }

    static void setSelectionLightHouse() {

        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("               Do you want to visit all Lighthouse (Yes=1/No=0) : ");
        try {
            x = sc.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.print("               You have entered invalid character \n\n");
            setSelectionLightHouse();
        }
        if (x == 1) {
            for (int j = 1; j < 5; j++) {
                sel[i] = lighthouse[j - 1];
                i++;
            }
        } else {
            int n = 1;
            while (n == 1) {
                System.out.println();
                System.out.print("               Select number to add Lighthouse : ");
                num7 = sc.nextInt();
                if (num7 == 5)
                    break;
                ArrayException();
                if (num7 == 5)
                    break;
                i++;
                System.out.print("\n               want to select more Lighthouse Y/N:1/0  ");
                n = sc.nextInt();
                System.out.println();
            }
        }
    }

    static void ArrayException() {
        Scanner sc = new Scanner(System.in);

        try {
            sel[i] = lighthouse[num7 - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("               Please Enter Numbers Which are Displayed on Screen : ");
            num7 = sc.nextInt();
            ArrayException();
        }
    }

}

class Other extends TourismParent {
    static String other[] = new String[10];
    static int num8;

    void setOtherNames() {
        this.other[0] = "SAWANTWADI PALACE";
        this.other[1] = "WAX MUSEUM";
        this.other[2] = "WINDMILL GARDEN";
        this.other[3] = "ROCK GARDEN";
        this.other[4] = "ZIPLINE ADVENTURE";
        this.other[5] = "PARAGLIDING";
        this.other[6] = "WATER SPORTS";
        this.other[7] = "DOLPHIN SAFARI";
        this.other[8] = "SCUBA DIVING";
        this.other[9] = "NOT INTERESTED";

    }

    void getOtherNames() {

        System.out.println("\n\n\n");
        String str1 = String.format("%80s", "OTHER PLACES...");

        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Date d = new Date();
        d.TodaysDate();

        System.out.print(String.format("%-55s", "                    1." + other[0]));
        System.out.print(String.format("%-40s", "2." + other[1]));
        System.out.print(String.format("%-30s", "3." + other[2]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    4." + other[3]));
        System.out.print(String.format("%-40s", "5." + other[4]));
        System.out.print(String.format("%-30s", "6." + other[5]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    7." + other[6]));
        System.out.print(String.format("%-40s", "8." + other[7]));
        System.out.print(String.format("%-30s", "9." + other[8]));
        System.out.println("\n\n\n");
        System.out.print(String.format("%-55s", "                    10." + other[9]));
        System.out.println("\n\n\n");

    }

    void setSelectionOther() {


        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("               Do you want to visit all Forts (Yes=1/No=0) : ");
        try {
            x = sc.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.print("               You have entered invalid character \n\n");
            setSelectionOther();
        }
        if (x == 1) {
            for (int j = 1; j < 10; j++) {
                sel[i] = other[j - 1];
                i++;
            }
        } else {
            int n = 1;
            while (n == 1) {
                System.out.println();
                System.out.print("               Select number to add Other Place : ");
                num8 = sc.nextInt();
                if (num8 == 10)
                    break;
                ArrayException();
                if (num8 == 10)
                    break;
                i++;
                System.out.print("\n               want to select more Other Place Y/N:1/0  ");
                n = sc.nextInt();
                System.out.println();
            }
        }


    }

    static void ArrayException() {
        Scanner sc = new Scanner(System.in);

        try {
            sel[i] = other[num8 - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("               Please Enter Numbers Which are Displayed on Screen : ");
            num8 = sc.nextInt();
            ArrayException();
        }
    }

}

interface Services {

    void silverPackage();
    void goldenPackage();
    void platinumPackage();
    void diamondPackage();

}

class ServicePackages extends TourismParent implements Services {

    void displayHeading() {
        System.out.println("\n\n\n");
        String str1 = String.format("%90s", "SELECT FROM OUR EXCLUSIVE PACKAGES");

        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str1);
        System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Date d = new Date();
        d.TodaysDate();
        System.out.println("");

    }
	@Override
    public void silverPackage() {

        System.out.println(String.format("%100s", "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*"));
        System.out.print(String.format("%93s", "*     SILVER PACKAGE Rs.1000/- PER PERSON PER DAY") + String.format("%8s", "*\n"));
        System.out.print(String.format("%101s", "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%92s", "*     ~COMFORTABLE AC ROOMS~ ~24 HRS FRONT DESK~") + String.format("%9s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%94s", "*      ~CCTV SECURED PREMISES~ ~WARDROBE & CLOSET~") + String.format("%7s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%99s", "*~INCLUDES COMPLIMENTARY BREAKFAST~ ~FREE CANCELLATION~") + String.format("%2s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%100s", "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*"));
        System.out.println("\n\n\n");


    }
	@Override
    public void goldenPackage() {
        System.out.println(String.format("%100s", "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*"));
        System.out.print(String.format("%93s", "*     GOLDEN PACKAGE Rs.2500/- PER PERSON PER DAY") + String.format("%8s", "*\n"));
        System.out.print(String.format("%101s", "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%92s", "*     ~COMFORTABLE AC ROOMS~ ~24 HRS FRONT DESK~") + String.format("%9s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%94s", "*      ~CCTV SECURED PREMISES~ ~WARDROBE & CLOSET~") + String.format("%7s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%95s", "*      ~LED TV~ ~MINERAL WATER~ ~FREE ROOM SERVICE~") + String.format("%6s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%97s", "*  ~WAKE UP SERVICE~ ~CLEAN TOWELS~ ~FREE TOILETRIES~") + String.format("%4s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%95s", "*       ~INCLUDES COMPLIMENTARY BREAKFAST & LUNCH~ ") + String.format("%6s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%100s", "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*"));
        System.out.println("\n\n\n");
    }
	@Override
    public void platinumPackage() {
        System.out.println(String.format("%100s", "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*"));
        System.out.print(String.format("%95s", "*     PLATINUM PACKAGE Rs.5000/- PER PERSON PER DAY") + String.format("%6s", "*\n"));
        System.out.print(String.format("%101s", "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%92s", "*     ~COMFORTABLE AC ROOMS~ ~24 HRS FRONT DESK~") + String.format("%9s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%94s", "*      ~CCTV SECURED PREMISES~ ~WARDROBE & CLOSET~") + String.format("%7s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%99s", "*~REFRIGERATOR IN ROOM~ ~SWIMMING POOL~ ~POOLSIDE LAWN~") + String.format("%2s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%92s", "*          ~SPACIOUS BALCONY WITH POOLSIDE VIEW~") + String.format("%9s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%99s", "*~LED TV~ ~MINERAL WATER~ ~FREE ROOM & LAUNDRY SERVICE~") + String.format("%1s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%97s", "*  ~WAKE UP SERVICE~ ~CLEAN TOWELS~ ~FREE TOILETRIES~") + String.format("%4s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%97s", "*  ~INCLUDES COMPLIMENTARY BREAKFAST,LUNCH & DINNER~ ") + String.format("%4s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%100s", "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*"));
        System.out.println("\n\n\n");

    }
	@Override
    public void diamondPackage() {
        System.out.println(String.format("%100s", "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*"));
        System.out.print(String.format("%92s", "*     DIAMOND PACKAGE Rs.25000/- A GROUP PER DAY") + String.format("%9s", "*\n"));
        System.out.print(String.format("%101s", "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%94s", "*     ~PRIVATE VILLA FOR 10 PEOPLE WITH SEA VIEW ~") + String.format("%7s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%91s", "*     ~COMFORTABLE AC ROOMS~ ~24 HRS CARETAKER~") + String.format("%10s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%94s", "*      ~CCTV SECURED PREMISES~ ~WARDROBE & CLOSET~") + String.format("%7s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%99s", "*~SPACIOUS GARDEN AREA~ ~SWIMMING POOL~ ~POOLSIDE LAWN~") + String.format("%1s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%93s", "*   ~KITCHEN WITH REFRIGERATOR~ ~WASHING MACHINE~") + String.format("%8s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%101s", "* ~GYM AMENITY~ ~EVENT PLACES~ ~LED TV~ ~MINERAL WATER~*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%92s", "*  ~FREE TOILETRIES~ ~COMPLIMENTRY DRINKS DAILY~") + String.format("%9s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%93s", "*  ~INCLUDES UNLIMITED BREAKFAST,LUNCH & DINNER~ ") + String.format("%8s", "*\n"));
        System.out.print(String.format("%45s", "*") + String.format("%56s", "*\n"));
        System.out.print(String.format("%100s", "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*"));
        System.out.println("\n\n\n");
    }

    static void selectPackage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("                 SELECT THE PACKAGE WHICH YOU WANT TO GO WITH\n\n");
        System.out.print(String.format("%-45s", "                 1.SILVER PACKAGE"));
        System.out.print(String.format("%-35s", "2.GOLDEN PACKAGE"));
        System.out.print(String.format("%-30s", "3.PLATINUM PACKAGE"));
        System.out.print(String.format("%-35s", "4.DIAMOND PACKAGE"));
        System.out.println("\n\n\n");

        char ch = 'Y';
        while (ch == 'Y') {
            System.out.print("                 ENTER THE PACKAGE NUMBER : ");
            try {
                selectpackage = sc.nextByte();
            } catch (Exception e) {
                System.out.print("                 ENTER THE VALID PACKAGE NUMBER : \n\n\n");
                selectPackage();
            }
            System.out.println();
            if (selectpackage > 0 && selectpackage < 5) {
                break;
            } else {
                System.out.println();
                System.out.println("                 ENTER CORRECT NUMBER");
                System.out.println();
                ch = 'Y';
            }
        }


    }

}