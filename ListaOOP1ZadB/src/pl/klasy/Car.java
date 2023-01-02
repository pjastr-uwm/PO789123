package pl.klasy;

class Car {

    public Car(double pojemonoscSilnika)
    {
        this.pojemonoscSilnika = pojemonoscSilnika;
    }

    public Car()
    {
        this.pojemonoscSilnika = 4.2;
    }
    public double getPojemonoscSilnika()
    {
        return this.pojemonoscSilnika;
    }

    public void setPojemonoscSilnika(double value)
    {
        this.pojemonoscSilnika = value;
    }

    private double pojemonoscSilnika;
    private String marka;
}
