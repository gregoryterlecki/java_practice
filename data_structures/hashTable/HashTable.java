import java.util.Arrays;

public class HashTable {

  String[] data;
  int size;
  int itemCount = 0;

  public HashTable(int inSize){
    size = inSize;
    data = new String[size];
    Arrays.fill(data, "-1");
  }

  public void hashFunction(String[] toInsert){
    for(int i = 0; i < toInsert.length; i++){
      String newElem = toInsert[i];
      int arrayIndex = Integer.parseInt(newElem) % 31;
      System.out.println("Modulus Index = " + arrayIndex + " for value " + newElem);
      while(data[arrayIndex] != "-1"){
        arrayIndex++;
        System.out.println("Collision, try " + arrayIndex + " instead");
        arrayIndex %= size;
      }
      data[arrayIndex] = newElem;
    }
  }

  public void displayTheStack(){

		int increment = 0;

		for (int m = 0; m < 3; m++) {

			increment += 10;

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				System.out.format("| %3s " + " ", n);

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				if (data[n].equals("-1"))
					System.out.print("|      ");

				else
					System.out.print(String.format("| %3s " + " ", data[n]));

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

		}

	}

}
