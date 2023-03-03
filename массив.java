import java.util.Scanner;
 
class массив {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int size, i;
      System.out.print("Введите размер массива: ");
      size = in.nextInt();
      int[] arrayOfInts = new int[size];
      System.out.println("Введите элементы массива:");
      for (i = 0; i < size; i++)
        arrayOfInts[i] = in.nextInt();
 
      int temp;
      for (i = 0; i < size; i++) {
        for (int j = i + 1; j < size; j++) {
          if (arrayOfInts[i] > arrayOfInts[j]) {
            temp = arrayOfInts[i];
            arrayOfInts[i] = arrayOfInts[j];
            arrayOfInts[j] = temp;
          }
        }
      }
  
      System.out.print("Отсортированный массив: ");
      for (i = 0; i < size - 1; i++) {
        System.out.print(arrayOfInts[i] + " , ");
      }
      System.out.print(arrayOfInts[size - 1]);
    }
  }
}
