public class Main {
    public static void main(String[] args) {

//   Book 1

        String b1Name = " The Name of the Wind ";
        String b1Author = " Patrick Rothfuss ";

            int a1 = 2007;
            int a2 = 662;

                boolean isBook1Read = false;

//   Book 2

        String b2Name = " The Blade Itself ";
        String b2Author = " Joe Abercrombie ";

            int b1 = 2006;
            int b2= 515;

                boolean isBook2Read = false;

//   Book 3

        String b3Name = " The Way of Kings ";
        String b3Author = " Brandon Sanderson ";

            int c1 = 2010;
            int c2 = 1007;

                boolean isBook3Read = true;

//   Found out on Google how to add breaks in code, so i am not sure is it better to use \n or it is better practice to use new print command, or there is something even better?
//   Also used google to look how to make text look in "Italic"

        System.out.println("\033[3mLibrary contains following:\033[0m " + "\n");

//  Book 1 Output

        System.out.println("Book #1" + "\n" +"\n" + "Name :" + b1Name + "\n" + "Author :" + b1Author);
        System.out.println("Publishing year : " + a1 + "\n" + "Number of Pages: " + a2);
        System.out.println("Is this book being read? : " + isBook1Read);
        System.out.printf("--------------------------------------" + "\n" + "\n");

//  Book 2 Output

        System.out.println("Book #2" + "\n" +"\n" + "Name :" + b2Name + "\n" + "Author :" + b2Author);
        System.out.println("Publishing year : " + b1 + "\n" + "Number of Pages: " + b2 );
        System.out.println("Is this book being read? : " + isBook2Read);
        System.out.printf("--------------------------------------" + "\n" + "\n");

//  Book 3 Output

        System.out.println("Book #3" + "\n" +"\n" + "Name :" + b3Name + "\n" + "Author :" + b3Author);
        System.out.println("Publishing year : " + c1 + "\n" + "Number of Pages: " + c2);
        System.out.println("Is this book being read? : " + isBook3Read);
        System.out.printf("--------------------------------------" + "\n" + "\n");

//  Statistic part

        System.out.println("\n" + "\033[3mSome statistic regarding the books in library\033[0m " + "\n");

    int totalPageNumber = a2 + b2 + c2;

        System.out.println("Total combined number of pages is : " + totalPageNumber);

    double averagePublishYear = (double) (a1 + b1 + c1) /3;


        System.out.println("Average publish year is: " + averagePublishYear);

    }
}