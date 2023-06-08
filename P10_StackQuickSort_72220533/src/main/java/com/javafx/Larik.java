package com.javafx;

public class Larik {
    private int[] data;
    private int cacah;
    String proses = "";
    public Larik(int byk) {
        this.data = new int[byk];
        this.cacah = 0;
    }

    public void add(int bil) {
        if (this.cacah < this.data.length)
            this.data[cacah++] = bil;
        else
            System.out.println("Array sudah penuh!");
    }

    public String getArray() {
        String s = "";
        for (int idx = 0; idx < this.cacah; idx++)
            s += this.data[idx] + ", ";
        s = s.substring(0, s.length() - 2);
        return s;
    }

    public String quickSortRekursif() {
        String result = "Array Awal : " + getArray() + "\n";
        result += quickSortRek(0, this.cacah - 1);
        result += "Array Akhir : " + getArray();  
        return result;
    }

    public String quickSortRek(int kiri, int kanan) {
        int i, j, pivot, sementara;
        i = kiri;
        j = kanan;
        pivot = i;
        proses += "Batas kiri: " + i + ", Batas kanan: " + j + ", Pivot: " + pivot + "\n";
        while (i < j) {
            while (data[j] >= data[pivot] && j > pivot)
                j--; // bergerak dari kanan ke kiri
            proses += "j:" + j + ", Pivot:" + pivot + " <-tukar-> " + j + ", array: " + getArray() +  "\n";
            sementara = data[pivot];
            data[pivot] = data[j];
            data[j] = sementara;
            pivot = j; // Pivot pindah ke j
            while (data[i] < data[pivot] && i < pivot)
                i++; // bergerak dari kiri ke kanan
            proses += "i:" + i + ", Pivot:" + pivot + " <-tukar-> " + i + ", array: " + getArray() +  "\n\n";
            sementara = data[pivot];
            data[pivot] = data[i];
            data[i] = sementara;
            pivot = i; // Pivot pindah ke i
        }
        if (kiri < pivot - 1) // jika di kiri Pivot minimal ada 2 elemen
            quickSortRek(kiri, pivot - 1);
        if (kanan > pivot + 1) // jika di kanan Pivot minimal ada 2 elemen
            quickSortRek(pivot + 1, kanan);
        return proses;
    }
}
