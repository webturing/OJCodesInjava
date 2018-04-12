package aoj;

import java.util.Scanner;

public class P1145 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x[]=new long[26];
        while(sc.hasNext()){
            String a=sc.nextLine();
            char b[]=a.toCharArray();
            boolean f=false;
            for(int i = 0; i<b.length; i++){
                if(b[i]>='a'&&b[i]<='z'){
                    int j=(int)b[i]-97;
                    x[j]++;
                }
                if(b[i]=='#') f=true;
            }
            if(f) break;
        }
        for(int i=0; i<x.length; i++){
            char a=(char)(97+i);
            System.out.println(a+" "+x[i]);
        }
        sc.close();
    }
}