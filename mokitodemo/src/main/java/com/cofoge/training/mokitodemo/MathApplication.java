package com.cofoge.training.mokitodemo;



public class MathApplication {



private CalculaterService calcService;



public void setCalcService(CalculaterService calcService) {
this.calcService = calcService;
}

public double add(double input1, double input2){
return calcService.add(input1, input2);
}



public double subtract(double input1, double input2){
return calcService.subtract(input1, input2);
}



public double multiply(double input1, double input2){
return calcService.multiply(input1, input2);
}



public double divide(double input1, double input2){
return calcService.divide(input1, input2);
}

}