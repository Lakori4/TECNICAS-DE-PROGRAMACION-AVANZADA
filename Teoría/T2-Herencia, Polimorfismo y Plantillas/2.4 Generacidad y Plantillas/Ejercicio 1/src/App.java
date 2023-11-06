
public class App  {



    /**
     * @param <T>
     * @param m1
     * @param m2
     * @return
     */
    static <T> boolean equalMatrix(T[][] m1, T[][] m2){
        
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2 [i][j]) return false;
            }             
        }
        return true;
    }   
    
    //static void print
    

    public static void main(String[] args) throws Exception {
        Integer [][] m1 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        Integer [][] m2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        if (equalMatrix(m1, m2)) { System.out.print("Las matrices son iguales.\n"); }
        else { System.out.print("Las matrices " + " no son iguales.\n"); } 
    }
}
