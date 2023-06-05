package com.javafx;

public class Stack2 {
    private Batas[] data;
    private int top;

    public Stack2(int ukuran){
        this.data = new Batas[4];
        top = -1;
    }

    public void push(int kiri, int kanan){
        if(this.top<this.data.length-1){
            this.data[++this.top] = new Batas(kiri, kanan);
        }else{
            System.err.println("Stack penuh");
        }
    }

    public boolean habis(){
        return this.top<0;
    }

    public Batas pop(){
        if(!this.habis()){
            return this.data[this.top--];
        }else{
            System.err.println("Stack kosong");
            return new Batas(0, 0);
        }
    }

    public void quickSort(){
        Stack2 tak = new Stack2(10);
        int i,j,pivot,temp;
        tak.push(0, this.top-1);
    }
}
