package com.company.MonthandMath.models;


import javax.validation.constraints.NotNull;
import java.util.Objects;

public class MathSolve {

    @NotNull(message = "1st Number cannot be Null,")
    private Integer operand1;
    @NotNull(message = "2nd Number cannot be Null.")
    private Integer operand2;
    private String operation;
    private int solution;


    public MathSolve(Integer operand1, Integer operand2, String operation, int solution) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.solution = solution;
    }

    public MathSolve() {

    }

    public Integer getOperand1() {
        return operand1;
    }

    public void setOperand1(Integer operand1) {
        this.operand1 = operand1;
    }

    public Integer getOperand2() {
        return operand2;
    }

    public void setOperand2(Integer operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getSolution() {
        return solution;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathSolve mathSolve = (MathSolve) o;
        return solution == mathSolve.solution && Objects.equals(operand1, mathSolve.operand1) && Objects.equals(operand2, mathSolve.operand2) && Objects.equals(operation, mathSolve.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, operation, solution);
    }

    @Override
    public String toString() {
        return "MathSolve{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", operation='" + operation + '\'' +
                ", solution=" + solution +
                '}';
    }

}
