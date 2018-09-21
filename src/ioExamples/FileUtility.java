package ioExamples;

import java.io.File;

public class FileUtility {
    
    /**
     * This method deletes the files present under the folder.
     * 
     * @param folderLocation
     *            pass the folder/directory location from where all the files
     *            has to be deleted.
     * @return boolean all the files in the location are deleted or not.
     * @throws Exception
     */
    public static boolean cleanupLocation(String folderLocation)
            throws Exception {

        boolean isCleaned = false;

        File location = new File(folderLocation);
        File file = null;

        // make sure that the folder exists
        if (!location.exists()) {
            System.out.println("The Folder Does Not Exists: " + folderLocation);
        }

        // if the file object is file and not location
        if (location.isFile()) {
            System.out.println("Please Specify The location to delete all the files: "
                    + folderLocation);
        }

        // create the file name strings
        String fileNames[] = location.list();
        int filesDeleted = 0;

        // for each file in the directory
        for (int i = 0; i < fileNames.length; i++) {

            // create the file object
            file = new File(folderLocation + fileNames[i]);

            // if the location contains subfolders delete them also
            // call the cleanup recursively. Note: file.delete() will delete
            // the directory (file pointing to dir) only if it is empty.
            if (!file.isFile()) {
                cleanupLocation(folderLocation + fileNames[i] + File.separator);
            }

            // attempt to delete the file
            if (!file.delete()) {
                System.out.println("Cant Delete File: " + folderLocation + ""
                        + fileNames[i]);
            }

            // information about the deletion of file - in log
            System.out.println("Deleted File: " + fileNames[i]);

            filesDeleted++;
        }

        // if all files are deleted
        if (filesDeleted == fileNames.length) {
            isCleaned = true;
        }
        return isCleaned;
    }
    
    public static void main(String[] args) {
        
    }
}
