import java.util.HashMap;

import java.util.*;

public class Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] Living_expenses = {606.33,104.455};
		double[] Recuring_bills = {137.09,115.67,211.44};
		double[] Savings_Debt = {0.0,0.0};
		double[] Gas_food_Haricuts = {100.0,150.0,160.0};
		
		HashMap<String,Double> expenses= new HashMap<>();
		
		expenses.put("Living Expenses", CalcAuto(Living_expenses));
		expenses.put("Recuring Bills",CalcAuto(Recuring_bills));
		expenses.put("Savings and Debt", CalcAuto(Savings_Debt));
		expenses.put("Gas, Food, and Haircuts", CalcAuto(Gas_food_Haricuts));
		
		budget(expenses); 
		
		
		
		
		
		

	}
	public static boolean isAnagram(String a,String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		char[] charsA = a.toCharArray();
		Arrays.sort(charsA,0,charsA.length);
		
		char[] charsB = b.toCharArray();
		Arrays.sort(charsB,0,charsB.length);
		
		if (charsA.length != charsB.length) {
			return false;
		}
		
		for(int i=0; i < charsA.length; ++i) {
			if(charsA[i] != charsB[i]) {
				return false;
			}
		}
		
		
		return true;
	}
	public static void countDown(int input) {
		int result;
		if (input > 0) {
			result = input * input - 1;
			System.out.println("Processing : " + result);
		}
		
	}
	public static double CalcAuto(double[] expenses) {
		double total_expenses = 0.0;
		double total_income = 3500.0;
		for (double x : expenses) {
			total_expenses += x;
			
		}
		double Input_per_check = total_expenses/2;
		return Input_per_check;
		
		
		
	}
	public static void budget(HashMap<String,Double> monthly) {
		double total_per_check = 0.0;
		double income_per_check = 1756.5;
		
		
		for( Map.Entry<String,Double> entry : monthly.entrySet() ){
			double percentage_perCheck = entry.getValue()/income_per_check;
		    System.out.printf(entry.getKey() + " : %.2f      Percentage of Income : %.2f%% \n",entry.getValue(),percentage_perCheck) ;
		    total_per_check += entry.getValue();
		}
		
		System.out.println();
		System.out.printf("Percentage of bills Per Check: %.2f%%\n",total_per_check/income_per_check);
		System.out.printf("Total Per Check : %.2f", total_per_check);
		System.out.println();
		System.out.printf("Disposable income :%.2f\n",income_per_check - total_per_check);
		
		
		
		double total_per_month = total_per_check * 2;
		
		System.out.printf("Monthly Bills and expenses : %.2f", total_per_month);
		
		
		
	}

}
