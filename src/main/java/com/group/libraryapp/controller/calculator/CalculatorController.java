package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController // API 진입지점
public class CalculatorController {

    @GetMapping("/add") // GET /add
    public int addTwoNumbers(
            CalculatorAddRequest request // 객체로 매개변수 받기
            // @RequestParam int number1, // 쿼리로 매개변수 받기
            // @RequestParam int number2
    ) {
        // return number1 + number2;
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply")
    public int multiplyTwoNumbers(
        @RequestBody CalculatorMultiplyRequest request)  
        {
        return request.getNumber1()*request.getNumber2();
    }
    
}
