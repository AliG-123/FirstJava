package com.sparta;

import com.sparta.sparta.Program;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
//    @Test
//    @DisplayName("My first test")
//    public void firstTest(){
//        Assertions.assertTrue(5 == 4);
//    }

    @Test
    @DisplayName("Given a time of 21, greeting return Good Evening")
    public void given21_Greeting_ReturnsGoodEvening(){
        int time = 21;
        String expectedGreeting = "Good Evening";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);

    }
    @Test
    @DisplayName("Given a time of 12, greeting return Good Morning")
    public void given12_Greeting_ReturnsGoodMorning(){

        int time = 12;
        String expectedGreeting = "Good Morning";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);

    }
    @ParameterizedTest
    @ValueSource(ints = {5,8,12})
    @DisplayName("Given a time between 5 and 12, greeting returns good morning")
    public void GivenTimeBetween5And12_Greeting_ReturnsGoodMorning(int time){
        String expectedGreeting = "Good Morning";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {13,15,18})
    @DisplayName("Given a time between 13 and 18, greeting returns good afternoon")
    public void GivenTimeBetween13And18_Greeting_ReturnsGoodEvening(int time){
        String expectedGreeting = "Good Afternoon";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {0,2,4})
    @DisplayName("Given a time between 0 and 4, greeting returns it's very late")
    public void GivenTimeBetween0And4_Greeting_ReturnsItsVeryLate(int time){
        String expectedGreeting = "It's very late";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {19,21,23})
    @DisplayName("Given a time between 19 and 23, greeting returns good evening")
    public void GivenTimeBetween19And23_Greeting_ReturnsGoodEvening(int time){
        String expectedGreeting = "Good Evening";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {24,36,-1})
    @DisplayName("Given a time not between 0 and 23, greeting returns invalid time")
    public void GivenTimeNotBetween0And23_Greeting_ReturnsInvalidTime(int time){
        String expectedGreeting = "Invalid time";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }


    }