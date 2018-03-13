import db.DBHelper;
import models.Folder;

public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("homework");
        DBHelper.save(folder1);
        Folder folder2 = new Folder("projects");
        DBHelper.save(folder2);




    }

}
