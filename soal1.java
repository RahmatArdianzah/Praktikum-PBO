package PBO_pertemuan2;



public class soal1 {
    // Rahmat Ardianzah 2141762113 SIB2F
    public static void main(String[] args) {
        int[] nim = { 2, 1, 4, 1, 7, 6, 2, 1, 1, 3 };
        int x = 0, n = 5, i = 1;
        do {
            int j = n, k = 1;
            do {
                System.out.print(" ");
                j--;
            } while (j > i);
            do {
                if (x > 9) {
                    System.out.print(" ");
                } else {
                    System.out.print(nim[x] + " ");
                    x = x + 1;
                }
                k++;
            } while (k <= i);
            System.out.println();
            i++;
        } while (i <= n);
        //String arrNim [] = {"2","1","4","1","7","6","2","1","1","3"};
        /**int arrNim [] = {2,1,4,1,7,6,2,1,1,3};
         int N, i, l, j, k;
         System.out.print("Masukan nim anda : ");
        N = inputan.nextInt();

         for (i=N; i>0; i--) {
            for (j=0; j<i; j++){
                System.out.print (" ");
            }
            for (l=0; l<=((N-i)*2); l++){
                System.out.print (N);
            }
            for (k=0; k<i; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        do {
            int j = 0;
            do {
                System.out.println();
                j++;
            } while (j < 10);
            System.out.println();
            i++;
        } while (i < 10);
         do{
            int j = 0;
        } while (1<10); **/
    }
}
