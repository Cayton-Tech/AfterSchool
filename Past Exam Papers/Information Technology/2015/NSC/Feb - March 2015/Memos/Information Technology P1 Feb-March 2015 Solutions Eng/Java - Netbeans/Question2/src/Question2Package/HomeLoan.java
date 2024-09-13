/*
 * Possible solution for Question 2
 */
package Question2Package;

import java.text.DecimalFormat;

public class HomeLoan {

    private String applicantName;
    private double disposableIncome;
    private double loanAmount;
    private int years;
    private double interestRate;
    DecimalFormat df = new DecimalFormat("R 0.00");

    public HomeLoan(String applicantName, double disposableIncome, double loanAmount) {
        this.applicantName = applicantName;
        this.disposableIncome = disposableIncome;
        this.loanAmount = loanAmount;
        this.years = 0;
        this.interestRate = 0;
    }

    public String getApplicantName() {
        return applicantName;
    }    
    
    public void setYears(int years) {
        this.years = years;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateInstalment() {
        double payment, rate;
        int result;
        rate = interestRate / 100.0;
        payment = (rate * loanAmount) / (1 - ((Math.pow((1 + rate), (years* -1)))));
        result = (int) (Math.round(payment / 12));
        return result;
    }

    public boolean isApproved() {
        boolean approved = true;
        if (loanAmount > 800000 && years < 25) {
            approved = false;
        }
        if (loanAmount <= 600000) {
            if (disposableIncome < (calculateInstalment() * 1.3)) {
                approved = false;
            }            
        }
        return approved;
    }

    public String toString() {
        String output = "Name of applicant: "+applicantName+"\nDisposable income: " + df.format(disposableIncome) +"\nLoan amount: " + df.format(loanAmount) + "\nNumber of years: " + years + "\nInterest rate: " + interestRate + "%";
        return output;
    }
}
