package QuestionTwo;

public class Customer {

    private int purchaseAmount;
    private int yearsBeenWithUs;

    public Customer() {
        this.purchaseAmount = 0;
        this.yearsBeenWithUs = 0;
    }

    public Customer(int purchaseAmount, int yearsBeenWithUs) {
        this.purchaseAmount = purchaseAmount;
        this.yearsBeenWithUs = yearsBeenWithUs;
    }
}
