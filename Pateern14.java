package GroupAssignment;
 class Pateern14 {
    public static void main(String[] args) {
      for(int i = 1; i <= 5; i++) { 
            for (int j = 1; j <= i; j++) { 
                if (j == 1) { 
                    System.out.print("1");
                } else if (i == j) {
                    System.out.print(j);
                } else if (i == 5) {
                    System.out.print(j);
                } else { 
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}
 }