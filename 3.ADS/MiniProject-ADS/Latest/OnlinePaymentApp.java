//miniproject ADS
import java.util.Scanner;
class OnlinePaymentApp {

    public static void main(String[] args) {

        UserInterface u = new UserInterface();
        u.displayPage1();
		
    }
}

class UserInterface {
    String name, name1, password, password1, fname, lname, mnum, ifsc, mobTransferName, bAccHolderName, transferBankName;
    String[][][] bank = new String[3][4][5];
    String[][][] userAccount = new String[1][1][5];
    String popBank[] = new String[] {
        "STATE BANK OF INDIA",
        "AXIS BANK",
        "HDFC BANK",
        "BANK OF INDIA",
        "BANK OF MAHARASHTRA",
        "ICICI BANK",
        "BANK OF BARODA",
        "UNION BANK OF INDIA",
        "KOTAK MAHINDRA BANK"
    };
    String conName[] = new String[] {
        "Vipul Tembulvar",
        "Nisha Karolia",
        "Kiran Waghmare",
        "Shweta Bhere",
        "Sohan More"
    };
    long mobnum[] = new long[] {
        8237521789L, 9823363930L, 7798532614L, 7045898990L, 8087811972L
    };
    long mobTransferMob, bAccNumber;

    double userBalance = 100000.00;
    double walletBal, amount;

    int pin, choiceBN, choice;
    int flag = 0, count = 0;

