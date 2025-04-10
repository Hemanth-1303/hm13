package com.xworkz.processor;

import com.xworkz.processor.cpuprocessor.CpuProcessor;

public class ProcessorRunner {
    public static void main(String[] args) {
        CpuProcessor cpuProcessor = new CpuProcessor();
        cpuProcessor.brand();
        cpuProcessor.architecture();
        cpuProcessor.speed();

        Processor processor = new Processor();
        processor.brand();
        processor.architecture();
        processor.speed();
    }
}
