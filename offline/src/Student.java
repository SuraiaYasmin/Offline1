/**
 * Created by USER on 9/17/2015.
 */
public class Student extends Room {

    private String studentName;
    private String studentNo;
    Room room;

    public Student() {}
    public Student(String s, String t , Room r)
    {
        studentName = s ;
        studentNo = t ;
        room = r;
    }


    public  Room getRoom()
    {
        return room;
    }

    public void setRoom(Room r)
    {
        room = r;
    }

    public String getStudentName()
    {
        return studentName ;
    }

    public void setStudentName(String s)
    {
        studentName = s ;
    }

    public String getStudentNo()
    {
        return studentNo ;
    }

    public void setStudentNo(String t)
    {
        studentNo = t ;

    }

    public void print()
    {
        System.out.println("Student No:" + getStudentNo() + "," + getStudentName() + "," + "resides on " + room.getHallName() + "hall" + "," + "Room No" + "," +  room.getRoomNo() + ".");
    }
}
