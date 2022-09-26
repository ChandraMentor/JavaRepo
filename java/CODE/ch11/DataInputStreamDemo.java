import java.io.*;

class DataInputStreamDemo {

  public static void main(String args[]) {

    try {

      // Create a file input stream
      FileInputStream fis =
        new FileInputStream(args[0]);

      // Create a data input stream
      DataInputStream dis =
        new DataInputStream(fis);

      // Read and display data
      System.out.println(dis.readBoolean());
      System.out.println(dis.readByte());
      System.out.println(dis.readChar());
      System.out.println(dis.readDouble());
      System.out.println(dis.readFloat());
      System.out.println(dis.readInt());
      System.out.println(dis.readLong());
      System.out.println(dis.readShort());
      
      // Close file input stream
      fis.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
