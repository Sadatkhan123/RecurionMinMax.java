 class abc
 {
    
    public static int f(int[] array, int i) {
        if (i == array.length - 1) {
            return array[i];
        }
        return Math.min(array[i], f(array, i + 1));
    }
    
    public static int f1(int[] array, int i) {
        if (i == array.length - 1) {
            return array[i];
        }
        return Math.max(array[i], f1(array, i + 1));
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4};
        
        int min = f(array,0);
        int max = f1(array,0);
        
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}