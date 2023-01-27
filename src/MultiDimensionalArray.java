class Array
{
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3,4},{5,6,7}};

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print(arr1[i][j] +" ");
                // arr1.length = 2(indexing : 0,1)
                // arr1[0].length = 4(indexing : 0,1,2,3)
                // arr1[1].length = 3(indexing : 0,1,2)
                // arr1[0][0] = 1
                // arr1[0][1] = 2
                // arr1[0][3] = 3
                // arr1[0][4] = 4
                // arr1[1][0] = 5
                // arr1[1][1] = 6
                // arr1[1][2] = 7
            }
        }

    }
}