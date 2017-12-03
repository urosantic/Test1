package com.example.admin.test1;

/**
 * Created by Admin on 12/1/2017.
 */

public class CodingTest1 {
    StringBuilder result = new StringBuilder();

    public static void main(String[] args) {

        int[] arr = {3,5,3,4,3,5,1,2,3,2};

        CodingTest1 codingTest1 = new CodingTest1();
        int num = codingTest1.mostOccured(arr);
        System.out.println(num);

        CodingTest1 codingTest2 = new CodingTest1();
        System.out.println(codingTest2.isAmstrongNum(157));
        System.out.println(codingTest2.isAmstrongNum(153));

        CodingTest1 codingTest3 = new CodingTest1();
        System.out.println(codingTest3.encodeString("abc12ab"));
        System.out.println(codingTest3.encodeString("loop"));
        System.out.println(codingTest3.encodeString("zxwa"));

        CodingTest1 codingTest4 = new CodingTest1();
        System.out.println(codingTest4.letterCount("Hello There! Apple"));
    }

    public int mostOccured(int[] array) {
        int[] temp = new int[array.length];

        for (int i =0; i < array.length; i++)   {
            temp[array[i]]++;
        }

        int maxOcc = temp[0];
        boolean state = true;
        for (int i = 1; i < temp.length;i++)    {
            if (maxOcc < temp[i]) {
                maxOcc = i;
                state = false;
            }
        }
        if (state) {
            maxOcc = 0;
        }

        return maxOcc;
    }


    public boolean isAmstrongNum(int num)   {
        String numString = Integer.toString(num);
        double newNum = (double) num;

        double[] arrDoubles = new double[numString.length()];

        for (int i = 0;i<arrDoubles.length;i++)    {
            String s = String.valueOf(numString.charAt(i));
            arrDoubles[i]= Double.parseDouble(s);
        }

        double sum =0;
        for(int i =0; i <arrDoubles.length; i++) {

            sum += Math.pow(arrDoubles[i],3);
        }

        if(sum == newNum)   {
            return true;
        }
        return false;
    }

    public String encodeString (String string) {
        String newString = "";
        for (int i =0; i < string.length();i++) {
            int num = string.charAt(i);
            if (num>=97 && num<=122) {
                num = 122 - (num - 97);
            }
            char c = (char) num;
            newString+= String.valueOf(c);
        }
        return newString;
    }

    public String letterCount(String string) {
        String temp = string.toLowerCase();

        int[] arr = new int[25];
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < temp.length();i++)  {
            int num = temp.charAt(i);

            if (num >= 97 && num <=122) {
                num = num - 97;
                arr[num]++;
            }
        }
        result.append("{ \n");
        for (int i = 0; i < arr.length; i++)    {
            result.append("    " + String.valueOf(alphabet[i]) + ": " + arr[i] + "\n");
        }
        result.append("}");

        return result.toString();
    }
}
