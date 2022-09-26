import java.io.*;

class FilteredDirectoryTree {

  public static void main(String args[]) {
    
    String suffix = null;
    if(args.length > 1) {
      suffix = args[1];
    }
    tree(args[0], suffix);
  }

  public static void tree(String filename, String suffix) {

    // Create a file object
    File file = new File(filename);

    // If file is not a directory,
    // display filename and return
    if(!file.isDirectory()) {
      if(suffix == null || filename.endsWith(suffix))
        System.out.println(filename);
      return;
    }

    // Process contents of this directory
    String files[] = file.list();
    for(int i = 0; i < files.length; i++) {
      tree(filename + File.separator + files[i], suffix);
    }
  }
}