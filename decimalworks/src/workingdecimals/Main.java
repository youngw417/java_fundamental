package workingdecimals;
import java.math.BigDecimal;

public class Main
{
    static double aWholeNumber = 3;
    static double aRealNumber = 3.90;

    public static void main(String[] args)
    {
        double answerMult =  aRealNumber * aWholeNumber;
        double answerDiv = aRealNumber / aWholeNumber;
        double answerPlus = aRealNumber + aWholeNumber;
        double answerSub = aRealNumber - aWholeNumber;

        System.out.println("*** the Problem ***");
        System.out.println(aRealNumber + "*" + aWholeNumber + " = " + answerMult);
        System.out.println(aRealNumber + "/" + aWholeNumber + " = " + answerDiv);
        System.out.println(aRealNumber + "+" + aWholeNumber + " = " + answerPlus);
        System.out.println(aRealNumber + "-" + aWholeNumber + " = " + answerSub);

        System.out.println();
        System.out.println("*** Solution with Rounding ****");
        System.out.println("*** Must round each answer before using");

        double answerDivRound = Math.round(answerDiv *  100.0) / 100.0;
        double answerMultRound = Math.round(answerMult *  100.0) / 100.0;
        double answerPlusRound = Math.round(answerPlus *  100.0) / 100.0;
        double answerSubRound = Math.round(answerSub *  100.0) / 100.0;
        
        System.out.println(aRealNumber + " * " + aWholeNumber + " = Round to cents " + answerMultRound);
        System.out.println(aRealNumber + " / " + aWholeNumber + " = Round to cents " + answerDivRound);
        System.out.println(aRealNumber + " + " + aWholeNumber + " = Round to cents " + answerPlusRound);
        System.out.println(aRealNumber + " - " + aWholeNumber + " = Round to cents " + answerSubRound);

        System.out.println();
        System.out.println("*** Solution with Big Decimals ***");

        BigDecimal bigARealNumber = BigDecimal.valueOf(aRealNumber);
        BigDecimal bigAWholeNumber = BigDecimal.valueOf(aWholeNumber);

        BigDecimal bigAnswerMult = bigARealNumber.multiply(bigAWholeNumber);
        BigDecimal bigAnswerDiv = bigARealNumber.divide(bigAWholeNumber);
        BigDecimal bigAnswerPlus = bigARealNumber.add(bigAWholeNumber);
        BigDecimal bigAnswerSub = bigARealNumber.subtract(bigAWholeNumber);

        System.out.println(bigARealNumber + " * " + bigAWholeNumber + " = " + bigAnswerMult);
        System.out.println(bigARealNumber + " / " + bigAWholeNumber + " = " + bigAnswerDiv);
        System.out.println(bigARealNumber + " + " + bigAWholeNumber + " = " + bigAnswerPlus);
        System.out.println(bigARealNumber + " - " + bigAWholeNumber + " = " + bigAnswerSub);
}
}