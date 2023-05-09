package Thread;

class CountryNotValidException extends Exception 
{
    public CountryNotValidException(String message) 
    {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception 
{
    public EmployeeNameInvalidException(String message) 
    {
        super(message);
    }
}

class TaxNotEligibleException extends Exception 
{
    public TaxNotEligibleException(String message) 
    {
        super(message);
    }
}

class TaxCalculator 
{
    public static double calculateTax(String empName, boolean isIndian, double empSal) throws Exception 
    {
        if (!isIndian) 
        {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }
        
        if (empName == null || empName.isEmpty()) 
        {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }
        
        double taxAmount = 0.0;
        if (empSal > 100000 && isIndian) 
        {
            taxAmount = empSal * 8 / 100;
        } 
        
        else if (empSal >= 50000 && isIndian) 	// if (angle >= 90 && angle <= 180)
        {
            taxAmount = empSal * 6 / 100;
        } 
        
        else if (empSal >= 30000 && isIndian) 
        {
            taxAmount = empSal * 5 / 100;
        } 
        
        else if (empSal >= 10000 && isIndian) 
        {
            taxAmount = empSal * 4 / 100;
        }
        
        else 
        {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }
        return taxAmount;
    }
}

public class CalculatorSimulator 
{
	 public static void main(String[] args) 
	 {
	        try 
	        {
	            // Test Case 1
	            double tax1 = TaxCalculator.calculateTax("Ron", false, 34000);
	            System.out.println("Tax amount is: " + tax1);
	        } 
	        
	        catch (Exception e) 
	        {
	            System.out.println(e.getMessage());
	        }
	        
	        try 
	        {
	            // Test Case 2
	            double tax2 = TaxCalculator.calculateTax("Tim", true, 1000);
	            System.out.println("Tax amount is: " + tax2);
	        } 
	        
	        catch (Exception e) 
	        {
	            System.out.println(e.getMessage());
	        }
	        
	        try 
	        {
	            // Test Case 3
	            double tax3 = TaxCalculator.calculateTax("Jack", true, 55000);
	            System.out.println("Tax amount is: " + tax3);
	        } 
	        
	        catch (Exception e) 
	        {
	            System.out.println(e.getMessage());
	        }
	        
	        try 
	        {
	            // Test Case 4
	            double tax4 = TaxCalculator.calculateTax("", true, 30000);
	            System.out.println("Tax amount is: " + tax4);
	        } 
	        
	        catch (Exception e) 
	        {
	            System.out.println(e.getMessage());
	        }
	    }
	}

