public abstract class PhoneCameraApp {
    ShareMethod shareMethod;
    abstract void edit();
    public void take() {
        System.out.println("Photo Taken!");
    }
    public void save() {
        System.out.println("Photo Saved!");
    }
    public void share() {
        shareMethod.share();
    }
    public void setShareMethod(String method) {
        if (method == "Email")
            shareMethod = new ShareByEmail();
        else if (method == "Text")
            shareMethod = new ShareByText();
        else
            System.out.println("Please choose a sharing method: 'Email', 'Text'");
    }
    public void setShareMethod(ShareMethod shareMethod) {
        this.shareMethod = shareMethod;
    }
}
