package lesson_4.exercises.TTT;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class TicTacToeField {
    private enum Field {
        X,
        O,
        Empty
    }

    private Field[][] TTTField = new Field[3][3];
    private boolean firstPlayer;

    public TicTacToeField(Field[][] TTTField, boolean game, boolean first) {
        this.TTTField = TTTField;
        this.firstPlayer = first;
    }

    public TicTacToeField() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                this.TTTField[i][j] = Field.Empty;
            }
        }
        this.firstPlayer = true;
    }

    public Field[][] getTTTField() {

        return TTTField;
    }

    public boolean setTTTField(int number1, int number2) {
        if (TTTField[number1][number2] == Field.Empty) {
            if (isFirstPlayer()) {
                this.TTTField[number1][number2] = Field.X;
            } else {
                this.TTTField[number1][number2] = Field.O;
            }
            return true;
        } else {
            return false;
        }
    }

    public void paint() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                switch (TTTField[i][j]) {
                    case Empty:
                        System.out.print("_  ");
                        break;
                    case O:
                        System.out.print("O  ");
                        break;
                    case X:
                        System.out.print("X  ");
                        break;
                }
                if (j == 2) {
                    System.out.println();
                }
            }
        }
    }

    public boolean firstPlayerWin() {
        boolean check = false;
        for (int i = 0; i <= 2; i++) {
            if ((TTTField[i][0] == Field.X) && (TTTField[i][1] == Field.X) && (TTTField[i][2] == Field.X)) {
                check = true;
                break;
            }
        }
        for (int i = 0; i <= 2; i++) {
            if ((TTTField[0][i] == Field.X) && (TTTField[1][i] == Field.X) && (TTTField[2][i] == Field.X)) {
                check = true;
                break;
            }
        }
        if ((TTTField[0][0] == Field.X) && (TTTField[1][1] == Field.X) && (TTTField[2][2] == Field.X)) {
            check = true;
        }
        if ((TTTField[2][0] == Field.X) && (TTTField[1][1] == Field.X) && (TTTField[0][2] == Field.X)) {
            check = true;
        }
        return check;
    }

    public boolean secondPlayerWin() {
        boolean check = false;
        for (int i = 0; i <= 2; i++) {
            if ((TTTField[i][0] == Field.O) && (TTTField[i][1] == Field.O) && (TTTField[i][2] == Field.O)) {
                check = true;
                break;
            }
        }
        for (int i = 0; i <= 2; i++) {
            if ((TTTField[0][i] == Field.O) && (TTTField[1][i] == Field.O) && (TTTField[2][i] == Field.O)) {
                check = true;
                break;
            }
        }
        if ((TTTField[0][0] == Field.O) && (TTTField[1][1] == Field.O) && (TTTField[2][2] == Field.O)) {
            check = true;
        }
        if ((TTTField[2][0] == Field.O) && (TTTField[1][1] == Field.O) && (TTTField[0][2] == Field.O)) {
            check = true;
        }
        return check;
    }

    public boolean isFirstPlayer() {
        return firstPlayer;
    }

    public void switchPlayer() {
        this.firstPlayer = !firstPlayer;
    }
}