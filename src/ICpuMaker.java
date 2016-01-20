/**
 * Created by david-lewis on 1/15/2016.
 */
public interface ICpuMaker {

    String CpuType();
}
class Intel implements ICpuMaker
{
    public String CpuType()
    {
        return "Intel CPU";
    }
}
class Amd implements ICpuMaker
{
    public String CpuType()
    {
        return "AMD CPU";
    }
}

class SnapDragon implements ICpuMaker
{
    public String CpuType(){return "SnapDragon CPU";}
}