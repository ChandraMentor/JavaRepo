import java.io.*;

class Rename {
  public static void main(String args[]) {
    try {
      // Create file object for old file
      File oldFile = new File(args[0]);
      // Create file object for new file
      File newFile = new File(args[1]);
      // Rename oldFile as newFile
      boolean result = oldFile.renameTo(newFile);
      // Display result
      System.out.println(result);
    }
catch(Exception e) {
e.printStackTrace();
    }
  }
}