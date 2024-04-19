package com.palindromos.palindromo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeRest {

    @GetMapping("/validar-palindromo/{word}")
    public String Palindrome(@PathVariable String word){
        if(isPalindrome(word)){
            return "La palabra " + word + " es un palindromo";
        }else{
            return "La palabra " + word + " NO es un palindromo";
        }
    }

    private boolean isPalindrome(String word){
        int length = word.length();
        for(int i =0 ; i < length/2; i++){
            if(word.charAt(i) != word.charAt(length - i -1)){
                return false;
            }
        }
        return true;
    }
}
