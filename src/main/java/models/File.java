package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "files")
public class File {

    private int id;
    private String name;
    private String extension;
    private int fileSize;
    private Folder folder;

    public File() {
    }

    public File(String name, String extension, int fileSize, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.fileSize = fileSize;
        this.folder = folder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
