package com.example.logis.model;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Scheduler {
    private int id;
    private int gerbong;
    private String keberangkatan;
    private String jamk;
    private String tujuan;
    private String jamt;
    private int harga;
    private int kapasitas;

    public Scheduler(int id, int gerbong, String keberangkatan, String jamk, String tujuan, String jamt, int harga, int kapasitas) {
        this.id = id;
        this.gerbong = gerbong;
        this.keberangkatan = keberangkatan;
        this.jamk = jamk;
        this.tujuan = tujuan;
        this.jamt = jamt;
        this.harga = harga;
        this.kapasitas = kapasitas;
    }

    public int getId() {
        return id;
    }

    public int getGerbong() {
        return gerbong;
    }

    public void setGerbong(int gerbong) {
        this.gerbong = gerbong;
    }

    public String getKeberangkatan() {
        return keberangkatan;
    }

    public void setKeberangkatan(String keberangkatan) {
        this.keberangkatan = keberangkatan;
    }

    public String getJamk() {
        return jamk;
    }

    public void setJamk(String jamk) {
        this.jamk = jamk;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getJamt() {
        return jamt;
    }

    public void setJamt(String jamt) {
        this.jamt = jamt;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}
