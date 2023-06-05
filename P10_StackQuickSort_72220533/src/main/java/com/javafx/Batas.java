package com.javafx;
public class Batas {
    private int kiri, kanan;

    public Batas(int kiri, int kanan){
        this.kiri = kiri;
        this.kanan = kanan;
    }

    public int getKiri() {
        return kiri;
    }

    public void setKiri(int kiri) {
        this.kiri = kiri;
    }

    public int getKanan() {
        return kanan;
    }

    public void setKanan(int kanan) {
        this.kanan = kanan;
    }
}
