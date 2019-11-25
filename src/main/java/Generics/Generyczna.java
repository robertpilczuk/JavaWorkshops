package Generics;

public  class Generyczna <A, B> {
        private A a;
        private B b;

    public Generyczna(A a, B b){
        this.a = a;
        this.b = b;
    }
    public void wypiszAiB(){
        System.out.println("a = " + a + " b = " + b);
    }
}

