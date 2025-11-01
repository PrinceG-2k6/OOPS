package OOPS.L4_Static;

public class MAIN {
    public static void main(String[] args) {
        Friend f1 =new Friend("Prince");
        Friend f2 =new Friend("Om");
        Friend f3 =new Friend("Shreyas");
        Friend f4 =new Friend("Ayush");
        Friend[] friends  = {f1,f2,f3,f4};
        for(Friend friend:friends){
            friend.display();
        } 

        Friend.getCount();
    }
}
