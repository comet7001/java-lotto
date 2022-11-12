package utils;

import statements.NormalStatements;

public class ConsoleUserOutput {

    public static void insertBlankLine(){
        System.out.println();
    }

    public static void askHowMuchWouldYouPayForLottos(){
        System.out.println(NormalStatements.ASK_MONEY_TO_BUY_LOTTO.done());
    }

    public static void tellNumberOfLottosUserBought(int theNumberOfLottos){
        System.out.println(theNumberOfLottos+NormalStatements.LET_USER_KNOW_THE_NUMBER_OF_TICKETS.done());
    }

    public static void askWinningNumbers(){
        System.out.println(NormalStatements.ASK_WINNING_NUMBERS.done());
    }

    public static void askBounsNumber(){
        System.out.println(NormalStatements.ASK_BONUS_NUMBER.done());
    }
}
