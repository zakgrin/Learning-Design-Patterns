public abstract class PhoneCameraApp {
    ShareMethod shareMethod;
    abstract void edit();
    public void take() {
        System.out.println("Photo Taken!");
    }
    public void save() {
        System.out.println("Photo Saved!");
    }
    public void shareIt() {
        shareMethod.share();
    }
}
