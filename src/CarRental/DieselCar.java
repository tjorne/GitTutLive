package CarRental;

public class DieselCar extends AFuelCar
{
    private String name;

    public DieselCar(String regNr, String make, String model, int doors, int kmPrLiter)
    {
        super(regNr, make, model, doors, kmPrLiter);
    }

    @Override
    public String toString()
    {
        return "DieselCar{" +
                "regNr='" + regNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                '}';
    }

    @Override
    String getFuelType()
    {
        return "Diesel";
    }
}
