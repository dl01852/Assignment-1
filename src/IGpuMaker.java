/**
 * Created by david-lewis on 1/15/2016.
 */
public interface IGpuMaker {

    String GpuType();
}
class Evga implements IGpuMaker
{
    public String GpuType()
    {
        return "EVGA GPU";
    }
}
class Sapphire implements IGpuMaker
{
    public String GpuType()
    {
        return "Sapphire GPU";
    }
}
class GpuGigabyte implements IGpuMaker
{
    public String GpuType()
    {
        return "Gigabypte GPU";
    }
}
class GpuAsus implements IGpuMaker
{
    public String GpuType()
    {
        return "Asus GPU";
    }
}
class GpuOnboard implements IGpuMaker
{
   public String GpuType()
   {
       return "No GPU, Onboard vidoe";
   }
}


