package Labtest1;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Number till u want to find all odd number
		int Number = 20;
		Oddnumber(Number);

	}
	static void Oddnumber(int num){
		System.out.print("Odd numbers are : ");
        for (int number = 1; number <=num; number++) {
            if(number%2 != 0){
                System.out.print(number+" ");
            }
        }
	}
	}
