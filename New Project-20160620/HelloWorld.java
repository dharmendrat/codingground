public class HelloWorld{

     public static void main(String []args){
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.insert(11);
        l.insert(21);
        l.insert(31);
        l.insert(41);
        l.insert(51);
        //l.display();
        
        l.weave();
        l.display();
     }
}
