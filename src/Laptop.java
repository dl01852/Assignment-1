/**
 * Created by David on 1/18/2016.
 */
public class Laptop extends Computer {

    public Laptop(int ram, double processorSpeed, IOperatingSystem os, ICpuMaker cpu, IGpuMaker gpu, IMotherBoard mobo )
    {
        super(ram,processorSpeed,os,cpu,gpu,mobo);
    }
    public Laptop()
    {

    }

    public String peformDiagnostics()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s%n", "Laptop's Diagnostics"));
        sb.append(super.peformDiagnostics());
        return sb.toString();
    }
}
