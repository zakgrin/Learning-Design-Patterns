public class Main {
    public static void main(String[] args) {
        PhoneCameraApp basicCameraApp = new BasicCameraApp();
        basicCameraApp.take();
        basicCameraApp.save();
        basicCameraApp.edit();
        basicCameraApp.shareIt();

        PhoneCameraApp plusCameraApp = new PlusCameraApp();
        plusCameraApp.take();
        plusCameraApp.save();
        plusCameraApp.edit();
        plusCameraApp.shareIt();
    }
}
