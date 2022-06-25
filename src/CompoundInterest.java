
public class CompoundInterest {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    private  long principal;
    private float annualInterest;
    private byte years;
    private byte numberOfCompoundingPeriod;

    public CompoundInterest(long principal,float annualInterest,byte numberOfCompoundingPeriod,byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
        this.numberOfCompoundingPeriod = numberOfCompoundingPeriod;
    }
    public double calculateCompoundInterest(){
        Long P = getPrincipal();
        float r = getAnnualInterest() / 100;
        byte n = getNumberOfCompoundingPeriod();
        byte t = getYears();

        Double A = P * Math.pow(1 + r/n, n*t);
        System.out.println();

        return A;
    }
     public byte getYears() {
        return years;
    }
    private float getAnnualInterest() {return annualInterest;}
    private Long getPrincipal() {
        return principal;
    }
    private byte getNumberOfCompoundingPeriod() {return numberOfCompoundingPeriod;}
}
