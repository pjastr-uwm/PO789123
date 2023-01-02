package pl.bank;

class RachunekBankowy {

    public RachunekBankowy(double saldo)
    {
        this.saldo=saldo;
    }

    public void obliczMiesieczneOdsetki()
    {
        this.saldo += (this.saldo * rocznaStopaProcentowa) / 12;
    }

    public static void setRocznaStopaProcentowa(double nowa)
    {
        rocznaStopaProcentowa = nowa;
    }

    public double getSaldo()
    {
        return this.saldo;
    }
    private double saldo;
    private static double rocznaStopaProcentowa;
}
