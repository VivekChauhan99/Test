public class constnonp{

    public static void main(String args[]) {

     student s1 = new student();
     s1.name="vivek";
     s1.id=3;
     student s2 = new student(s1);
     s2.stdinfo();
        
    }
}
class student{
    String name;
    int id;
    
    public void stdinfo(){
        System.out.println("The name of the student is:"+this.name);
        System.out.println("The id of the student is:"+this.id);
    }


student(student s2) {
    this.name=s2.name;
    this.id=s2.id;
}
student(){

}
}