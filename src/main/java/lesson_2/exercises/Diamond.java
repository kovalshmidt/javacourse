package lesson_2.exercises;


/**
 * Goal:
<<<<<<< HEAD
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
=======
 *         *
 *       * * *
 *     * * * * *
 *   * * * * * * *
 * * * * * * * * * *
 *   * * * * * * *
 *     * * * * *
 *       * * *
 *         *
>>>>>>> 8dca059... finished.resolves #22
 */
public class Diamond {
    public static void main(String[] args) {
        for (int y = 1; y <= 9; y++) {
<<<<<<< HEAD
            for (int x = 1; x <= 9; x++) {
                if ((((3 <= y) && (y <= 7)) && ((3 <= x) && (x <= 7))) || (((4 <= y) && (y <= 6)) &&
                        ((2 <= x) && (x <= 8))) || (((2 <= y) && (y <= 8)) && ((4 <= x) && (x <= 6))) || (x == 5) || (y == 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if (x == 9) {
=======
            for (int x = 1; x <= 9; x++){
                if ((((3<=y)&&(y<=7))&&((3<=x)&&(x<=7)))||(((4<=y)&&(y<=6))&&((2<=x)&&(x<=8)))||(((2<=y)&&(y<=8))&&((4<=x)&&(x<=6)))||(x == 5)||(y ==5)){
                System.out.print("* ");}else{
                    System.out.print("  ");
                }
                if (x == 9){
>>>>>>> 8dca059... finished.resolves #22
                    System.out.println();
                }
            }
        }
    }
}
