package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component


@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        if (isDivisibleBy(inputNumber,3) || inputNumber.toString().contains("3")){
            return "Gbsu" + inputNumber.toString().replace(inputNumber.toString(), "Gbsu");
        }


        if (isDivisibleBy(inputNumber,5) || inputNumber.toString().contains("5")){
            return "Ftb" + inputNumber.toString().replace("5", "Ftb");
        }



        if (inputNumber.toString().contains("7")){
            return "Lai";
        }

        return inputNumber.toString();
    }

    private fun isDivisibleBy(input: Int, i: Int): Boolean {
        return input % i == 0
    }


    fun getNumbers_all(input: Int): List<String>? {
        val sb: MutableList<String> = ArrayList()
        for (i in 1..input) {
            sb.add(this.convertNumber(i))
        }
        return sb
    }


}