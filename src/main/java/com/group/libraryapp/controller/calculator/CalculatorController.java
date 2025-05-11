package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // API 진입지점
public class CalculatorController {

    @GetMapping("/add") // GET /add
    public int addTwoNumbers(
            CalculatorAddRequest request
            // @RequestParam int number1, // 쿼리로 매개변수 받기
            // @RequestParam int number2
    ) {
        // return number1 + number2;
        return request.getNumber1() + request.getNumber2();
    }
}
