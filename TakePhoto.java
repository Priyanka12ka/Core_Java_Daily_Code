
 interface InnerTakePhoto {

    void TakePhotos();

}
interface MakeCall{

    void MakeCalls();
}
public class TakePhoto implements InnerTakePhoto,MakeCall{
    public void TakePhotos()
    {
        System.out.println("taking photos");
    }
    public void MakeCalls()
    {
         System.out.println("Making calls");
    }
    public static void main(String[] args) {
        TakePhoto t=new TakePhoto();
        t.MakeCalls();
        t.TakePhotos();
    }
    
}
