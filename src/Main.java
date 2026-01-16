
public class Main {
    
    public static void main(String[] args) {

        PostServices ps = new PostServices();
  
        Post post = ps.createPost();
        
        
        System.out.println(post.title);
        System.out.println(post.content);
        System.out.println(post.authorID);





    }
}
