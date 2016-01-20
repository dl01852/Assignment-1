/**
 * Created by david-lewis on 1/15/2016.
 */
public interface IMotherBoard {

    String MotherBoardType();
}

class MoboAsus implements IMotherBoard
{
    public String MotherBoardType()
    {
        return "Asus Motherboard";
    }
}
class MoboGigabyte implements IMotherBoard
{
    public String MotherBoardType()
    {
        return "Gigabyte Motherboard";
    }

}
class MoboMsi implements IMotherBoard
{
    public String MotherBoardType()
    {
        return "Msi Motherboard";
    }
}
class MoboAsRock implements IMotherBoard
{
    public String MotherBoardType()
    {
        return "AsRock Motherboard";
    }
}

class MoboMini implements IMotherBoard
{
    public String MotherBoardType(){return "Phone/Tablet Motherboard";}
}



