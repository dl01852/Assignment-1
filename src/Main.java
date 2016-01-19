/**
 * Created by David on 1/18/2016.
 */
public class Main {


    public static void main(String[] args)
    {

        Computer desktop = new DesktopComputer(8,3.14, new Windows(),new Intel(),new Sapphire(),new MoboAsRock());
        Computer laptop = new Laptop(12,4.23, new Linux(), new Amd(), new GpuGigabyte(), new MoboGigabyte());

        System.out.println(desktop.peformDiagnostics());
        System.out.println(laptop.peformDiagnostics());

    }
}
