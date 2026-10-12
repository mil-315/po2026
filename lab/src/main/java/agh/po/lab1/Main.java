//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner myObj = new Scanner(System.in);
    System.out.println("podaj wysokość choinki: ");
    int num = myObj.nextInt();

    for (int i=0; i<num ; i++){
        for(int k=0; k<=((num)/2 - i); k++) {
            System.out.print(" ");
        }
        for(int j=0; j<=i; j++) {

            System.out.print("**");
        }
        System.out.println();
    }

}


