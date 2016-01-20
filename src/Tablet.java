/**
 * Created by David on 1/19/2016.
 */
public class Tablet extends Computer {

    public Tablet(int ram, double processorSpeed, IOperatingSystem os, ICpuMaker cpu, IGpuMaker gpu, IMotherBoard mobo)
    {
        super(ram,processorSpeed,os,cpu,gpu,mobo);
    }

    public Tablet()
    {

    }

    public String peformDiagnostics()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s%n","Tablet's Diagnostics"));
        sb.append(super.peformDiagnostics());
        return sb.toString();
    }
}
