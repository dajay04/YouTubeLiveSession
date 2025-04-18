package youtube_lec_wise.lecture5;

public class D1ArrayTest
{
    public static void main(String[] args)
    {

            int matrix[][] = {
                    {40,20,30},
                    {52,42,32}
            };

            // 1D array we have fetched data using for loop and for each loop, Same idegology we are going to do here with 2d arrya

        for(int i=0;i<matrix.length;i++)
        {
            for ( int j = 0 ; j< matrix[i].length;j++)
            {
                System.out.println("Value of Data in Table:"+ matrix[i][j]);
            }
        }

    }
}
