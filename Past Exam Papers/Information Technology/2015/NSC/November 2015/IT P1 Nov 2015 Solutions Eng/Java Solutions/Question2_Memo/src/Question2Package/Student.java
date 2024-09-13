
package Question2Package;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Student {

    private String name;
    private String regCode;
    private String expiryDate;
    private int sessionsCompleted;

    // Question 2.1.1
    private String determineExpDate(String regDate) {
        int year = Integer.parseInt(regDate.substring(0, 4));
        year = year + 2;

        String expDate = year + regDate.substring(4);
        return expDate;
    }

    // Question 2.1.2
    public Student(String name, String regCode, String regDate) {
        this.name = name;
        this.regCode = regCode;
        expiryDate = determineExpDate(regDate);
        sessionsCompleted = 0;
    }

    // Question 2.1.4
    public void increaseSessionsCompleted() {
        sessionsCompleted++;
    }

    // Question 2.1.3
    public void setSessionsCompleted(int counter) {
        sessionsCompleted = counter;
    }

    // Question 2.1.5
    public String evaluateProgress(int total) {
        double percent = (sessionsCompleted / (double) total) * 100;
        if (percent > 75) {
            return (name + " qualifies as an instructor");
        } else {
            return ("Progress: " + String.format("%-2.0f", percent) + "% completed");
        }
    }

    // Question 2.1.6
    public String toString() {
        return (name + "  [" + regCode + "]\n" + "Expiry Date: " + expiryDate + "\nCompleted sessions: " + sessionsCompleted);
    }
    
    // Supplied regCode
    
    public String getName() {
        return name;
    }

    public String getCode() {
        return regCode;
    }

}
