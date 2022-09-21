//Default Value by non-static

public class DefaultValue1 {
     short s;
     byte b;
     int i;
     long l;
     float f;
     double d;
     char c;
      boolean bo;
      public static void main(String[] args) {
        DefaultValue1 de=new DefaultValue1();
        System.out.println("Default Value");
        System.out.println("short "+de.s);
        System.out.println("byte "+de.b);
        System.out.println("int "+de.i);
        System.out.println("long "+de.l);
        System.out.println("float "+de.f);
        System.out.println("double "+de.d);
        System.out.println("char "+de.c);
        System.out.println("boolean "+de.bo);

      }
}
