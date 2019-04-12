package com.cr.build;

    public class Director {

        private Builder builder;

        public Director(Builder builder) {
            this.builder = builder;
        }

        public Computer construct(String cpu, String monitor){
            builder.buildCpu(cpu);
            builder.buildMonitor(monitor);
            return builder.buildComputer();
        }

    }
