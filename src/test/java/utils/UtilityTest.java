package utils;


import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class UtilityTest {

    private static SoftAssertions softAssertions;

    @BeforeAll
    public static void setUp() {
        softAssertions = new SoftAssertions();
    }


    @Test
    public void testPalindrome() {
        softAssertions.assertThat(Utility.Boolean_Tests.isPalindrome(44544)).isTrue();
        softAssertions.assertThat(Utility.Boolean_Tests.isPalindrome(346252)).isTrue();
        softAssertions.assertThat(Utility.Boolean_Tests.isPalindrome(1234321)).isTrue();
        softAssertions.assertThat(Utility.Boolean_Tests.isPalindrome(666)).isTrue();
        softAssertions.assertThat(Utility.Boolean_Tests.isPalindrome(985789)).isTrue();
    }

    @Test
    public void testMultiple() {
        softAssertions.assertThat(Utility.Boolean_Tests.isMultiple(3, 6)).isTrue();
        softAssertions.assertThat(Utility.Boolean_Tests.isMultiple(2, 68)).isTrue();
        softAssertions.assertThat(Utility.Boolean_Tests.isMultiple(3, 11)).isFalse();
        softAssertions.assertThat(Utility.Boolean_Tests.isMultiple(5, 115)).isTrue();
        softAssertions.assertThat(Utility.Boolean_Tests.isMultiple(4, 17)).isFalse();
    }

    @Test
    public void  testOddEven(){
        softAssertions.assertThat(Utility.Boolean_Tests.oddOrEven(47)).isFalse();
        softAssertions.assertThat(Utility.Boolean_Tests.oddOrEven(83434)).isTrue();
        softAssertions.assertThat(Utility.Boolean_Tests.oddOrEven(0)).isTrue();
        softAssertions.assertThat(Utility.Boolean_Tests.oddOrEven(94791)).isFalse();
        softAssertions.assertThat(Utility.Boolean_Tests.oddOrEven(412)).isTrue();
    }
    @Test
    public void testDecryptEncrypt(){
        softAssertions.assertThat(Utility.Cryptography.encrypt(1234)).isEqualTo(189);
        softAssertions.assertThat(Utility.Cryptography.decrypt(189)).isEqualTo(1234);
    }
    @Test
    public void testQuotientRemainderDigits(){
        softAssertions.assertThat(Utility.QuotientsAndDigits.Quotient(259,23)).isEqualTo(11);
        softAssertions.assertThat(Utility.QuotientsAndDigits.Remainder(259,23)).isEqualTo(6);
        softAssertions.assertThat(Utility.QuotientsAndDigits.Digits(4562)).isEqualTo("4  5  6  2");
    }

    @AfterAll
    public static void end() {
        softAssertions.assertAll();

    }
}
