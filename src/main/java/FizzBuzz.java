public class FizzBuzz {

    public String[] fizzBuzz(int n) {
        String[] result = new String[n];
        for (int i = 1; i <= n; i++){
            result[i-1] = getStringRepresentation(i);
        }
        return result;
    }

    public String getStringRepresentation(int elementIndex) {
        String result ="";
        if(elementIndex%3==0){
            result += "Fizz";
        }
        if(elementIndex%5==0){
            result += "Buzz";
        }
        if(elementIndex%3!=0 && elementIndex%5!=0){
            result += elementIndex;
        }
        return result;
    }
}
