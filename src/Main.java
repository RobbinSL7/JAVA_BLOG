import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) { // Main
        Scanner scnr = new Scanner(System.in);

        PostServices ps = new PostServices(); // Create Object for PostServices


        System.out.println("Enter Title"); // Prompt user for Post Title

          String title = scnr.nextLine(); // Scan Post Title

        System.out.println("Enter Content"); // Prompt user for Content

          String content = scnr.nextLine(); // Scan Post Content

        System.out.println("Enter authorID"); // Prompt user for authorID

          int authorID = scnr.nextInt(); // Scan authorID


        Post post = ps.createPost(title, content, authorID); //Create post using Post as holder

        
        System.out.println(post.title);   // Print Title Variable
        System.out.println(post.content);  // Print Content Variable
        System.out.println(post.authorID);  // Print authorID Variable





    }
}
