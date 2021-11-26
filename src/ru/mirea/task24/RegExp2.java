package ru.mirea.task24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp2 {
    //Я хотела попробовать разные способы, которые прописаны в справочном материале

    public static void main(String[] args) {
        Pattern pt=Pattern.compile("[a-z&&[def]]");//пересечение символов (символы d,e,f)
        Matcher m=pt.matcher("abc def how this program works");
        while(m.find())
        {
            System.out.print(m.group()+" ");
        }
//--------------------------------------------------------

        System.out.println();
        pt=Pattern.compile("[def]");
        m=pt.matcher("abc def how this program works defdefdfe");
        while(m.find())
        {
            System.out.print(m.group()+" ");
        }


//--------------------------------------------------------
        System.out.println();
        pt=Pattern.compile("[a-z && [^h-s]]");
        m=pt.matcher("abc def how this program works");
        while(m.find())
        {
            System.out.print(m.group()+" ");
        }


//--------------------------------------------------------
        System.out.println();
        pt=Pattern.compile("[a-z && ^[h-s]]");
        m=pt.matcher("bc def how this program works fdgdfg");
        while(m.find())
        {

            System.out.print(m.group()+" ");
        }

        System.out.println();
        pt=Pattern.compile("[a-z&&[^m-p]]");
        m=pt.matcher("bc def how this program works fdgdfg mpmpmp");
        while(m.find())
        {

            System.out.print(m.group()+" ");
        }

        //----------------------------Digits only---------------------------

        System.out.println();
        pt=Pattern.compile("\\d");
        m=pt.matcher("abc def how 1 33424 65676 this program works fdgdfg ascxf");
        while(m.find())
        {

            System.out.print(m.group()+" ");
        }

        //-----------------------------Non Digits only--------------------------

        System.out.println();
        pt=Pattern.compile("\\D");
        m=pt.matcher("abc def ghi  1 2 3 4 55 66 abc def how this program works fdgdfg ascxf 2332");
        while(m.find())
        {

            System.out.print(m.group()+" ");
        }
        //-----------------------------White staces only--------------------------

        System.out.println();
        pt=Pattern.compile("\\s");
        m=pt.matcher("abc def ghi  1 2 3 4 55 66 abc def how this program works fdgdfg ascxf 2332");
        while(m.find())
        {

            System.out.print(m.group()+" ");
        }

        //-----------------------------Non White staces only--------------------------

        System.out.println();
        pt=Pattern.compile("\\S");
        m=pt.matcher("abc def ghi  1 2 3 4 55 66 abc def how this program works fdgdfg ascxf 2332");
        while(m.find())
        {

            System.out.print(m.group()+" ");
        }
        //-----------------------------\w	A word character: [a-zA-Z_0-9]--------------------------

        System.out.println();
        pt=Pattern.compile("\\w");
        m=pt.matcher("abc def ghi  1 2 3 4 55 66 abc def how this program works fdgdfg ascxf 2332");
        while(m.find())
        {

            System.out.print(m.group()+" ");
        }
        //----------------------------\W	A non-word character: [^\w]--------------------------

        System.out.println();
        pt=Pattern.compile("\\W");
        m=pt.matcher("abc def ghi  1 2 3 4 55 66 abc def how this program works fdgdfg ascxf 2332");
        while(m.find())
        {

            System.out.print(m.group()+" ");
        }
//-----------------------\p{Lower}	A lower-case alphabetic character: [a-z]---------------

        System.out.println();
        pt=Pattern.compile("\\p{Lower}");
        m=pt.matcher("abc def ghi  1 2 3 4 55 66 jkl BACDEF mndo  21231 1g ABCDEhgdkgjhhjddqr stu vwx yz abbc ddef");
        while(m.find())
        {

            System.out.print(m.group()+" ");
        }
//-----------------------\p{Upper}	A lower-case alphabetic character: [a-z]---------------

        System.out.println();
        pt=Pattern.compile("\\p{Upper}");
        m=pt.matcher("abc def ghi  1 2 3 4 55 66 jkl BACDEF mndo  21231 1g ABCDEhgdkgjhhjddqr stu vwx yz abbc ddef");
        while(m.find())
        {

            System.out.print(m.group()+" ");
        }
//-------------------\p{ASCII}	All ASCII:[\x00-\x7F]---------------------------

        System.out.println("\n \\p{ASCII}	All ASCII:[\\x00-\\x7F]");
        pt=Pattern.compile("\\p{ASCII}");
        m=pt.matcher("abc ±±± def ghi  ~ ¥¥¥¥¥¥¥¥ ®®®®®® ™	™ ♦	♦	♦	♦		™	™	™	™	  1 2 3 4 55 66 †	†	†	†	 jkl BACDEF mndn £ ");
        while(m.find())
        {

            System.out.print(m.group()+" ");
        }
//-------------------------[^\x00-\x7F] means non ASCII characters---------------
        System.out.println("\n [^\\x00-\\x7F] means non ASCII characters");
        pt=Pattern.compile("[^\\x00-\\x7F]");
        m=pt.matcher("abc ±±± def ghi  ~ ¥¥¥¥¥¥¥¥ ®®®®®® ™™ ♦	♦♦♦™	™	™	™	 1 2 3 4 55 66 ††††	 jkl BACDEF mndn £ ");
        while(m.find())
        {

            System.out.print(m.group()+" ");
        }
    }
}
/*Выходные данные
d e f
d e f d e f d e f d f e
a b c   d e f   w   t   g a   w
    h o   h i s   p r o r m   o r k s
b c d e f h w t h i s r g r a w r k s f d g d f g
1 3 3 4 2 4 6 5 6 7 6
a b c   d e f   g h i                 a b c   d e f   h o w   t h i s   p r o g r a m   w o r k s   f d g d f g   a s c x f

a b c d e f g h i 1 2 3 4 5 5 6 6 a b c d e f h o w t h i s p r o g r a m w o r k s f d g d f g a s c x f 2 3 3 2
a b c d e f g h i 1 2 3 4 5 5 6 6 a b c d e f h o w t h i s p r o g r a m w o r k s f d g d f g a s c x f 2 3 3 2

a b c d e f g h i j k l m n d o g h g d k g j h h j d d q r s t u v w x y z a b b c d d e f
B A C D E F A B C D E
 \p{ASCII}	All ASCII:[\x00-\x7F]
a b c     d e f   g h i     ~       	   	 	 	 	 	 	 	 	 	     1   2   3   4   5 5   6 6   	 	 	 	   j k l   B A C D E F   m n d n
 [^\x00-\x7F] means non ASCII characters
± ± ± ¥ ¥ ¥ ¥ ¥ ¥ ¥ ¥ ® ® ® ® ® ® ™ ™ ♦ ♦ ♦ ♦ ™ ™ ™ ™ † † † † £
*/
