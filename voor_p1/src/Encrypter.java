public class Encrypter {
    int encryptInput;

    public Encrypter(int userInput){
        encryptInput = userInput;
    }

    public String encrypt() {
        int[] encryptInt = inputArray();
        encrypt(encryptInt);
        return intArrayToString(encryptInt);
    }

    private int[] inputArray() {
        int[] encryptInt = new int[] {0,0,0,0};
        for(int i = 3; i != -1;i--) {				//input encryptInput into array, backwards
            int digit = encryptInput%10;
            encryptInput *= .1;
            encryptInt[i] = digit;
        }
        return encryptInt;
    }
    private void encrypt(int[] encryptInt) {
        int i;
        for(i=0;i<4;i++) {						//encryption algorithm
            encryptInt[i] +=7;
            encryptInt[i] %=10;
        }
        swapInt(encryptInt);                    //swap encrypted digits
    }
    private void swapInt(int[] a) {
        for(int i=0;i<2;i++) {
            int temp = a[i];
            a[i] = a[i+2];
            a[i+2] = temp;
        }
    }
    private String intArrayToString(int[] encryptInt) {
        int encryptedNum = encryptInt[0]*1000 + encryptInt[1]*100 + encryptInt[2]*10 + encryptInt[3];		//convert to single value return output
        String encryptOutput = Integer.toString(encryptedNum);
        switch(encryptOutput.length()) {                                                                //add leading zeroes
            case 4:
                break;
            case 3: encryptOutput = "0" + encryptOutput;
                break;
            case 2: encryptOutput = "0" + "0" + encryptOutput;
                break;
            case 1: encryptOutput = "0" + "0" + "0" + encryptOutput;
                break;
        }
        return encryptOutput;
    }
}
