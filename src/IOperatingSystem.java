/**
 * Created by david-lewis on 1/15/2016.
 */
public interface IOperatingSystem {

    String OsType();
}

class Windows implements IOperatingSystem
{
    public String OsType()
    {
        return "Windows Operating System";
    }
}
class Linux implements IOperatingSystem
{
    public String OsType()
    {
        return "Linux Operating System";
    }
}
class Osx implements IOperatingSystem
{
    public String OsType()
    {
        return "MAC OSX";
    }
}

class Ios implements  IOperatingSystem
{
    public String OsType(){return "iOS";}
}
class Android implements IOperatingSystem
{
    public String OsType(){return "Android Operating System";}
}
