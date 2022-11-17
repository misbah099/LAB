package lab;
//Question(1)
class CountryNotValidException extends Exception{
	CountryNotValidException(String str){
		super(str);
	}}
class EmployeeNameInvalidException extends Exception{
	EmployeeNameInvalidException(String str){
		super(str);
	}}
class TaxNotEligibleException extends Exception{
	TaxNotEligibleException(String str){
		super(str);
	}}
public class TaxCalculator {
	   String empName;
	  boolean isIndian;
	  double empSal;
	  double taxAmount;
	  public double calculateTax( String empName,
	  boolean isIndian,double empSal) throws Exception {
		    if(isIndian==false) {
			  throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
		  } else {
			  if(empName==null) {
				  throw new EmployeeNameInvalidException("The employee name cannot be empty");
			  }
			  else {
				  if(empSal >100000) {
					  taxAmount=empSal*8/100;
					  System.out.println("The Tax amount is "+taxAmount);
				  }
				  else if(empSal > 50000 && empSal <100000) {
					  taxAmount=empSal*6/100;
					  System.out.println("The Tax amount is "+taxAmount);

				  }
				  else if(empSal > 30000 && empSal <50000) {
					  taxAmount=empSal*5/100;
					  System.out.println("The Tax amount is "+taxAmount);

				  }
				  else if(empSal > 10000 && empSal <30000) {
					  taxAmount=empSal*5/100;
					  System.out.println("The Tax amount is "+taxAmount);

				  }
				  else {
					  throw new TaxNotEligibleException("The employee does not need to pay tax");
				  }  }  }
		  
		  return taxAmount;  }}


