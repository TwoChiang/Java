import java.util.Scanner;
public class Money {
    Scanner sc = new Scanner(System.in);
        char currencyType;
        double currencyAmount;

        public void Currency (Money InputCurr){
            InputCurr.currencyType = sc.next().charAt(0);
            switch (currencyType) {

                case 'A':
                    System.out.println("You Selected PHP");
                    break;

                case 'B':
                    System.out.println("You Selected USD");
                    break;

                case 'C':
                    System.out.println("You Selected EUR");
                    break;

                case 'D':
                    System.out.println("You Selected NTD");
                    break;

                case 'E':
                    System.out.println("You Selected CNY");
                    break;

                default:
                    System.out.println("Invalid Character");

                    }


        }
        public void CurrencyAmount (Money InputAmount){
            System.out.println("Input Amount");
            InputAmount.currencyAmount = sc.nextDouble();
            System.out.println("With the amount of");

        }

    public static void main(String[] args) {
            Money InputCurr =new Money();
            Money InputAmount = new Money();
            InputCurr.Currency(InputCurr);
            InputAmount.CurrencyAmount(InputAmount);
    }

}

