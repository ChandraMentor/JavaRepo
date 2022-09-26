import java.io.*;

class DirectoryTree {
public static void main(String args[]) {
// Check if file exists
File file = new File(args[0]);
if(!file.exists()) {
System.out.println(args[0] + " does not exist.");
return;
    }
    // Display directory tree
 tree(args[0]);
  }
 public static void tree(String filename) {
    // Create a file object
    File file = new File(filename);

    // If file is not a directory,
    // display filename and return
    if(!file.isDirectory()) {
      System.out.println(filename);
      return;
    }

    // Process contents of this directory
    String files[] = file.list();
    for(int i = 0; i < files.length; i++) {
      tree(filename + File.separator + files[i]);
    }
  }
}