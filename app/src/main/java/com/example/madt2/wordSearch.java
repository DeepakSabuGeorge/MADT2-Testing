package com.example.madt2;

public class wordSearch {
    public static int getLen(String text)
    {
        return text.length();
    }
    public static int wordLen(String text)
    {
        int wordctr=1;
        int len=text.length();
        char ch[]=new char[text.length()];
        for(int i=0;i<len;i++)
        {
            ch[i]=text.charAt(i);
        }
        int w1=0;
        for(int i=0;i<len;i++)
        {
            if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z')
            {
                w1++;
            }
            else
            {
                if(w1>0)
                {
                    wordctr++;
                }
                w1=0;
            }
        }
        return wordctr;
    }
}
