public class classMethods {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = add(a, b);

        for (int i = 0; i < 5; i++) {
            int tmp = add(i, b);

            System.out.println(tmp);
        }
    }

    public static int add(int a, int b) {

        int sum = a + b;
        //vagy double = sum mivel lehet nem egész szám is
        return sum;
    }

}

int[] intArray = new int[5];
intArray[0] = 5;
intArray[1] = 6;
//stb
int[] intArray2 = intArray;
System.out.println(intArray[1]);

//vagy:
int[] intArray = new int[] (5, 6);
//ez egyszerűbb és célszerűbb

//------------két dimenziós tömb:

int;[][] twoDimArray = new int[2][3];
twoDimArray [0][0] = 5;

//vagy
int[][] twoDimArray = new int;[][] {{1, 2, 3}, {4, 5, 6}};
System.out.println(twoDimArray[0][1] + " , ") + twoDimArray[1][1]);

//asszimmetrikus tömb kiratása for ciklussal

        int[][] twoDimArray = new int;[][] {{1, 2, 3}, {4, 5,}};
        for(int i = 0; i < twoDimArray.length; i++) {
            for (int j= 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i] [j] + " ");   //nem printLN csak PRINT


        }
        }

        System.out.println(twoDimArray[0][1] + " , ") + twoDimArray[1][1]);

int intArray4[] = (1, 5, 6, 8);
for(int element : intArray4) {
    System.out.println(element) ;
    //foreache
        }

        Arrays.sort(intArray4);
System.out.println("Sorted array");
for(int element : intArray4) {
        System.out.println(element);
        }
        System.out.println(inArray4 [0]);

int[] copiedArray4 = Arrays.copyOf(intArray4, intArray4.length);
Systemout.println("Copy");
System.out.println(Arrays.toString(copeidArray4));

intArray4[0] = 2;


public stativ void printElements(int[] toBePrinted) {
        System.out.println(Arrays.toString(toBePrinted));

        int[] arr =(1, 2, 3);
        printElements(arr[]);
}

public static int[] myCopy(int[] toBeCopied) {

    int[] copy = new int[toBeCopied.length];

    for (int i =0; i < toBeCopied.length; i++) {
        copy(i) = toBeCopied(i);
        }
        return copy;
}