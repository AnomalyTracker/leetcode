package org.example.leetcode.adapterDesignPattern.adaptor;

import org.example.leetcode.adapterDesignPattern.adaptee.WeightMachine;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor{


    //has-a relationship
    WeightMachine weightMachine;

    public WeightMachineAdaptorImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public int getWeightInKg() {
        int weightInPounds = weightMachine.getWeightInPounds();
        int weightInKg = (int) (weightInPounds*0.45);
        return weightInKg;
    }
}
