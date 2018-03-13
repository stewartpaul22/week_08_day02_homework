import db.DBHelper;
import models.File;
import models.Folder;

public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("homework");
        DBHelper.save(folder1);
        Folder folder2 = new Folder("projects");
        DBHelper.save(folder2);

        File file1 = new File("day_01_homework", "java", 1056, folder1);
        DBHelper.save(file1);
        File file2 = new File("day_02_homework", "java", 876, folder1);
        DBHelper.save(file2);
        File file3 = new File("week_05_project_classes", "txt", 2876, folder2);
        DBHelper.save(file3);
        File file4 = new File("week_05_project_db", "java", 922, folder2);
        DBHelper.save(file4);




    }

}
