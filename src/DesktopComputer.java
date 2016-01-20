/**
 * Created by david-lewis on 1/15/2016.
 */
public class DesktopComputer extends Computer {


    public DesktopComputer(int ram, double processSpeed, IOperatingSystem os, ICpuMaker cpu, IGpuMaker gpu, IMotherBoard motherBoard)
    {
        // fully loaded constructor passed to the base class.
        super(ram,processSpeed,os,cpu,gpu,motherBoard);
    }


    public DesktopComputer()
    {
        // default constructor
    }

    // functions for just a desktop computer.
    public void addRam(int amount)
    {
        if(amount > 0)
        {
            int newRam = getRam();
            newRam += amount;
            setRam(newRam);
        }
    }
    public void overClockCpu() // increase the clock speed by .2
    {
        double newProcessSpeed = getProcessorSpeed();
        newProcessSpeed += .2;
        setProcessorSpeed(newProcessSpeed);
    }
    public String peformDiagnostics()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s%n", "Desktop Computer's Diagnostics"));
        sb.append(super.peformDiagnostics());
        return sb.toString();
    }
}
