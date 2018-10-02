package com.greenfoxacademy.rest.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

    @RestController
    public class ArrayController {

        @PostMapping("/arrays")
        public ArrayHandler handleArrays(@RequestBody(required = false) ArrayAndMethod arrayAndMethod) {
            ArrayHandler arrayHandler = new ArrayHandler();
            if (arrayAndMethod == null){
                arrayHandler.error = "Please provide what to do with the numbers!";
            } else if (arrayAndMethod.what.equals("sum")) {
                arrayHandler.result = arrayHandler.sum(arrayAndMethod.numbers);
            } else if (arrayAndMethod.what.equals("multiply")) {
                arrayHandler.result = arrayHandler.multiply(arrayAndMethod.numbers);
            } else if (arrayAndMethod.what.equals("double")) {
                arrayHandler.result = arrayHandler.doubler(arrayAndMethod.numbers);
            }
            return arrayHandler;
        }

        static class ArrayHandler {
            public int[] result;
            public String error;

            public ArrayHandler() {
            }

            public int[] sum(int[] numbers) {
                int sum = IntStream.of(numbers).sum();
                int[] sumResult = {sum};
                return sumResult;
            }

            public int[] multiply(int[] numbers) {
                int multi = 1;
                for (int n : numbers) {
                    multi *= n;
                }
                int multiResult[] = {multi};
                return multiResult;
            }

            public int[] doubler(int[] numbers) {
                int[] doubled = new int[numbers.length];
                for (int i = 0; i < doubled.length; i++) {
                    doubled[i] = numbers[i] * 2;
                }
                return doubled;
            }
        }

        static class ArrayAndMethod {
            public String what;
            public int[] numbers;
        }
    }
