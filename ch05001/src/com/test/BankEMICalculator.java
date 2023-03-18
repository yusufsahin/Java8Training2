package com.test;

public class BankEMICalculator {
    private String CustomerName;
    private String AccountNo;

    private double loanAmount;

    private  double monthlypayment;

    public BankEMICalculator() {
    }

    public BankEMICalculator(String customerName, String accountNo, double loanAmount, double monthlypayment) {
        CustomerName = customerName;
        AccountNo = accountNo;
        this.loanAmount = loanAmount;
        this.monthlypayment = monthlypayment;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlypayment() {
        return monthlypayment;
    }

    public void setMonthlypayment(double monthlypayment) {
        this.monthlypayment = monthlypayment;
    }

    public class EMICalculatorHelper{
        int loanTerm=60;
        double interestRate=0.9;

        double interestpermonth= interestRate/loanTerm;

        public double calcMonthlyPayment(double loanAmount)
        {
            double EMI= (loanAmount * interestpermonth) / ((1.0) - ((1.0) /
                    Math.pow(1.0 + interestpermonth, loanTerm)));
            return(Math.round(EMI));
        }


    }

}
