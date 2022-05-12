package com.company.MonthandMath.controller;

import com.company.MonthandMath.models.Month;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class MonthController {

    @GetMapping(value = "/month/{num}")
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonth(@PathVariable String num){

        Month month = new Month();
        month.setNum(num);
        switch (num) {
            case "1":
                month.setName("January");
                return month;
            case "2":
                month.setName("February");
                return month;
            case "3":
                month.setName("March");
                return month;
            case "4":
                month.setName("April");
                return month;
            case "5":
                month.setName("May");
                return month;
            case "6":
                month.setName("June");
                return month;
            case "7":
                month.setName("July");
                return month;
            case "8":
                month.setName("August");
                return month;
            case "9":
                month.setName("September");
                return month;
            case "10":
                month.setName("October");
                return month;
            case "11":
                month.setName("November");
                return month;
            case "12":
                month.setName("December");
                return month;
            default:
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Please enter a Number between 1 and 12.");
        }
    }

    @GetMapping(value = "/randomMonth")
    @ResponseStatus(value = HttpStatus.OK)
    public Month getRandomMonth(){
        int num = (int) Math.floor(Math.random() * 12) +1;

        Month month = new Month();
        switch (num) {
            case 1:
                month.setNum("1");
                month.setName("January");
                return month;
            case 2:
                month.setNum("2");
                month.setName("February");
                return month;
            case 3:
                month.setNum("3");
                month.setName("March");
                return month;
            case 4:
                month.setNum("4");
                month.setName("April");
                return month;
            case 5:
                month.setNum("5");
                month.setName("May");
                return month;
            case 6:
                month.setNum("6");
                month.setName("June");
                return month;
            case 7:
                month.setNum("7");
                month.setName("July");
                return month;
            case 8:
                month.setNum("8");
                month.setName("August");
                return month;
            case 9:
                month.setNum("9");
                month.setName("September");
                return month;
            case 10:
                month.setNum("10");
                month.setName("October");
                return month;
            case 11:
                month.setNum("11");
                month.setName("November");
                return month;
            case 12:
                month.setNum("12");
                month.setName("December");
                return month;
            default:
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Please Select a number between 1 and 12");
        }

    }
}
