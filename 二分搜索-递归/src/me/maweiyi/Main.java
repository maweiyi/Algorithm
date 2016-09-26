package me.maweiyi;

public class Main {

    public int BinSearch(int Array[],int low,int high,int key)
    {
        if (low<=high)
        {
            int mid = (low+high)/2;
            if(key == Array[mid])
                return mid;
            else if(key<Array[mid])
                //移动low和high
                return BinSearch(Array,low,mid-1,key);
            else if(key>Array[mid])
                return BinSearch(Array,mid+1,high,key);
        }

        return -1;

    }

    public static void main(String[] args) {
	// write your code here
    }
}
