public class MyArray

{

    public static void main(String[] args)

    {

        int[] array[][] = {

            null,

            {{1, 2, 3, 4, 5}},

            new int[3][],

            {{6, 7, 8, 9, 10, 11}, {12, 13, 14, 15}, {16, 17, 18, 19}}

        };

        // line 11: Write your statement here!
        System.out.println(array[3][2][2]);

    }

}
