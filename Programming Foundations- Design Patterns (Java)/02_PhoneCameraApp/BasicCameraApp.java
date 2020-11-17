public class BasicCameraApp extends PhoneCameraApp {

    public BasicCameraApp() {
        shareMethod = new ShareByEmail();
    }

    public void edit() {
        System.out.println("Basic Camera App Edit");
    }
}
