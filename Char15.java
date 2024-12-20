public class Char15 {
    public static void main(String[] args) {
        char karakter[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O'};

        int print = 1;
        int index_char = 0;
        for(int i=0;i<5;i++){
            for(int j=5-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<print;k++){
                System.out.print(karakter[index_char]);
                index_char++;
            }
            System.out.println();
            print++;
        }
        

    }
}
