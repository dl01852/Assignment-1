/**
 * Created by David on 1/18/2016.
 */
public class Main {


    public static void main(String[] args)
    {

        Intel intel = new Intel();
        Evga evga = new Evga();
        MoboGigabyte mobo = new MoboGigabyte();
        Linux linux = new Linux();

        Computer desktop = new DesktopComputer(8,3.14, new Windows(),new Intel(),new Sapphire(),new MoboAsRock());
        Computer laptop = new Laptop(12,4.23, new Linux(), new Amd(), new GpuGigabyte(), new MoboGigabyte());
        Computer tablet = new Tablet(4,3.12,new Android(), new SnapDragon(), new GpuOnboard(), new MoboMini());


        Computer desktop2 = new DesktopComputer();
        desktop2.setProcessorSpeed(4.4);
        desktop2.setRam(16);
        desktop2.setCpuType(intel);
        desktop2.setGpuType(evga);
        desktop2.setMotherBoard(mobo);
        desktop2.setOperatingSystem(linux);


        System.out.println(desktop.peformDiagnostics());
        System.out.println(laptop.peformDiagnostics());
        System.out.println(tablet.peformDiagnostics());
        System.out.println(desktop2.peformDiagnostics());

    }
}
