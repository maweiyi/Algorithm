package me.maweiyi;

public class Main {

    public String reverseString(String iniString) {
        // write code here
        int start = 0;
        int end = iniString.length()-1;
        char [] ch = iniString.toCharArray();

        return reverseString(ch,start,end);
    }
    public String reverseString(char [] ch, int start, int end){
        if(start < end)  {
            char tmp;
            tmp = ch[start];
            ch[start] = ch[end];
            ch[end] = tmp;
            reverseString(ch,start+1,end-1);
        }

        return new String(ch);

    }

    public static void main(String[] args) {
	// write your code here
    }
}
