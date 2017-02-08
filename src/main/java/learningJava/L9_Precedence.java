package learningJava;

/**
 * Created by azmiks on 07/02/2017.
 */
public class L9_Precedence {
    public static void main(String[] args)
    {
        int sum = 32 - 8 + 16 * 2; // 16*2=32, +24=56
        System.out.println("Result 1: " + sum);

        sum = (32 -8 + 16) * 2; // 32-8+16=40, *2=80
        System.out.println("Result 2: " + sum);

        sum = (32 - (8 + 16)) * 2; // 32-24=8, *2=16
        System.out.println("Result 3: " + sum);
    }
}

/* Operations priority:
++ -- !
* / %
+ -
> >= < <=
== !=
&&
||
? :
= += -= *= /= %=
*/