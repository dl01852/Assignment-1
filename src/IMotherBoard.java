/**
 * Created by david-lewis on 1/15/2016.
 */
public interface IMotherBoard {

    String MotherBoard();
}

class MoboAsus implements IMotherBoard
{
    public String MotherBoard()
    {
        return "Asus Motherboard";
    }
}
class MoboGigabyte implements IMotherBoard
{
    public String MotherBoard()
    {
        return "Gigabyte Motherboard";
    }

}
class MoboMsi implements IMotherBoard
{
    public String MotherBoard()
    {
        return "Msi Motherboard";
    }
}
class MoboAsRock implements IMotherBoard
{
    public String MotherBoard()
    {
        return "AsRock Motherboard";
    }
}



