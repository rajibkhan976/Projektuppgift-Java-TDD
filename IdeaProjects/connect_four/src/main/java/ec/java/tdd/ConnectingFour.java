package ec.java.tdd;

import java.util.Scanner;

public class ConnectingFour {

    public String initConnectingFour() {
        String[] boardCellValArr = new String[42];
        StringBuilder rowBorder = new StringBuilder();
        rowBorder.append("+---+---+---+---+---+---+---+");
        System.out.println(rowBorder);
        StringBuilder rowOne = new StringBuilder();
        rowOne.append("|  1|  2|  3|  4|  5|  6|  7|");
        System.out.println(rowOne);
        System.out.println(rowBorder);
        StringBuilder rowTwo = new StringBuilder();
        rowTwo.append("|  8|  9| 10| 11| 12| 13| 14|");
        System.out.println(rowTwo);
        System.out.println(rowBorder);
        StringBuilder rowThree = new StringBuilder();
        rowThree.append("| 15| 16| 17| 18| 19| 20| 21|");
        System.out.println(rowThree);
        System.out.println(rowBorder);
        StringBuilder rowFour = new StringBuilder();
        rowFour.append("| 22| 23| 24| 25| 26| 27| 28|");
        System.out.println(rowFour);
        System.out.println(rowBorder);
        StringBuilder rowFive = new StringBuilder();
        rowFive.append("| 29| 30| 31| 32| 33| 34| 35|");
        System.out.println(rowFive);
        System.out.println(rowBorder);
        StringBuilder rowSix = new StringBuilder();
        rowSix.append("| 36| 37| 38| 39| 40| 41| 42|");
        System.out.println(rowSix);
        System.out.println(rowBorder);
        Scanner posInput = new Scanner(System.in);
        Scanner valInput = new Scanner(System.in);
        String result = "";
        while (checkHorizontalMatchForPlayerOne(boardCellValArr) &&
                checkHorizontalMatchForPlayerTwo(boardCellValArr) &&
                checkVerticalMatchForPlayerOne(boardCellValArr) &&
                checkVerticalMatchForPlayerTwo(boardCellValArr) &&
                checkDiagonalMatchForPlayerOne(boardCellValArr) &&
                checkDiagonalMatchForPlayerTwo(boardCellValArr) &&
                checkInverseDiagonalMatchForPlayerOne(boardCellValArr) &&
                checkInverseDiagonalMatchForPlayerTwo(boardCellValArr) &&
                checkIfDrawn(boardCellValArr)) {
            int position = 0;
            System.out.println("Please enter your desired position between 1 and 42,\n if any of them is not already occupied by O or X: ");
            position = posInput.nextInt();
            if (position >= 1 && position <= 42) {
                String value = "";
                System.out.println("Please enter O for yellow or X for red: ");
                value = valInput.nextLine();
                if (value.equalsIgnoreCase("o") || value.equalsIgnoreCase("x")) {
                    if (position  >= 1 && position <= 7) {
                        rowOne.replace(rowOne.indexOf(Integer.toString(position)), rowOne.indexOf(Integer.toString(position)) + 1, value.toUpperCase());
                        boardCellValArr[position - 1] = value.toUpperCase();
                    } else if (position  >= 8 && position <= 14) {
                        if (position  > 9) {
                            rowTwo.replace(rowTwo.indexOf(Integer.toString(position)), rowTwo.indexOf(Integer.toString(position)) + 2, value.toUpperCase().concat(" "));
                        } else {
                            rowTwo.replace(rowTwo.indexOf(Integer.toString(position)), rowTwo.indexOf(Integer.toString(position)) + 1, value.toUpperCase());
                        }
                        boardCellValArr[position - 1] = value.toUpperCase();
                    } else if (position  >= 15 && position <= 21) {
                        rowThree.replace(rowThree.indexOf(Integer.toString(position)), rowThree.indexOf(Integer.toString(position)) + 2, value.toUpperCase().concat(" "));
                        boardCellValArr[position - 1] = value.toUpperCase();
                    } else if (position  >= 22 && position <= 28) {
                        rowFour.replace(rowFour.indexOf(Integer.toString(position)), rowFour.indexOf(Integer.toString(position)) + 2, value.toUpperCase().concat(" "));
                        boardCellValArr[position - 1] = value.toUpperCase();
                    } else if (position  >= 29 && position <= 35) {
                        rowFive.replace(rowFive.indexOf(Integer.toString(position)), rowFive.indexOf(Integer.toString(position)) + 2, value.toUpperCase().concat(" "));
                        boardCellValArr[position - 1] = value.toUpperCase();
                    } else {
                        rowSix.replace(rowSix.indexOf(Integer.toString(position)), rowSix.indexOf(Integer.toString(position)) + 2, value.toUpperCase().concat(" "));
                        boardCellValArr[position - 1] = value.toUpperCase();
                    }
                    System.out.println(rowBorder);
                    System.out.println(rowOne);
                    System.out.println(rowBorder);
                    System.out.println(rowTwo);
                    System.out.println(rowBorder);
                    System.out.println(rowThree);
                    System.out.println(rowBorder);
                    System.out.println(rowFour);
                    System.out.println(rowBorder);
                    System.out.println(rowFive);
                    System.out.println(rowBorder);
                    System.out.println(rowSix);
                    System.out.println(rowBorder);
                    if (checkHorizontalMatchForPlayerOne(boardCellValArr) == false) {
                        result = "Player one with yellow pointer O won the match";
                    };
                    if (checkHorizontalMatchForPlayerTwo(boardCellValArr) == false) {
                        result = "Player two with red pointer X won the match";
                    };
                    if (checkVerticalMatchForPlayerOne(boardCellValArr) == false) {
                        result = "Player one with yellow pointer O won the match";
                    };
                    if (checkVerticalMatchForPlayerTwo(boardCellValArr) == false) {
                        result = "Player two with red pointer X won the match";
                    };
                    if (checkDiagonalMatchForPlayerOne(boardCellValArr) == false) {
                        result = "Player one with yellow pointer O won the match";
                    };
                    if (checkDiagonalMatchForPlayerTwo(boardCellValArr) == false) {
                        result = "Player two with red pointer X won the match";
                    };
                    if (checkInverseDiagonalMatchForPlayerOne(boardCellValArr) == false) {
                        System.out.println("Player one with yellow pointer O won the match");
                    };
                    if (checkInverseDiagonalMatchForPlayerTwo(boardCellValArr) == false) {
                        result = "Player two with red pointer X won the match";
                    };
                    if (checkIfDrawn(boardCellValArr) == false) {
                        result = "Match drawn";
                    };
                }
            }
        }
        return result;
    }

