/**
 * Created by david-lewis on 1/15/2016.
 */
public abstract class Computer {

    private int ram;
    private double processorSpeed;
    protected IOperatingSystem operatingSystem; // Interface that's for OS's(Operating Systems)
    protected ICpuMaker cpu;
    protected IGpuMaker gpu;
    protected IMotherBoard motherBoard;

    // fully Loaded Constructor
    public Computer(int ram, double processorSpeed, IOperatingSystem os, ICpuMaker cpu, IGpuMaker gpu, IMotherBoard mobo)
    {
        this.ram = ram;
        this.processorSpeed = processorSpeed;
        this.operatingSystem = os;
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherBoard = mobo;
    }
    public Computer()
    {
        // default constructor
    }


    // getters
    public int getRam(){return ram;}
    public double getProcessorSpeed(){return processorSpeed;}
    public String getOperatingSystem(){return operatingSystem.OsType();}
    public String getCPUMaker(){return cpu.CpuType();}
    public String getGPUMaker(){return gpu.GpuType();}
    public String getMotherBoard(){return motherBoard.MotherBoardType();}


    // setters
    public void setRam(int ram){this.ram = ram;}
    public void setProcessorSpeed(double cpuSpeed){this.processorSpeed = cpuSpeed;}
    public void setOperatingSystem(IOperatingSystem operatingSystem){this.operatingSystem = operatingSystem;}
    public void setCpuType(ICpuMaker cpuType){this.cpu = cpuType;}
    public void setGpuType(IGpuMaker gpuType){this.gpu = gpuType;}
    public void setMotherBoard(IMotherBoard mobo){this.motherBoard = mobo;}


    public String peformDiagnostics()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("RAM: %sGB%nProcessor Speed: %.2fGHz%nMotherBoard: %s%n",ram,processorSpeed,motherBoard.MotherBoardType()));
        sb.append(String.format("Operating System: %s%nCPU: %s%nGPU: %s%n", operatingSystem.OsType(),cpu.CpuType(), gpu.GpuType()));
        return sb.toString();
    }
}
