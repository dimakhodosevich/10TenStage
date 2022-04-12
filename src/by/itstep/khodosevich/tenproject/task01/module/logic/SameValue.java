package by.itstep.khodosevich.tenproject.task01.module.logic;

public final class SameValue {

    private SameValue(){

    }

    public static boolean checkTheSameValue(double number){

        int numberInt = (int)number;
        if(numberInt<10){
            throw new RuntimeException();
        }

        int last_number = numberInt%10;
        numberInt/=10;

        while(numberInt>0){
            int previous_number = numberInt%10;
            numberInt/=10;
            if(last_number!=previous_number){
                return false;
            }
            last_number = previous_number;
        }

        return true;
    }

}
