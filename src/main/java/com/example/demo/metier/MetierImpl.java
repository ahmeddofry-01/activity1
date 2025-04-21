package com.example.demo.metier;

import com.example.demo.dao.IDoa;

public class MetierImpl implements IMetier{
    private IDoa doa;

    public MetierImpl(IDoa doa) {
        this.doa = doa;
    }

    @Override
    public double calcul() {
        return doa.getData();
    }
}
