/**
 * Created by david-lewis on 1/15/2016.
 */
public class DesktopComputer extends Computer {


    public DesktopComputer(int ram, double processSpeed, IOperatingSystem os, ICpuMaker cpu, IGpuMaker gpu, IMotherBoard motherBoard)
    {
        super(ram,processSpeed,os,cpu,gpu,motherBoard);
    }

    public DesktopComputer()
    {

    }

    public String peformDiagnostics()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s%n", "Desktop Computer's Diagnostics"));
        sb.append(super.peformDiagnostics());
        return sb.toString();
    }
}
