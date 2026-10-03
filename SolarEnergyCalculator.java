import java.util.Scanner;

     class SolarEnergyCalculator {
      double calculateTotalEnergy(double morningEnergy, double eveningEnergy)
   {
        return morningEnergy + eveningEnergy;
   }

    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter morning energy generated: ");
        double morningEnergy = obj.nextDouble();

        System.out.print("Enter evening energy generated: ");
        double eveningEnergy = obj.nextDouble();
        SolarEnergyCalculator sc = new SolarEnergyCalculator();
        double result = sc.calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Calculated total energy: " + result);
    }
}