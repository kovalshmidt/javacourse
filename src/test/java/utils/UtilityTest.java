package utils;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.rmi.CORBA.Util;

class UtilityTest {

    private static SoftAssertions softAssertions;


    @BeforeAll
    public static void setUp() {
        softAssertions = new SoftAssertions();
    }


    @Test
    public void testPalindrome() {
        softAssertions.assertThat(Utility.isPalindrome(44544)).isTrue();
        softAssertions.assertThat(Utility.isPalindrome(346252)).isFalse();
        softAssertions.assertThat(Utility.isPalindrome(1234321)).isTrue();
        softAssertions.assertThat(Utility.isPalindrome(666)).isTrue();
        softAssertions.assertThat(Utility.isPalindrome(985789)).isFalse();

    }

    @AfterAll
    public static void end(){
        softAssertions.assertAll();

    }
}