    public boolean checkHorizontalMatchForPlayerOne(String[] boardCellValArr) {
        boolean result = true;
        for(int i = 0; i < boardCellValArr.length &&
                (i + 1) < boardCellValArr.length &&
                (i + 2) < boardCellValArr.length &&
                (i + 3) < boardCellValArr.length; i++) {
            if (boardCellValArr[i] != null &&
                    boardCellValArr[i + 1] != null &&
                    boardCellValArr[i + 2] != null &&
                    boardCellValArr[i + 3] != null &&
                    i + 1 != 7 &&
                    i + 2 != 7 &&
                    i + 3 != 7 &&
                    i + 1 != 14 &&
                    i + 2 != 14 &&
                    i + 3 != 14 &&
                    i + 1 != 21 &&
                    i + 2 != 21 &&
                    i + 3 != 21 &&
                    i + 1 != 28 &&
                    i + 2 != 28 &&
                    i + 3 != 28 &&
                    i + 1 != 35 &&
                    i + 2 != 35 &&
                    i + 3 != 35) {
                if (boardCellValArr[i].contains("O") &&
                        boardCellValArr[i + 1].contains("O") &&
                        boardCellValArr[i + 2].contains("O") &&
                        boardCellValArr[i + 3].contains("O")) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean checkHorizontalMatchForPlayerTwo(String[] boardCellValArr) {
        boolean result = true;
        for(int i = 0; i < boardCellValArr.length &&
                (i + 1) < boardCellValArr.length &&
                (i + 2) < boardCellValArr.length &&
                (i + 3) < boardCellValArr.length; i++) {
            if (boardCellValArr[i] != null &&
                    boardCellValArr[i + 1] != null &&
                    boardCellValArr[i + 2] != null &&
                    boardCellValArr[i + 3] != null &&
                    i + 1 != 7 &&
                    i + 2 != 7 &&
                    i + 3 != 7 &&
                    i + 1 != 14 &&
                    i + 2 != 14 &&
                    i + 3 != 14 &&
                    i + 1 != 21 &&
                    i + 2 != 21 &&
                    i + 3 != 21 &&
                    i + 1 != 28 &&
                    i + 2 != 28 &&
                    i + 3 != 28 &&
                    i + 1 != 35 &&
                    i + 2 != 35 &&
                    i + 3 != 35) {
                if (boardCellValArr[i].contains("X") &&
                        boardCellValArr[i + 1].contains("X") &&
                        boardCellValArr[i + 2].contains("X") &&
                        boardCellValArr[i + 3].contains("X")) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean checkVerticalMatchForPlayerOne(String[] boardCellValArr) {
        boolean result = true;
        for (int i = 0; i < boardCellValArr.length &&
                (i + 7) < boardCellValArr.length &&
                (i + 14) < boardCellValArr.length &&
                (i + 21) < boardCellValArr.length; i++) {
            if (boardCellValArr[i] != null &&
                    boardCellValArr[i + 7] != null &&
                    boardCellValArr[i + 14] != null &&
                    boardCellValArr[i + 21] != null)
            {
                if (boardCellValArr[i].contains("O") &&
                        boardCellValArr[i + 7].contains("O") &&
                        boardCellValArr[i + 14].contains("O") &&
                        boardCellValArr[i + 21].contains("O")) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean checkVerticalMatchForPlayerTwo(String[] boardCellValArr) {
        boolean result = true;
        for (int i = 0; i < boardCellValArr.length &&
                (i + 7) < boardCellValArr.length &&
                (i + 14) < boardCellValArr.length &&
                (i + 21) < boardCellValArr.length; i++) {
            if (boardCellValArr[i] != null &&
                    boardCellValArr[i + 7] != null &&
                    boardCellValArr[i + 14] != null &&
                    boardCellValArr[i + 21] != null)
            {
                if (boardCellValArr[i].contains("X") &&
                        boardCellValArr[i + 7].contains("X") &&
                        boardCellValArr[i + 14].contains("X") &&
                        boardCellValArr[i + 21].contains("X")) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean checkDiagonalMatchForPlayerOne(String[] boardCellValArr) {
        boolean result = true;
        for (int i = 0; i < boardCellValArr.length &&
                (i + 8) < boardCellValArr.length &&
                (i + 16) < boardCellValArr.length &&
                (i + 24) < boardCellValArr.length; i++) {
            if (boardCellValArr[i] != null &&
                    boardCellValArr[i + 8] != null &&
                    boardCellValArr[i + 16] != null &&
                    boardCellValArr[i + 24] != null)
            {
                if (boardCellValArr[i].contains("O") &&
                        boardCellValArr[i + 8].contains("O") &&
                        boardCellValArr[i + 16].contains("O") &&
                        boardCellValArr[i + 24].contains("O")) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean checkDiagonalMatchForPlayerTwo(String[] boardCellValArr) {
        boolean result = true;
        for (int i = 0; i < boardCellValArr.length &&
                (i + 8) < boardCellValArr.length &&
                (i + 16) < boardCellValArr.length &&
                (i + 24) < boardCellValArr.length; i++) {
            if (boardCellValArr[i] != null &&
                    boardCellValArr[i + 8] != null &&
                    boardCellValArr[i + 16] != null &&
                    boardCellValArr[i + 24] != null)
            {
                if (boardCellValArr[i].contains("X") &&
                        boardCellValArr[i + 8].contains("X") &&
                        boardCellValArr[i + 16].contains("X") &&
                        boardCellValArr[i + 24].contains("X")) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean checkInverseDiagonalMatchForPlayerOne(String[] boardCellValArr) {
        boolean result = true;
        for (int i = 0; i < boardCellValArr.length &&
                (i + 6) < boardCellValArr.length &&
                (i + 12) < boardCellValArr.length &&
                (i + 18) < boardCellValArr.length; i++) {
            if (boardCellValArr[i] != null &&
                    boardCellValArr[i + 6] != null &&
                    boardCellValArr[i + 12] != null &&
                    boardCellValArr[i + 18] != null &&
                    i != 0 &&
                    i != 1 &&
                    i != 2 &&
                    i != 7 &&
                    i != 8 &&
                    i != 14 &&
                    i != 21 &&
                    i != 22 &&
                    i != 23 &&
                    i != 24)
            {
                if (boardCellValArr[i].contains("O") &&
                        boardCellValArr[i + 6].contains("O") &&
                        boardCellValArr[i + 12].contains("O") &&
                        boardCellValArr[i + 18].contains("O")) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean checkInverseDiagonalMatchForPlayerTwo(String[] boardCellValArr) {
        boolean result = true;
        for (int i = 0; i < boardCellValArr.length &&
                (i + 6) < boardCellValArr.length &&
                (i + 12) < boardCellValArr.length &&
                (i + 18) < boardCellValArr.length; i++) {
            if (boardCellValArr[i] != null &&
                    boardCellValArr[i + 6] != null &&
                    boardCellValArr[i + 12] != null &&
                    boardCellValArr[i + 18] != null &&
                    i != 0 &&
                    i != 1 &&
                    i != 2 &&
                    i != 7 &&
                    i != 8 &&
                    i != 14 &&
                    i != 21 &&
                    i != 22 &&
                    i != 23 &&
                    i != 24)
            {
                if (boardCellValArr[i].contains("X") &&
                        boardCellValArr[i + 6].contains("X") &&
                        boardCellValArr[i + 12].contains("X") &&
                        boardCellValArr[i + 18].contains("X")) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean checkIfDrawn(String[] boardCellValArr) {
        boolean result = false;
        for (int i = 0; i < boardCellValArr.length; i++) {
            if (boardCellValArr[i] == null) {
                result = true;
            }
        }
        return result;
    }
}
