package com.greenfoxacademy.matrixchecker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Matrix {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int[][] matrix;
    private long id;
    private String date;

public Matrix() {


}

    public Matrix(int[][] matrix, long id, String date) {
        this.matrix = matrix;
        this.id = id;
        this.date = date;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
