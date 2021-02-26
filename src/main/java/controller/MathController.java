package controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import converters.ConverterValuesOperations;
import exeception.MathOperationException;
import math.SimpleMath;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {

		if (!ConverterValuesOperations.isNumeric(numberOne) || !ConverterValuesOperations.isNumeric(numberTwo)) {
			throw new MathOperationException("Informe um Valor Numérico!");
		}

		return math.sum(ConverterValuesOperations.converteToDouble(numberOne), ConverterValuesOperations.converteToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {

		if (!ConverterValuesOperations.isNumeric(numberOne) || !ConverterValuesOperations.isNumeric(numberTwo)) {
			throw new MathOperationException("Informe um Valor Numérico!");
		}

		return math.subtraction(ConverterValuesOperations.converteToDouble(numberOne), ConverterValuesOperations.converteToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {

		if (!ConverterValuesOperations.isNumeric(numberOne) || !ConverterValuesOperations.isNumeric(numberTwo)) {
			throw new MathOperationException("Informe um Valor Numérico!");
		}

		return math.multiplication(ConverterValuesOperations.converteToDouble(numberOne), ConverterValuesOperations.converteToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {

		if (!ConverterValuesOperations.isNumeric(numberOne) || !ConverterValuesOperations.isNumeric(numberTwo)) {
			throw new MathOperationException("Informe um Valor Numérico!");
		}

		return math.division(ConverterValuesOperations.converteToDouble(numberOne), ConverterValuesOperations.converteToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {

		if (!ConverterValuesOperations.isNumeric(numberOne) || !ConverterValuesOperations.isNumeric(numberTwo)) {
			throw new MathOperationException("Informe um Valor Numérico!");
		}

		return math.mean(ConverterValuesOperations.converteToDouble(numberOne), ConverterValuesOperations.converteToDouble(numberTwo));
		
	}
	
	@RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number)
			throws Exception {

		if (!ConverterValuesOperations.isNumeric(number)) {
			throw new MathOperationException("Informe um Valor Numérico!");
		}

		return math.squareRoot(ConverterValuesOperations.converteToDouble(number));
	}
	
	/*
	private Double converteToDouble(String strNumber) {
		if(strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	private boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	*/

}
