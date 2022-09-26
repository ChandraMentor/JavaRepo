import java.io.*;

class DataOutputStreamDemo {

  public static void main(String args[]) {

    try {

      // Create a file output stream
      FileOutputStream fos =
        new FileOutputStream(args[0]);

      // Create a data output stream
      DataOutputStream dos =
        new DataOutputStream(fos);

      // Write various types of data
      dos.writeBoolean(false);
      dos.writeByte(Byte.MAX_VALUE);
      dos.writeChar('A');
      dos.writeDouble(Double.MAX_VALUE);
      dos.writeFloat(Float.MAX_VALUE);
      dos.writeInt(Integer.MAX_VALUE);
      dos.writeLong(Long.MAX_VALUE);
      dos.writeShort(Short.MAX_VALUE);
      
      // Close file output stream
      fos.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}