package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello! Enter the number of items: " );

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        String str;

        Gallery <String> gallery = new Gallery();
        for (int i = 0; i<n;i++){
            str = console.next();
            gallery.add(str,i);
        }
        gallery.view();
        int c = 1;

        while (c != 0){
            System.out.println("List:");
            gallery.view();
            System.out.println("Next step:");
            System.out.println("0: finish");
            System.out.println("1: add");
            System.out.println("2: get");
            System.out.println("3: delete");

            c = console.nextInt();

            switch (c)
            {
                case (1):
                    boolean f = true;
                    while (f){
                        str = console.next();
                        System.out.println("Where?");
                        n = console.nextInt();

                        if (gallery.check(n-1) && n>=0) {
                            gallery.add(str, n);
                        }

                        System.out.println("Enough? 0 - yes, 1 - no");
                        if (console.nextInt() == 0) {
                            f = false;
                        }
                    }
                    break;
                case (2):
                    System.out.println("The number of the item to get:");
                    n = console.nextInt();
                    if ( gallery.check(n) && n>=0) {
                        System.out.println(gallery.getData(n));
                    }
                    break;
                case (3):
                    System.out.println("The number of the item to delete:");
                    n = console.nextInt();
                    if (gallery.check(n) && n>=0) {
                        gallery.clear(n);
                    }
                    break;
                default:
                    System.out.println("Choose from the suggested options:");
                    break;
            }

        }



    }
}
