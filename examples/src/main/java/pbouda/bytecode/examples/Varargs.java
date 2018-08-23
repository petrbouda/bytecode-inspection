package pbouda.bytecode.examples;

public class Varargs {

    public void methodA(int... numbers) {
        System.out.println(numbers);
    }

    public void methodB(int n1, int n2) {
        System.out.println(n1);
        System.out.println(n2);
    }

    public void methodC(int n1, int n2, int n3, int n4, int n5) {
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
    }

    public void methodD(byte n0, short n1, int n2, float n3, double n4, Object n5) {
        System.out.println(n0);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
    }

    public void methodE(int n11, int n12, int n13, int n14, int n15,
                        int n21, int n22, int n23, int n24, int n25,
                        int n31, int n32, int n33, int n34, int n35,
                        int n41, int n42, int n43, int n44, int n45,
                        int n51, int n52, int n53, int n54, int n55) {
        System.out.println(n11);
        System.out.println(n12);
        System.out.println(n13);
        System.out.println(n14);
        System.out.println(n15);
        System.out.println(n21);
        System.out.println(n22);
        System.out.println(n23);
        System.out.println(n24);
        System.out.println(n25);
        System.out.println(n31);
        System.out.println(n32);
    }
}
