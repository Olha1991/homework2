public class Main {
    public static void main(String[] args) {
    // Exercise 1
        byte avocado = 2;
        int tomato = 6;
        short cucumber = 10;
        long potato = 18L;
        float porridgeWeight = 15.5f;
        double buckwheatWeight = 3.5;
        boolean heavyWeight = buckwheatWeight > 10;
        System.out.println(heavyWeight);
        double differenceCereal = porridgeWeight - buckwheatWeight;
        System.out.println("Total weight of vegetables " + avocado + tomato + cucumber + potato + " kg");
        System.out.println("Difference between cereals " + differenceCereal + " kg");

    // Exercise 2
        double boxer1Weight = 78.2;
        double boxer2Weight = 82.7;
        double weightOfBothBoxers = boxer1Weight + boxer2Weight;
        double differenceBetweenBoxers = boxer2Weight - boxer1Weight;
        System.out.println("Total weight of both boxers " + weightOfBothBoxers + " kg");
        System.out.println("Weight difference between boxers " + differenceBetweenBoxers + " kg");

    // Exercise 3
        int bananas = 5;
        int grBananas1 = 80;
        int bananas5 = bananas * grBananas1;
        int grMilk100 = 105;
        int milk200 = grMilk100 * 2;
        int iceCream = 2;
        int grOneIceCream = 100;
        int iceCream2 = iceCream * grOneIceCream;
        int egg = 4;
        int grOneEgg = 70;
        int eggs4 = egg * grOneEgg;
        int allProductsInGr = bananas5 + milk200 + iceCream2 + eggs4;
        System.out.println("Sports breakfast weight " + allProductsInGr + " gr");
        int grPerKg = 1000;
        float weightKg = allProductsInGr / (float) grPerKg;
        System.out.println("1090 gr = " + weightKg + " kg");

    // Exercise 4
        int kgWeight =7;
        int option1 = 250;
        int option2 = 500;
        int kgPerGr = 1000;
        int grWeight = kgWeight * kgPerGr;
        int dayInOption1 = grWeight / option1;
        System.out.println("In the first option you need " + dayInOption1 + " days");
        int dayInOption2 = grWeight / option2;
        System.out.println("In the second option you need " + dayInOption2 + " days");
        int dayOnAverage = (dayInOption1 + dayInOption2) / 2;
        System.out.println("On average you need " + dayOnAverage + " days");

    // Exercise 5
        int mashaHas = 67760;
        int denisHas =83690;
        int christinaHas = 76230;
        int masha10 = mashaHas * 10 / 100;
        System.out.println("10 % of Masha's current salary =" + masha10 +" rubles");
        int denis10 =denisHas * 10 / 100;
        System.out.println("10 % of Denis' current salary = " + denis10 + " rubles");
        int christina10 = christinaHas * 10 / 100;
        System.out.println("10 % of Christina's current salary = " + christina10 + " rubles");
        int newSalaryMasha = mashaHas + masha10;
        System.out.println("Now Masha receives " + newSalaryMasha + " rubles a month");
        int newSalaryDenis = denisHas + denis10;
        System.out.println("Now Denis receives " + "rubles a month");
        int newSalaryChristina = christinaHas + christina10;
        System.out.println("Now Christina receives " + newSalaryChristina + " rubles a month");

        int annualOldMasha = mashaHas * 12;
        int annualNewMasha = newSalaryMasha * 12;
        int differenceMasha = annualNewMasha - annualOldMasha;
        System.out.println("Masha's annual income increased by " + differenceMasha + " rubles");

        int annualOldDenis = denisHas * 12;
        int annualNewDenis = newSalaryDenis * 12;
        int differenceDenis = annualNewDenis - annualOldDenis;
        System.out.println("Denis' annual income increased by " + differenceDenis + " rubles");

        int annualOldChristina = christinaHas * 12;
        int annualNewChristina = newSalaryChristina * 12;
        int differenceChristina = annualNewChristina - annualOldChristina;
        System.out.println("Christina's annual income increased by " + differenceChristina + " rubles");
    }
}