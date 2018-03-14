import db.DBHelper;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Jeff Bridges", "thedude");
        DBHelper.save(owner1);

        Folder folder1 = new Folder("homework", owner1);
        DBHelper.save(folder1);
        Folder folder2 = new Folder("projects", owner1);
        DBHelper.save(folder2);

        File file1 = new File("day_01_homework", "java", 1056, folder1);
        DBHelper.save(file1);
        File file2 = new File("day_02_homework", "java", 876, folder1);
        DBHelper.save(file2);
        File file3 = new File("week_05_project_classes", "txt", 2876, folder2);
        DBHelper.save(file3);
        File file4 = new File("week_05_project_db", "java", 922, folder2);
        DBHelper.save(file4);

        DBHelper.delete(file4);

        File file5 = new File("week_06_project_db", "java", 667, folder2);
        DBHelper.save(file5);

        file5.setName("week_05_project_db");
        DBHelper.update(file5);

        List<File> allFiles = DBHelper.getAll(File.class);

        List<File> filesInFolder = DBHelper.getFilesInFolder(folder2);

        List<Owner> allOwners = DBHelper.getAll(Owner.class);

        List<Folder> allFolders = DBHelper.getAll(Folder.class);

        List<Folder> foldersForOwner = DBHelper.getFoldersForOwner(owner1);


    }

}
