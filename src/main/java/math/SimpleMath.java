package math;

public class SimpleMath {
	
	public Double sum (Double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public Double subtraction (Double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public Double multiplication (Double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public Double division (Double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}
	
	public Double mean (Double firstNumber, double secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}
	
	public Double squareRoot (Double number) {
		return (Double) Math.sqrt(number);
	}

}