    public void displayPage1() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%37s", "ONLINE PAYMENT APPLICATION"));
        System.out.print(String.format("%12s", "|"));
        System.out.println();
        System.out.println(String.format("%80s", "=================================================="));

        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%27s", "1.LOGIN"));
        System.out.print(String.format("%22s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%28s", "2.SIGNUP"));
        System.out.print(String.format("%21s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%49s", "|"));
        System.out.println();
        System.out.println(String.format("%80s", "=================================================="));

        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            displayPage1();
            return;
        };
        signupPage();


    }

    public void header() {
        System.out.println();
        System.out.println();
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%31s", "|"));
        System.out.print(String.format("%37s", "ONLINE PAYMENT APPLICATION"));
        System.out.print(String.format("%12s", "|"));
        System.out.println();
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println();
        System.out.println();
    }

    public void loginPage() {
        header();
        System.out.println(String.format("%-100s", String.format("%64s", "ENTER LOGIN DETAILS")));
        System.out.println();

        login();
    }

    public void signupPage() {

        if (choice == 1) {
            header();
            System.out.println(String.format("%-100s", String.format("%64s", "ENTER USER INFORMATION")));
            System.out.println();
			if(flag==0){
            login1();
			}
			else if(flag==5)
			{
				login();
			}

        } else if (choice == 2) {
            header();
            System.out.println(String.format("%-100s", String.format("%64s", "ENTER USER INFORMATION")));
            System.out.println();
            signup();
        } else if (choice < 1 || choice > 2) {
            displayPage1();
        }


    }

    public void login1() {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print(String.format("%53s", "ENTER USERNAME      : "));
        name = sc.next();
        if (!name.equals(name1)) {
            System.out.println();
            System.out.println(String.format("%50s", "USER DOES NOT EXIST"));
            System.out.println();
            System.out.println(String.format("%45s", "PLEASE SIGN UP"));

            displayPage1();
        }

    }

    //Logic for Incorrect Login Details  
    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print(String.format("%53s", "ENTER USERNAME      : "));
        name = sc.next();
        if (!name.equals(name1)) {
            System.out.println();
            System.out.println(String.format("%54s", "INCORRECT LOGIN DETAILS"));

            login();
        } else {
            System.out.print(String.format("%53s", "ENTER PASSWORD      : "));
            password = sc.next();

            if (name.equals(name1) && password.equals(password1)) {
                System.out.println();
                System.out.println();
                System.out.println(String.format("%65s", "\2 LOGIN SUCCESSFUL \2"));
                System.out.println();
                System.out.println();
                
				
				if(flag==5)
				{
					home();
					
				} else if(flag==0){
					displayPage2();
				}
            } else {
                System.out.println();
                System.out.println(String.format("%49s", "INCORRECT PASSWORD"));

                login();

            }
        }
    }

    public void signup() {
        Scanner sc = new Scanner(System.in);
        System.out.print(String.format("%53s", "ENTER FIRST NAME    : "));
        fname = sc.next();
        System.out.print(String.format("%53s", "ENTER LAST NAME     : "));
        lname = sc.next();
        System.out.print(String.format("%53s", "ENTER MOBILE NUMBER : "));
        mnum = sc.next();
        System.out.print(String.format("%53s", "ENTER USERNAME      : "));
        name1 = sc.next();
        System.out.print(String.format("%53s", "ENTER PASSWORD      : "));
        password1 = sc.next();


        loginPage();
    }

    public void displayPage2() {
        Scanner sc = new Scanner(System.in);
        header();
        System.out.println(String.format("%-100s", String.format("%64s", "ADD BANK ACCOUNT")));
        System.out.println();

        setBankDetails();
        addBank();
        addingBankAccount();

    }

    //Database of Bank Details for Signup
    public void setBankDetails() {
        bank[0][0][0] = "STATE BANK OF INDIA"; //bank name
        bank[0][0][1] = "Amey Anil Mhadgut"; //customer name
        bank[0][0][2] = "9476664269"; //mobile number
        bank[0][0][3] = "67543560098"; //account number
        bank[0][0][4] = "SBIN0000300"; //ifsc

        bank[0][1][0] = "STATE BANK OF INDIA"; //bank name
        bank[0][1][1] = "Amey Ramesh Patekar"; //customer name
        bank[0][1][2] = "9978564356"; //mobile number
        bank[0][1][3] = "67894127868"; //account number
        bank[0][1][4] = "SBIN0000350"; //ifsc

        bank[0][2][0] = "STATE BANK OF INDIA"; //bank name
        bank[0][2][1] = "Ajay Shivbans Yadav"; //customer name
        bank[0][2][2] = "9996325767"; //mobile number
        bank[0][2][3] = "67894127124"; //account number
        bank[0][2][4] = "SBIN0000310"; //ifsc

        bank[0][3][0] = "STATE BANK OF INDIA"; //bank name
        bank[0][3][1] = "Ajinkya Vijay Chinchkar"; //customer name
        bank[0][3][2] = "9424788657"; //mobile number
        bank[0][3][3] = "67543560128"; //account number
        bank[0][3][4] = "SBIN0000301"; //ifsc

        bank[1][0][0] = "HDFC BANK"; //bank name
        bank[1][0][1] = "Amey Anil Mhadgut"; //customer name
        bank[1][0][2] = "9476664269"; //mobile number
        bank[1][0][3] = "87563436567"; //account number
        bank[1][0][4] = "HDFC0000522"; //ifsc

        bank[1][1][0] = "HDFC BANK"; //bank name
        bank[1][1][1] = "Chandrakant Shringarputale"; //customer name
        bank[1][1][2] = "9674265679"; //mobile number
        bank[1][1][3] = "87563654567"; //account number
        bank[1][1][4] = "HDFC0000525"; //ifsc

        bank[1][2][0] = "HDFC BANK"; //bank name
        bank[1][2][1] = "Ajay Shivbans Yadav"; //customer name
        bank[1][2][2] = "9996325767"; //mobile number
        bank[1][2][3] = "87563432167"; //account number
        bank[1][2][4] = "HDFC0000520"; //ifsc

        bank[2][0][0] = "AXIS BANK"; //bank name
        bank[2][0][1] = "Amey Ramesh Patekar"; //customer name
        bank[2][0][2] = "9978564356"; //mobile number
        bank[2][0][3] = "92134513485"; //account number
        bank[2][0][4] = "UTIB0000265"; //ifsc

        bank[2][1][0] = "AXIS BANK"; //bank name
        bank[2][1][1] = "Chandrakant Shringarputale"; //customer name
        bank[2][1][2] = "9674265679"; //mobile number
        bank[2][1][3] = "92134554885"; //account number
        bank[2][1][4] = "UTIB0000146"; //ifsc

        bank[2][2][0] = "AXIS BANK"; //bank name
        bank[2][2][1] = "Ajinkya Vijay Chinchkar"; //customer name
        bank[2][2][2] = "9424788657"; //mobile number
        bank[2][2][3] = "92456554886"; //account number
        bank[2][2][4] = "UTIB0000012"; //ifsc

    }

    public void addBank() {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        String[][][] temp = new String[1][2][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (mnum.equals(bank[i][j][2])) {
                    if (n == 1) {
                        for (int k = 0; k < 5; k++)
                            temp[0][0][k] = bank[i][j][k];
                    } else if (n == 2) {
                        for (int k = 0; k < 5; k++)
                            temp[0][1][k] = bank[i][j][k];
                    }

                    System.out.println(String.format("%-50s", String.format("%53s", "ACCOUNT             : ") + n++));
                    System.out.println(String.format("%-50s", String.format("%53s", "BANK NAME           : ") + bank[i][j][0]));
                    System.out.println(String.format("%-50s", String.format("%53s", "COSTUMER NAME       : ") + bank[i][j][1]));
                    System.out.println(String.format("%-50s", String.format("%53s", "ACCOUNT NUMBER      : ") + bank[i][j][3]));
                    System.out.println(String.format("%-50s", String.format("%53s", "IFSC                : ") + bank[i][j][4]));
                    System.out.println(String.format("%-50s", String.format("%53s", "MOBILE NUMBER       : ") + bank[i][j][2]));

                }

            }
            System.out.println();
        }

        System.out.print(String.format("%-50s", String.format("%53s", "SELECT ACCOUNT      : ")));
        int ch = 0;
        try {
            ch = sc.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.println(String.format("%-50s", String.format("%58s", "ENTER ONLY NUMERICAL VALUE ")));
            System.out.println();
            addBank();
        };
        if (ch == 1) {
            for (int i = 0; i < 5; i++) {
                userAccount[0][0][i] = temp[0][0][i];
            }
        } else if (ch == 2) {
            for (int i = 0; i < 5; i++) {
                userAccount[0][0][i] = temp[0][1][i];
            }
        }



    }

    public void addingBankAccount() {
        Scanner sc = new Scanner(System.in);
        header();
        System.out.println(String.format("%-100s", String.format("%70s", "BANK ACCOUNT ADDED SUCCESSFULLY")));
        System.out.println();
        System.out.println(String.format("%-50s", String.format("%53s", "BANK NAME           : ") + userAccount[0][0][0]));
        System.out.println(String.format("%-50s", String.format("%53s", "COSTUMER NAME       : ") + userAccount[0][0][1]));
        System.out.println(String.format("%-50s", String.format("%53s", "ACCOUNT NUMBER      : ") + userAccount[0][0][3]));
        System.out.println(String.format("%-50s", String.format("%53s", "IFSC                : ") + userAccount[0][0][4]));
        System.out.println(String.format("%-50s", String.format("%53s", "MOBILE NUMBER       : ") + userAccount[0][0][2]));

        System.out.println("\n");
        setPin();
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.HOME                                     0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
        } catch (Exception e) {
            home();
            return;
        }
        if (choice == -1) {
            home();
        } else if (choice == 0) {
            System.exit(0);
        }

    }

    public void setPin() {
        Scanner sc = new Scanner(System.in);
        int pin2 = 0;
        System.out.println(String.format("%-50s", String.format("%53s", "SET 6 DIGIT PIN       ")));
        System.out.println();
        System.out.print(String.format("%-50s", String.format("%53s", "SET YOUR PIN        : ")));
        try {
            pin = sc.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.println(String.format("%-50s", String.format("%58s", "ENTER ONLY NUMERICAL VALUE ")));
            setPin();
            return;
        };

        String str = Integer.toString(pin);
        if (str.trim().length() != 6) {
            System.out.println();
            System.out.println(String.format("%-50s", String.format("%63s", "PIN Should be in 6 Digits Format")));
            System.out.println();
            setPin();
        } else {
            pin = Integer.parseInt(str);
            System.out.println();
            System.out.print(String.format("%-50s", String.format("%53s", "ENTER PIN AGAIN     : ")));
            try {
                pin2 = sc.nextInt();
            } catch (Exception e) {
                System.out.println();
                System.out.println(String.format("%-50s", String.format("%58s", "ENTER ONLY NUMERICAL VALUE ")));
                setPin();
                return;
            };

            if (pin != pin2) {
                System.out.println();
                System.out.println(String.format("%-50s", String.format("%44s", "PIN NOT MATCH")));
                System.out.println();
                setPin();
            }
        }
        if (pin == pin2) {
            System.out.println();
            System.out.println(String.format("%70s", "\2 PIN GENERATED SUCCESSFULLY \2"));
            System.out.println("\n\n");
            return;
        }

    }

    //Home Page
    public void home() {

        Scanner sc = new Scanner(System.in);
        header();
        System.out.println(String.format("%-100s", String.format("%61s", "MONEY TRANSFER")));
        System.out.println("\n\n");
        System.out.print(String.format("%75s", "BANK                           MOBILE\n\n"));
        System.out.print(String.format("%75s", "TRANSFER                        TRANSFER\n"));
        System.out.print(String.format("%71s", "[1]                             [2]"));
        System.out.println("\n\n\n");
        System.out.print(String.format("%74s", "WALLET                          CHECK\n\n"));
        System.out.print(String.format("%74s", "RECHARGE                        BALANCE\n"));
        System.out.print(String.format("%71s", "[3]                             [4]"));
		System.out.println("\n");
		System.out.println(String.format("%-50s", String.format("%64s", "TRANSACTION HISTORY")));
		System.out.print(String.format("%56s", "[5]"));
        System.out.println("\n");
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.LOGOUT                                  0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%58s", "ENTER ONLY NUMERICAL VALUE ")));
            home();
            return;
        }
        if (choice == -1) {
            header();
            System.out.println(String.format("%-100s", String.format("%64s", "ENTER USER INFORMATION")));
            System.out.println();
			flag=5;
            displayPage1();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice == 1) {
            popularBank();
        } else if (choice == 2) {
            mobileTransfer();
        } else if (choice == 3) {
            walletRecharge();
        } else if (choice == 4) {
            checkBalance();
        } else if (choice == 5) {
            transactionPage();
        } else if (choice < -1 || choice > 5) {
            home();
        }

    }

    //1.Bank Transfer
    public void popularBank() {

        Scanner sc = new Scanner(System.in);
        header();

        System.out.print(String.format("%-50s", String.format("%62s", "POPULAR BANKS ")));
        System.out.println("\n\n");
        System.out.print(String.format("%70s", "SBI          AXIS          HDFC\n"));
        System.out.print(String.format("%70s", "BANK         BANK          BANK\n"));
        System.out.print(String.format("%68s", "[1]          [2]           [3]"));
        System.out.println("\n\n");
        System.out.print(String.format("%71s", "BOI          BOM           ICICI\n"));
        System.out.print(String.format("%70s", "BANK         BANK          BANK\n"));
        System.out.print(String.format("%68s", "[4]          [5]           [6]"));
        System.out.println("\n\n");
        System.out.print(String.format("%71s", "BOB          UNION         KOTAK\n"));
        System.out.print(String.format("%70s", "BANK         BANK          BANK\n"));
        System.out.print(String.format("%68s", "[7]          [8]           [9]"));
        System.out.println("\n\n\n");
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.HOME                                    0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            popularBank();
            return;
        };
        choiceBN = choice;

        if (choice == 1) {
            transferBankName = popBank[0];
            bankTransfer();
        } else if (choice == 2) {
            transferBankName = popBank[1];
            bankTransfer();
        } else if (choice == 3) {
            transferBankName = popBank[2];
            bankTransfer();
        } else if (choice == 4) {
            transferBankName = popBank[3];
            bankTransfer();
        } else if (choice == 5) {
            transferBankName = popBank[4];
            bankTransfer();
        } else if (choice == 6) {
            transferBankName = popBank[5];
            bankTransfer();
        } else if (choice == 7) {
            transferBankName = popBank[6];
            bankTransfer();
        } else if (choice == 8) {
            transferBankName = popBank[7];
            bankTransfer();
        } else if (choice == 9) {
            transferBankName = popBank[8];
            bankTransfer();
        } else if (choice == -1) {
            home();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice < -1 || choice > 9) {
            home();
        }
    }

    public void bankName() {
        choice = choiceBN;
        if (choice == 1) {
            System.out.println(String.format("%-50s", String.format("%67s", "STATE BANK OF INDIA ")));

        } else if (choice == 2) {
            System.out.println(String.format("%-50s", String.format("%60s", "AXIS BANK ")));

        } else if (choice == 3) {
            System.out.println(String.format("%-50s", String.format("%60s", "HDFC BANK ")));

        } else if (choice == 4) {
            System.out.println(String.format("%-50s", String.format("%62s", "BANK OF INDIA ")));

        } else if (choice == 5) {
            System.out.println(String.format("%-50s", String.format("%66s", "BANK OF MAHARASHTRA ")));

        } else if (choice == 6) {
            System.out.println(String.format("%-50s", String.format("%59s", "ICICI BANK")));

        } else if (choice == 7) {
            System.out.println(String.format("%-50s", String.format("%62s", "BANK OF BARODA")));

        } else if (choice == 8) {
            System.out.println(String.format("%-50s", String.format("%65s", "UNION BANK OF INDIA")));

        } else if (choice == 9) {
            System.out.println(String.format("%-50s", String.format("%65s", "KOTAK MAHINDRA BANK")));

        }


    }

    public void bankTransfer() {
        Scanner sc = new Scanner(System.in);
        header();
        bankName();
        System.out.println();

        System.out.println();
        verifyBankAccountNo();
        System.out.print(String.format("%-50s", String.format("%56s", "ENTER IFSC             : ")));
        ifsc = sc.next();
        System.out.println();
        sc.nextLine();

        System.out.print(String.format("%-50s", String.format("%56s", "ACCOUNT HOLDER NAME    : ")));
        bAccHolderName = sc.nextLine();
        System.out.println();

        System.out.print(String.format("%-50s", String.format("%56s", "ENTER AMOUNT           : ")));
        try {
            amount = sc.nextDouble();
        } catch (Exception e) {
            System.out.print(String.format("%-50s", String.format("%59s", "ENTER NUMERICAL VALUE")));
            bankTransfer();
            return;
        };
        System.out.println("\n\n\n\n\n\n");
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.HOME              1.CONFIRM             0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            bankTransfer();
            return;
        };
        if (choice == -1) {
            home();
        }
        if (choice == 1) {
            paymentOptions();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice < -1 || choice > 0) {
            home();
        }
    }

    public void verifyBankAccountNo() {

        Scanner sc = new Scanner(System.in);
        long bAccNumber1 = 0L;
        int ch = 1;
        System.out.print(String.format("%-50s", String.format("%56s", "ENTER ACCOUNT NUMBER   : ")));
        try {
            bAccNumber = sc.nextLong();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%59s", "ENTER NUMERICAL VALUE")));
            verifyBankAccountNo();
            return;
        };
        System.out.println();


        String str = Long.toString(bAccNumber);
        if (str.trim().length() != 11) {
            System.out.println();
            System.out.println(String.format("%-50s", String.format("%63s", "It Should be in 11 Digits Format")));
            System.out.println();
            verifyBankAccountNo();
        } else {

            bAccNumber = Long.parseLong(str);

            System.out.print(String.format("%-50s", String.format("%56s", "CONFIRM ACCOUNT NUMBER : ")));
            try {
                bAccNumber1 = sc.nextLong();
            } catch (Exception e) {
                System.out.println(String.format("%-50s", String.format("%59s", "ENTER NUMERICAL VALUE")));
                verifyBankAccountNo();
                return;
            };
            System.out.println();

            if (bAccNumber != bAccNumber1) {
                System.out.println();
                System.out.println(String.format("%-50s", String.format("%55s", "ACCOUNT NUMBER NOT MATCH")));
                System.out.println();
                verifyBankAccountNo();
            }

        }
        if (bAccNumber == bAccNumber1) {
            return;
        }


    }

    //2.Mobile Transfer
    public void mobileTransfer() {

        Scanner sc = new Scanner(System.in);
        header();

        System.out.println(String.format("%60s", "CONTACT LIST"));
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(String.format("%-50s", String.format("%53s", (i + 1) + ".NAME              : ") + conName[i]));
            System.out.println(String.format("%-50s", String.format("%53s", "  MOBILE NUMBER     : ") + mobnum[i]));
            System.out.println();
        }

        System.out.println("\n\n\n\n");
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.HOME                                    0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            mobileTransfer();
            return;
        };
        if (choice == 1) {
            mobTransferName = conName[0];
            mobTransferMob = mobnum[0];
            mobileTransferPage2();
        }
        if (choice == 2) {
            mobTransferName = conName[1];
            mobTransferMob = mobnum[1];
            mobileTransferPage2();
        }
        if (choice == 3) {
            mobTransferName = conName[2];
            mobTransferMob = mobnum[2];
            mobileTransferPage2();
        }
        if (choice == 4) {
            mobTransferName = conName[3];
            mobTransferMob = mobnum[3];
            mobileTransferPage2();
        }
        if (choice == 5) {
            mobTransferName = conName[4];
            mobTransferMob = mobnum[4];
            mobileTransferPage2();
        }
        if (choice == -1) {
            home();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice < -1 || choice > 5) {
            home();
        }

    }

    public void mobileTransferPage2() {
        Scanner sc = new Scanner(System.in);
        header();
        System.out.println(String.format("%-50s", String.format("%60s", "TRANSFERRING TO")));
        System.out.println("\n");

        System.out.print(String.format("%-50s", String.format("%56s", "CONTACT NAME           : ") + mobTransferName));
        System.out.println("\n");
        System.out.print(String.format("%-50s", String.format("%56s", "MOBILE NUMBER          : ") + mobTransferMob));
        System.out.println("\n");
        System.out.print(String.format("%-50s", String.format("%56s", "ENTER AMOUNT           : ")));
        try {
            amount = sc.nextDouble();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%59s", "ENTER NUMERICAL VALUE")));
            mobileTransferPage2();
            return;
        };

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.HOME              1.CONFIRM             0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            mobileTransferPage2();
            return;
        };
        if (choice == -1) {
            home();
        }
        if (choice == 1) {
            flag = 3;
            paymentOptions();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice < -1 || choice > 1) {
            home();
        }

    }

    //Bank and Wallet Payment Options
    public void paymentOptions() {
        Scanner sc = new Scanner(System.in);
        header();

        System.out.print(String.format("%66s", "SELECT PAYMENT OPTIONS "));
        System.out.println();
        System.out.println();
        System.out.print(String.format("%62s", "1. BANK ACCOUNT "));
        System.out.println();
        System.out.println();
        System.out.print(String.format("%56s", "2. WALLET "));
        System.out.println();


        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.HOME                                    0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            paymentOptions();
            return;
        };
        if (choice == -1) {
            home();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice == 1) {
            updateBankBalance();
            transactionReceipt();

        } else if (choice == 2) {
            updateWalletBalance();
            transactionReceipt();

        } else if (choice < -1 || choice > 2) {
            home();
        }

    }

    //3.Wallet Recharge
    public void walletRecharge() {
        Scanner sc = new Scanner(System.in);
        header();

        System.out.print(String.format("%-50s", String.format("%63s", "WALLET RECHARGE")));
        System.out.println("\n\n");
        System.out.print(String.format("%-50s", String.format("%53s", "ENTER AMOUNT        : ")));
        try {
            amount = sc.nextDouble();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%59s", "ENTER NUMERICAL VALUE")));
            walletRecharge();
            return;
        };

        System.out.println();


        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.HOME              1.CONFIRM             0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            home();
            return;
        };

        if (choice == -1) {
            home();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice == 1) {
            flag = 4;
            transactionReceipt();
        } else if (choice < -1 || choice > 0) {
            home();
        }


    }

    //4.Check Balance
    public void checkBalance() {
        Scanner sc = new Scanner(System.in);
        header();

        System.out.println(String.format("%62s", "BANK ACCOUNT"));
        System.out.println();
        System.out.println(String.format("%59s", "BALANCE"));
        System.out.println(String.format("%57s", "[1]"));
        System.out.println("\n\n\n\n\n\n");

        System.out.println(String.format("%59s", "WALLET "));
        System.out.println();
        System.out.println(String.format("%59s", "BALANCE"));
        System.out.println(String.format("%57s", "[2]"));
        System.out.println("\n\n\n");
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.HOME                                    0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            checkBalance();
            return;
        };
        if (choice == -1) {
            home();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice == 1) {
            bankAccountBalance();
        } else if (choice == 2) {
            walletBalance();
        } else if (choice < -1 || choice > 2) {
            home();
        }
    }

    public void bankAccountBalance() {
        Scanner sc = new Scanner(System.in);
        header();

        System.out.println(String.format("%-50s", String.format("%53s", "BANK NAME           : ") + userAccount[0][0][0]));
        System.out.println();
        System.out.println(String.format("%-50s", String.format("%53s", "COSTUMER NAME       : ") + userAccount[0][0][1]));
        System.out.println();
        System.out.println(String.format("%-50s", String.format("%53s", "ACCOUNT NUMBER      : ") + userAccount[0][0][3]));
        System.out.println();
        System.out.println();
        flag = 1;
        pinVerification();
        flag = 0;
        System.out.println("\n\n");
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.BACK                                    0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            checkBalance();
            return;
        };
        if (choice == -1) {
            checkBalance();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice < -1 || choice > 0) {
            home();
        }
    }

    public void walletBalance() {
        Scanner sc = new Scanner(System.in);

        header();

        System.out.println(String.format("%62s", "WALLET BALANCE"));

        System.out.println("\n");
        System.out.println(String.format("%-50s", String.format("%53s", "ACCOUNT HOLDER NAME : ") + userAccount[0][0][1]));
        System.out.println();
        System.out.println();
        flag = 1;
        pinVerification();
        flag = 0;
        System.out.println("\n\n\n");
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.BACK                                    0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            checkBalance();
            return;
        };
        if (choice == -1) {
            checkBalance();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice < -1 || choice > 0) {
            home();
        }

    }

    public void pinVerification() {

        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int ch = 1;

        while (ch == 1) {
            System.out.println(" ");
            System.out.print(String.format("%-50s", String.format("%53s", "ENTER YOUR PIN      : ")));
            try {
                temp = sc.nextInt();
            } catch (Exception e) {
                System.out.println(String.format("%-50s", String.format("%60s", "ENTER 6 DIGIT NUMERICAL VALUE")));
                pinVerification();
                return;
            };
            System.out.println("\n\n");
            if (temp == pin && flag == 1) {
                if (choice == 2) {
                    System.out.println(String.format("%67s", "WALLET BALANCE IS   "));
                    System.out.println();
                    System.out.println(String.format("%60s", "Rs." + walletBal));
                    System.out.println();
                } else if (choice == 1) {
                    System.out.println(String.format("%64s", "BANK BALANCE IS "));
                    System.out.println();
                    System.out.println(String.format("%61s", "Rs." + userBalance));
                    System.out.println();
                }
                ch = 0;

            } else if (temp == pin) {
                ch = 0;
            } else if (temp != pin) {
                System.out.println(String.format("%-50s", String.format("%55s", "ENTERED WRONG PIN       ")));
                System.out.println();

            }
        }
    }

    //Formula for updating balance
    public void updateBankBalance() {
        if (userBalance > 0 && userBalance - amount >= 0)
            userBalance -= amount;
        else {
            System.out.println();
            System.out.print(String.format("%51s", "INSUFFICIENT BALANCE"));
            home();
        }
    }

    public void updateWalletBalance() {
        if (walletBal > 0 && walletBal - amount >= 0)
            walletBal -= amount;
        else {
            System.out.println();
            System.out.print(String.format("%51s", "INSUFFICIENT BALANCE"));
            home();
        }

    }

    //Transaction Successful Receipt
    public void transactionReceipt() {
        Scanner sc = new Scanner(System.in);
        header();


        pinVerification();

        System.out.print(String.format("%69s", "\2 TRANSACTION SUCCESSFUL \2"));
        System.out.println();
        System.out.println("\n");
        if (flag == 4) {
            System.out.println("\n");
            System.out.print(String.format("%-50s", String.format("%70s", "\2 WALLET RECHARGE SUCCESSFUL \2")));
            walletBal += amount;
            updateBankBalance();
            addNode("", 0l, "", amount, "", 0l);
            flag = 0;
        } else if (flag == 3) {
            System.out.print(String.format("%-50s", String.format("%53s", "CONTACT NAME        : ") + mobTransferName));
            System.out.println("\n");
            System.out.print(String.format("%-50s", String.format("%53s", "MOBILE NUMBER       : ") + mobTransferMob));
            System.out.println("\n");
            System.out.print(String.format("%-50s", String.format("%53s", "TRANSFER AMOUNT     : ") + amount));
            System.out.println("\n");
            addNode("", 0l, "", amount, mobTransferName, mobTransferMob);
            flag = 0;
        } else {
            System.out.print(String.format("%-50s", String.format("%53s", "ACCOUNT HOLDER NAME : ") + bAccHolderName));
            System.out.println("\n");
            System.out.print(String.format("%-50s", String.format("%53s", "BANK NAME           : ") + transferBankName));
            System.out.println("\n");
            System.out.print(String.format("%-50s", String.format("%53s", "ACCOUNT NUMBER      : ") + bAccNumber));
            System.out.println("\n");
            System.out.print(String.format("%-50s", String.format("%53s", "TRANSFER AMOUNT     : ") + amount));
            addNode(bAccHolderName, bAccNumber, transferBankName, amount, "", 0L);
        }

        System.out.println("\n\n\n\n");
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.HOME                                    0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            home();
            return;
        };
        if (choice == -1) {
            home();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice < -1 || choice > 0) {
            home();
        }
    }

    //Transaction History Code Using Doubly Linked List
    public void transactionPage() {
        Scanner sc = new Scanner(System.in);
        header();

        System.out.print(String.format("%68s", "SELECT TRANSACTION FILTER"));
        System.out.println();
        System.out.println("\n");


        System.out.print(String.format("%-50s", String.format("%55s", "1.NEW TRANSACTIONS FIRST")));
        System.out.println("\n");
        System.out.print(String.format("%-50s", String.format("%55s", "2.OLD TRANSACTIONS FIRST")));
        System.out.println("\n");
        System.out.print(String.format("%-50s", String.format("%55s", "3.SORT USING HIGH AMOUNT")));
        System.out.println("\n");
        System.out.print(String.format("%-50s", String.format("%54s", "4.SORT USING LOW AMOUNT")));
        System.out.println("\n");
        System.out.print(String.format("%-50s", String.format("%51s", "5.DELETE TRANSACTION")));
        System.out.println("\n");
        System.out.print(String.format("%-50s", String.format("%46s", "6.CLEAR HISTORY")));
        System.out.println("\n\n\n\n");
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.HOME                                    0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            transactionPage();
            return;
        };
        if (choice == -1) {
            home();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice == 1) {
            newTransactionsFirst();
        } else if (choice == 2) {
            oldTransactionsFirst();
        } else if (choice == 3) {
            sortUsingHighAmount();
        } else if (choice == 4) {
            sortUsingLowAmount();
        } else if (choice == 5) {
            display();

        } else if (choice == 6) {
            deleteTransactionHistory();
        } else if (choice < -1 || choice > 6) {
            home();
        }
    }

    class Node {
        String bAccHolderName;
        long bAccNumber;
        String transferBankName;
        double amount;
        //date
        String mobTransferName;
        long mobTransferMob;

        Node next;
        Node prev;

        public Node(String ahn, long an, String bn, double amt, String mtn, long mtm) {
            this.bAccHolderName = ahn;
            this.bAccNumber = an;
            this.transferBankName = bn;
            this.amount = amt;
            this.mobTransferName = mtn;
            this.mobTransferMob = mtm;
            this.next = null;
            this.prev = null;
        }
    }

    Node head, tail;

    public void addNode(String ahn, long an, String bn, double amt, String mtn, long mtm) {
        Node newNode = new Node(ahn, an, bn, amt, mtn, mtm);

        if (head == null) {
            head = tail = newNode;

        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() {
        Scanner sc = new Scanner(System.in);
        count = 0;
        Node temp = null;
        Node trav = null;
        trav = temp = head;
        header();

        if (head == null) {
            System.out.print(String.format("%70s", "THE TRANSACTION HISTORY IS EMPTY"));
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


        } else {


            System.out.println();
            while (trav != null) {
                if (trav.mobTransferMob == 0l && trav.bAccHolderName == "") {
                    System.out.print(String.format("%-50s", String.format("%33s", "" + (++count) + ".")));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "WALLET RECHARGE       ")));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "TRANSFER AMOUNT     : ") + trav.amount));
                    System.out.println();
                    System.out.println();
                } else if (trav.bAccHolderName == "") {
                    System.out.print(String.format("%-50s", String.format("%33s", "" + (++count) + ".")));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "CONTACT NAME        : ") + trav.mobTransferName));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "MOBILE NUMBER       : ") + trav.mobTransferMob));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "TRANSFER AMOUNT     : ") + trav.amount));
                    System.out.println();
                    System.out.println();
                } else {
                    System.out.print(String.format("%-50s", String.format("%33s", "" + (++count) + ".")));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "ACCOUNT HOLDER NAME : ") + trav.bAccHolderName));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "BANK NAME           : ") + trav.transferBankName));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "ACCOUNT NUMBER      : ") + trav.bAccNumber));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "TRANSFER AMOUNT     : ") + trav.amount));
                    System.out.println();
                    System.out.println();
                }
                temp = trav;
                trav = trav.next;
            }


        }
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.BACK                                    0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            transactionPage();
            return;
        };
        if (choice == -1) {
            transactionPage();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice > 0) {
            deleteAtGivenPosition(choice);
        } else if (choice < -1) {
            home();
        }

    }

    //1.NEW TRANSACTIONS FIRST
    public void newTransactionsFirst() {
        Scanner sc = new Scanner(System.in);
        Node temp = null;
        Node trav = null;
        count = 0;
        trav = temp = head;
        header();

        if (head == null) {
            System.out.print(String.format("%70s", "THE TRANSACTION HISTORY IS EMPTY"));
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        } else {
            while (trav != null) {
                temp = trav;
                trav = trav.next;
            }


            System.out.println();
            while (temp != null) {
                if (temp.mobTransferMob == 0l && temp.bAccHolderName == "") {
                    System.out.print(String.format("%-50s", String.format("%33s", "" + (++count) + ".")));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "WALLET RECHARGE       ")));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "TRANSFER AMOUNT     : ") + temp.amount));
                    System.out.println();
                    System.out.println();
                } else if (temp.bAccHolderName == "") {
                    System.out.print(String.format("%-50s", String.format("%33s", "" + (++count) + ".")));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "CONTACT NAME        : ") + temp.mobTransferName));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "MOBILE NUMBER       : ") + temp.mobTransferMob));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "TRANSFER AMOUNT     : ") + temp.amount));
                    System.out.println();
                    System.out.println();
                } else {
                    System.out.print(String.format("%-50s", String.format("%33s", "" + (++count) + ".")));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "ACCOUNT HOLDER NAME : ") + temp.bAccHolderName));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "BANK NAME           : ") + temp.transferBankName));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "ACCOUNT NUMBER      : ") + temp.bAccNumber));
                    System.out.println();
                    System.out.print(String.format("%-50s", String.format("%53s", "TRANSFER AMOUNT     : ") + temp.amount));
                    System.out.println();
                    System.out.println();
                }
                temp = temp.prev;
            }


        }
        System.out.println(String.format("%80s", "=================================================="));
        System.out.println(String.format("%-50s", String.format("%80s", "-1.BACK                                    0.EXIT")));
        System.out.println(String.format("%80s", "=================================================="));
        System.out.print(String.format("%46s", "ENTER CHOICE : "));
        try {
            choice = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println(String.format("%-50s", String.format("%45s", "INVALID CHOICE")));
            System.out.println();
            transactionPage();
            return;
        };
        if (choice == -1) {
            transactionPage();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice < -1 || choice > 0) {
            home();
        }

    }

    //2.OLD TRANSACTIONS FIRST
    public void oldTransactionsFirst() {
        display();
    }

    //3.BUBBLE SORT USING HIGH AMOUNT
    public void sortUsingLowAmount() {
        Node index = null;
        Node trav = null;
        trav = head;
        double tempD;
        long tempL;
        String tempStr;

        if (head == null) {
            display();
            return;
        } else {
            while (trav != null) {
                index = trav.next;
                while (index != null) {
                    if (trav.amount > index.amount) {
                        tempD = trav.amount;
                        trav.amount = index.amount;
                        index.amount = tempD;

                        tempStr = trav.bAccHolderName;
                        trav.bAccHolderName = index.bAccHolderName;
                        index.bAccHolderName = tempStr;

                        tempStr = trav.transferBankName;
                        trav.transferBankName = index.transferBankName;
                        index.transferBankName = tempStr;

                        tempL = trav.bAccNumber;
                        trav.bAccNumber = index.bAccNumber;
                        index.bAccNumber = tempL;

                        tempStr = trav.mobTransferName;
                        trav.mobTransferName = index.mobTransferName;
                        index.mobTransferName = tempStr;

                        tempL = trav.mobTransferMob;
                        trav.mobTransferMob = index.mobTransferMob;
                        index.mobTransferMob = tempL;

                    }
                    index = index.next;
                }
                trav = trav.next;
            }
        }

        display();
    }

    //4.BUBBLE SORT USING LOW AMOUNT
    public void sortUsingHighAmount() {
        Node index = null;
        Node trav = null;
        trav = head;
        double tempD;
        long tempL;
        String tempStr;

        if (head == null) {
            display();
            return;
        } else {
            while (trav != null) {
                index = trav.next;
                while (index != null) {
                    if (trav.amount < index.amount) {
                        tempD = trav.amount;
                        trav.amount = index.amount;
                        index.amount = tempD;

                        tempStr = trav.bAccHolderName;
                        trav.bAccHolderName = index.bAccHolderName;
                        index.bAccHolderName = tempStr;

                        tempStr = trav.transferBankName;
                        trav.transferBankName = index.transferBankName;
                        index.transferBankName = tempStr;

                        tempL = trav.bAccNumber;
                        trav.bAccNumber = index.bAccNumber;
                        index.bAccNumber = tempL;

                        tempStr = trav.mobTransferName;
                        trav.mobTransferName = index.mobTransferName;
                        index.mobTransferName = tempStr;

                        tempL = trav.mobTransferMob;
                        trav.mobTransferMob = index.mobTransferMob;
                        index.mobTransferMob = tempL;

                    }
                    index = index.next;
                }
                trav = trav.next;
            }
        }

        display();

    }

    //5.DELETE TRANSACTION
    public void deleteAtGivenPosition(int pos) {
        Node temp = null;
        Node trav = null;
        Node temp2 = null;
        trav = temp = head;
        count = 1;

        int count1 = 0;
        while (temp != null) {
            temp = temp.next;
            count1++;
        }

        if (pos > count1 || pos < 1) {
            System.out.println();
            System.out.print(String.format("%50s", "INVALID POSITION   "));
            System.out.println();
            transactionPage();
        } else if (pos == 1 && count1 == 1) {
            head = null;
            display();
        } else if (pos == 1) {
            if (head.next == null) {
                head = null;
                display();
            } else {
                head = head.next;
                head.prev = null;
                display();
            }

        } else {
            while (count < pos - 1) {
                trav = trav.next;
                count++;
            }

            if (count1 == (count + 1)) {
                trav.next = null;
                tail = trav;
                display();
            } else {
                temp = trav.next;
                trav.next = temp.next;
                temp2 = temp.next;
                temp2.prev = trav;
                temp = null;
                display();
            }
        }
    }

    //6.CLEAR HISTORY
    public void deleteTransactionHistory() {
        head = null;
        display();
    }

}