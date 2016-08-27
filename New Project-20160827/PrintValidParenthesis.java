public class ArrayGreaterSum{

public int SumArray(int a[],int b[])
{
    int lena = a.length();
    int lenb = b.length();
    int m = Math.max(lena,lenb);
    int sum1 = 0;
    int sum2 = 0;
    for(int i = 0; i<m ;i ++)
    {
        sum1 = sum1 + a[i];
        sum2 = sum2 + b[i];
        if(a[i] == b[i])
        {
            max = Math.max(sum1,sum2);
            sum1 = max;
            sum2 = max;
        }
    }
    return Math.max(sum1,sum2);
}

     public static void main(String []args){
         int a[] = {11,2,3,4,5,6,7};
         int b[] = {12,1,3,5,7,6,8};
        ArrayGreaterSum h = new ArrayGreaterSum();
        int result = h.SumArray(a,b);
        System.out.println(result);
     }
}
