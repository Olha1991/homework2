public class Main {
    public static void main(String[] args) {
    // Exercise 1
        byte avocado = 2;
        int tomato = 6;
        short cucumber = 10;
        long potato = 18L;
        float porridgWeight = 15.5f;
        double buckwheatWeight = 3.5;
        double differenceCereal = porridgWeight - buckwheatWeight;
        System.out.println("Total weight of vegetables " + avocado + tomato + cucumber + potato + " kg");
        System.out.println("Difference between cereals " + differenceCereal + " kg");

   // Exercise 2
        double boxer1Weight = 78.2;
        double boxer2Weight = 82.7;
        double weightOfBothBoxers = boxer1Weight + boxer2Weight;
        double differenceBetweenBoxers = boxer2Weight - boxer1Weight;
        System.out.println("Totai weight of both boxers " + weightOfBothBoxers + " kg");
        System.out.println("Weight difference between boxers " + differenceBetweenBoxers + " kg");

 // Exercise 3
        int bananas = 5;
        int grBananas1 = 80;
        int bananas5 = bananas * grBananas1;
        int milk = 200;
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
    }
}