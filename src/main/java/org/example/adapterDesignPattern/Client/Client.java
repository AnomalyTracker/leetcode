package org.example.leetcode.adapterDesignPattern.Client;

import org.example.leetcode.adapterDesignPattern.adaptee.WeightMachineImpl;
import org.example.leetcode.adapterDesignPattern.adaptor.WeightMachineAdaptor;
import org.example.leetcode.adapterDesignPattern.adaptor.WeightMachineAdaptorImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdaptor machineAdaptor = new WeightMachineAdaptorImpl(new WeightMachineImpl());
        int weight = machineAdaptor.getWeightInKg();
        System.out.println("weight of Client = " + weight);
    }
}
