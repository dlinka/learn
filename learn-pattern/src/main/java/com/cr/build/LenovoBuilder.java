package com.cr.build;

public class LenovoBuilder implements Builder {

    private Computer computer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buildMonitor(String monitor) {
        computer.setMonitor(monitor);
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }

}
