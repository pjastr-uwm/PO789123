package pl.klasy;

class Car {


    public double getPojemonoscSilnika()
    {
        return this.pojemonoscSilnika;
    }

    public void setPojemonoscSilnika(double value)
    {
        this.pojemonoscSilnika = value;
    }

    public static Car create()
    {
        return new Car();
    }

    private Car(double pojemonoscSilnika)
    {
        this.pojemonoscSilnika = pojemonoscSilnika;
    }

    private Car()
    {
        this.pojemonoscSilnika = 4.2;
    }
    private double pojemonoscSilnika;
    private String marka;
}
