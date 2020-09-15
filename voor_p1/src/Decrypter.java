public class Decrypter {
    int decryptInput;

    public Decrypter(int userInput) {        //constructor
        decryptInput = userInput;
    }

    public String decrypt() {
        int[] decryptInt = inputArray();
        decrypt(decryptInt);
        return intArrayToString(decryptInt);
    }

    private int[] inputArray() {
        int[] decryptInt = new int[]{0, 0, 0, 0};
        for (int i = 3; i != -1; i--) {                //input decryptInput into array, backwards
            int digit = decryptInput % 10;
            decryptInput *= .1;
            decryptInt[i] = digit;
        }
        return decryptInt;
    }

    private void decrypt(int[] decryptInt) {
        int i;
        for (i = 0; i < 4; i++) {                        //decryption algorithm
            decryptInt[i] += 3;     //this is only change from encrypt algorithm/class[ +=7--> +=3]
            decryptInt[i] %= 10;
        }
        swapInt(decryptInt);                    //swap decrypted digits
    }

    private void swapInt(int[] a) {
        for (int i = 0; i < 2; i++) {
            int temp = a[i];
            a[i] = a[i + 2];
            a[i + 2] = temp;
        }
    }

    private String intArrayToString(int[] decryptInt) {
        int decryptedNum;

        decryptedNum = decryptInt[0] * 1000 + decryptInt[1] * 100 + decryptInt[2] * 10 + decryptInt[3];        //convert to single value return output
        String decryptOutput = Integer.toString(decryptedNum);
        switch (decryptOutput.length()) {                                                                //add leading zeroes
            case 4:
                break;
            case 3:
                decryptOutput = "0" + decryptOutput;
                break;
            case 2:
                decryptOutput = "0" + "0" + decryptOutput;
                break;
            case 1:
                decryptOutput = "0" + "0" + "0" + decryptOutput;
                break;
        }
        return decryptOutput;
    }
}