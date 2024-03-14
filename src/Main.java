import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String myName = "Daria";
        String mySurname = "Folomeeva";
        String myJob = "Tester";

        System.out.println(myName + '\n' + mySurname + '\n' + myJob);

        int mySurnameLength = mySurname.length();
        System.out.println(mySurnameLength);

        boolean firstStringIsEmpty = myName.isEmpty();
        System.out.println(firstStringIsEmpty);

        char letterNr3myJob = myJob.charAt(3);
        System.out.println(letterNr3myJob);

        boolean myNameAndMySurnameAreEqual =myName.equals(mySurname);
        System.out.println(myNameAndMySurnameAreEqual);

        String myFriensName = "DARIA";
        boolean myAndMyFriendsNamesAreEqual = myName.equalsIgnoreCase(myFriensName);
        System.out.println(myAndMyFriendsNamesAreEqual);

        String myAdress = "Russia, Penza, Lenina";
        boolean myAdressCountry = myAdress.startsWith("Russia");
        boolean myAdressCity = myAdress.contains("Penza");
        boolean myAdressStreet = myAdress.endsWith("Lenina");
        System.out.println(myAdressCountry);
        System.out.println(myAdressCity);
        System.out.println(myAdressStreet);

        String changedStreet = myAdress.replace('L','S');
        System.out.println(changedStreet);

        String smallLettersName = myName.toLowerCase();
        System.out.println(smallLettersName);

        int houseNumber = 22;
        String myFulladress = String.format("My full adress is: %s, house %d.", myAdress, houseNumber);
        System.out.println(myFulladress);

        byte byteHouseNumber = (byte)houseNumber;
        System.out.println(byteHouseNumber);

        byte r = 15;
        System.out.println(r);

        double d = 2.5;
        System.out.println(d);

        double c = 3.8;
        int resultDandC1 = (int)d + (int)c;
        int resultDandC2 = (int)(d+c);
        System.out.println(resultDandC1);
        System.out.println(resultDandC2);

        int a = 7;
        int b = 19;
        System.out.println(a+b);

        int e;
        e = a++;
        System.out.println(e);

        StringBuffer greeting = new StringBuffer("Привет!");
        greeting.append("Меня зовут ");
        greeting.append("Даша!");
        System.out.println(greeting);

        String yourName = "What is your name?";
        System.out.println(yourName);

        Scanner whatIsYourName = new Scanner(System.in);
        String userInput = whatIsYourName.nextLine();
        System.out.println("Hi," + userInput);
    }
}