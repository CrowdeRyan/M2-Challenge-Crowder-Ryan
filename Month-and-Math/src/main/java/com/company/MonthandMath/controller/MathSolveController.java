package com.company.MonthandMath.controller;

import com.company.MonthandMath.models.MathSolve;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class MathSolveController {

    @PostMapping(value = "/add")
    @ResponseStatus(value = HttpStatus.OK)
    public MathSolve add(@Valid @RequestBody MathSolve input){
        if((input.getOperand1() == null || input.getOperand2() == null)){
            throw new IllegalArgumentException("you must supply a number for both operands");
        }
        return new MathSolve(input.getOperand1(), input.getOperand2(), "add", input.getOperand1()+input.getOperand2());
    }

    @PostMapping(value = "/subtract")
    @ResponseStatus(value = HttpStatus.OK)
    public MathSolve subtract(@RequestBody @Valid MathSolve input) {
        if((input.getOperand1() == null || input.getOperand2() == null)){
            throw new IllegalArgumentException("you must supply a number for both operands");
        }

        return new MathSolve(input.getOperand1(), input.getOperand2(), "subtract", input.getOperand1() - input.getOperand2());
    }

    @PostMapping(value = "/multiply")
    @ResponseStatus(value = HttpStatus.OK)
    public MathSolve multiply(@RequestBody @Valid MathSolve input){
        if((input.getOperand1() == null || input.getOperand2() == null)){
            throw new IllegalArgumentException("you must supply a number for both operands");
        }

        return new MathSolve(input.getOperand1(), input.getOperand2(), "multiply", input.getOperand1() * input.getOperand2());
    }

    @PostMapping(value = "/divide")
    @ResponseStatus(value = HttpStatus.OK)
    public MathSolve divide(@RequestBody @Valid MathSolve input){
        if((input.getOperand1() == null || input.getOperand2() == null) || input.getOperand2() == 0){
            throw new IllegalArgumentException("you must supply a number for both operands and operand2 cannot be a zero");
        }

        return new MathSolve(input.getOperand1(), input.getOperand2(), "divide", input.getOperand1() / input.getOperand2());
    }
}
