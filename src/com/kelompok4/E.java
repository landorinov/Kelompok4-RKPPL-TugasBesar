package com.kelompok4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by faerulsalamun on 5/25/16. 133040088
 */
public class E {

    private List dataList;

    /**
     *
     */
    public E() {
        System.out.println("Ctor di kelas " + getClass().getSimpleName());
    }

    /**
     *
     * @param n
     * @return
     */
    public boolean contains(String n) {
        return this.dataList.toString().contains(n);
    }

    /**
     *
     * @return
     */
    public List getDataList() {
        return dataList;
    }

    /**
     *
     * @param dataList
     */
    public void setDataList(List dataList) {
        this.dataList = dataList;
    }

    @Override
    public String toString() {
        return "toString kelas " + getClass().getSimpleName();
    }

}
