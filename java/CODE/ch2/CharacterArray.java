class CharacterArray {

public static void main(String args[]) {

    // Create and initialize array
    Character array[] = new Character[5];
	
    array[0] = new Character('A');
    array[1] = new Character('B');
    array[2] = new Character('C');
    array[3] = new Character('D');
    array[4] = new Character('E');

    // Create string buffer
    StringBuffer sb = new StringBuffer();
    // Append array elements to buffer
    sb.append(array[0]);
    sb.append(array[1]);
    sb.append(array[2]);
    sb.append(array[3]);
    sb.append(array[4]);

    // Display string buffer
    System.out.println(sb);
  }
}