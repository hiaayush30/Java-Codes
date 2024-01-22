interface camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){    //can also be overwritten in the implemented class
        greet();
        System.out.println("Recording video in 4K!");
    }
}
interface WiFi{
    String[] getNetworks();
    void connectToNetwork(String Network);

}
class MyCellphone{
    void callNumber(int number){
        System.out.println("Calling number: "+number);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartphone extends MyCellphone implements camera,WiFi{
    @Override
    public void takeSnap() {
        System.out.println("Taking a snapshot!");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording a video!");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList={"Harry01","Aayush30","Yo123"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String Network) {
        System.out.println("Connect to the network: "+Network);
    }
//    public void record4KVideo(){
//        System.out.println("Recordingin 4K!");
//    }
}
public class Lec56 {
    public static void main(String[] args) {
      MySmartphone obj=new MySmartphone();
      String[] networks=obj.getNetworks();
        for (String item:
             networks) {
            System.out.println(item);
        }
        obj.record4KVideo();

    }
}
