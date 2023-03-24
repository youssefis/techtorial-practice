package oop.abstraction.abstraction1;

public class Test {

    public static void main(String[] args) {

        OnlineStudent onlineStudent=new OnlineStudent("Ben",12345);
        onlineStudent.watchViaZoom();
        onlineStudent.test1();

        // object can not be created from abstract classes
        //Student student=new Student();

        Alia alia=new Alia("Alia",2221);
        System.out.println("==========");
        System.out.println(alia.id);
        System.out.println("==========");
        CampusStudent campusStudent=new CampusStudent("efe",8888);
        campusStudent.playTableTennis();
        campusStudent.test1();
        campusStudent.sleep();

    }

}
