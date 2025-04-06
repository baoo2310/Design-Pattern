package observer;

public class Video extends Subject {
    private String _title;
    private String _description;
    private String _fileName;

    public Video(){}

    public Video(String title, String description, String fileName) {
        this._title = title;
        this._description = description;
        this._fileName = fileName;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        this._title = title;
        VideoChange();
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        this._description = description;
        VideoChange();
    }

    public String getFileName() {
        return _fileName;
    }

    public void setFileName(String fileName) {
        this._fileName = fileName;
        VideoChange();
    }

    private void VideoChange(){
        NotifyOberserver(this, null);
    }

}
