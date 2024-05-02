public class Des
{
    public static void main(String args[])
    {
        // declaring variables
        final byte[] bits = {1,1,0,1,0,0,1,1,0,0};
        final int[] p10 = {3,5,2,7,4,10,1,9,8,6};
        final int[] p8  = {6,3,7,4,8,5,10,9};
       
        byte[] bits10 = new byte[10];
        byte[] ls1 = new byte[10];
        byte[]  bits8 = new byte[8]; 
        
        // Arranging bits according to p10
        for(int i=0 ; i<p10.length;i++)
        {
            bits10[i] = bits[p10[i]-1];
        }

        //  Applying left shift 1
        for(int i=1 ; i<bits10.length/2;i++)
        {
            ls1[i-1] = bits10[i];
        }
        ls1[(bits10.length/2)-1] = bits10[0];
        for(int i=(bits10.length/2)+1 ; i<bits10.length;i++)
        {
            ls1[i-1] = bits10[i];
        }
        ls1[bits10.length-1] = bits8[(bits10.length/2 )+ 1];

        //  Arranging Bits according to p8. 10 Bits reduced to 8bit
        for(int i=0 ; i<p8.length;i++)
        {
            bits8[i] = ls1[p8[i]-1];
        }
       
        //  Printing Key1
        System.out.print("Key1: ");
        for(byte i : bits8)
        {
            System.out.print(i);
        }

    }
}