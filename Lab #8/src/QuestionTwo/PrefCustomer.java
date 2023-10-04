package QuestionTwo;

public class PrefCustomer extends Customer{

    private int purchaseAmount;
    private int yearsBeenWithUs;
    private double discountPercentage;
    public PrefCustomer(int purchaseAmount, int yearsBeenWithUs) {
        super(purchaseAmount, yearsBeenWithUs);
        this.purchaseAmount = purchaseAmount;
        this.yearsBeenWithUs = yearsBeenWithUs;
        this.discountPercentage = getDiscount(purchaseAmount, yearsBeenWithUs);
    }

    public double getDiscount(int purchaseAmount, int yearsBeenWithUs) {

        if (yearsBeenWithUs >= 3 && purchaseAmount >= 15000) {
            return 0.10;
        } else if (yearsBeenWithUs >= 2 && purchaseAmount >= 10000) {
            return 0.075;
        } else if (yearsBeenWithUs >= 1 && purchaseAmount >= 5000) {
            return 0.05;
        }

        return 0D;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public int getYearsBeenWithUs() {
        return yearsBeenWithUs;
    }

    public void setYearsBeenWithUs(int yearsBeenWithUs) {
        this.yearsBeenWithUs = yearsBeenWithUs;
    }
}
