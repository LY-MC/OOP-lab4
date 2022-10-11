package com.utm.miscellaneous;

public class CageWithLake extends Cage {
    private int lakeWidth;
    private  int lakeLength;

    public CageWithLake(int ID, int width, int length, int lakeWidth, int lakeLength) {
        super(ID, width, length);
        this.lakeWidth = lakeWidth;
        this.lakeLength = lakeLength;
    }

    public int getLakeWidth() {
        return lakeWidth;
    }

    public void setLakeWidth(int lakeWidth) {
        this.lakeWidth = lakeWidth;
    }

    public int getLakeLength() {
        return lakeLength;
    }

    public void setLakeLength(int lakeLength) {
        this.lakeLength = lakeLength;
    }
}
