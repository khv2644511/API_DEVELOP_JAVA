package com.group.libraryapp.dto.calculator.request;

// DTO : Data Transfer Object
// 요청을 받을 때 사용하는 객체
// CalculatorController 진입점에 도달
public class CalculatorAddRequest {

    private final int number1;
    private final int number2;

    public CalculatorAddRequest(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }
}
