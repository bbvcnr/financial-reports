public interface Payment {
    double calculateBankFee(double n);
}

class WalletPayment implements Payment{
    @Override
    public double calculateBankFee(double n) {return 0.0;}
}

class BankcardPayment implements Payment{
    @Override
    public double calculateBankFee(double n) {return (n*0.05);}
}

class VisaPayment implements Payment{
    @Override
    public double calculateBankFee(double n) {return (n*0.02);}
}

class MastercardPayment implements Payment{
    @Override
    public double calculateBankFee(double n) {return (n*0.03);}
}

class OtherPayment implements Payment{
    @Override
    public double calculateBankFee(double n) {return (n*0.1);}
}

class SpecificPayment{
    private final Payment payment;

    public SpecificPayment(Payment p) {
        payment = p;
    }

    public double getPaymentFee(double amount) {
        return payment.calculateBankFee(amount);
    }
}