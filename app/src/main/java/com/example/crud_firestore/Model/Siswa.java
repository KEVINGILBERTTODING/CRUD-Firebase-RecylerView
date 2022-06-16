package com.example.crud_firestore.Model;

public class Siswa {
    String nim;
    String nama_siswa;
    String key;



    public Siswa() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNim() {

        return nim;
    }

    public void setNim(String nim) {

        this.nim = nim;
    }

    public String getNama_siswa() {

        return nama_siswa;
    }

    public void setNama_siswa(String nama_siswa) {

        this.nama_siswa = nama_siswa;
    }
}

