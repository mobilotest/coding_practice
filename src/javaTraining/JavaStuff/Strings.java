package javaTraining.JavaStuff;

public class Strings {
    public static void main(String[] args) {
        String a = new String("Shyshal");
        a.concat("Myshal");
        System.out.println(a);
        System.out.println("- - - - - - - - - - - -");
        StringBuilder b = new StringBuilder("Shyshal");
        b.append("Myshal");
        System.out.println(b);
        System.out.println("- - - - - - - - - - - -");
        StringBuffer c = new StringBuffer("Shyshal");
        c.append("Myshal");
        System.out.println(c);
        System.out.println("- - - - - - - - - - - -");

        String d = new String("Shyshal");
        String e = new String("Shyshal");
        System.out.println(d == e);
        System.out.println(d.equals(e));
        System.out.println("- - - - - - - - - - - -");
        StringBuffer f = new StringBuffer("Shyshal");
        StringBuffer g = new StringBuffer("Shyshal");
        System.out.println(f == g);
        System.out.println(f.equals(g));
        System.out.println("- - - - - - - - - - - -");
        String s1 = new String("Spring");
        s1.concat("Fall");
        String s2 = s1.concat("Winter");
        s2.concat("Summer");
        System.out.println(s1);
        System.out.println(s2);
    }
}
