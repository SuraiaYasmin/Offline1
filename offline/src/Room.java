/**
 * Created by USER on 9/17/2015.
 */
public class Room {
    private String hallName;
    private int roomNo;
    private Boolean status;

    public Room() {}

    public Room(String h1,int r1)
    {
        hallName = h1;
        roomNo = r1;
        status = false;
    }
    public String getHallName()
    {
        return hallName;
    }
    public void setHallName(String h)
    {
        hallName = h;
    }
    public int getRoomNo()
    {
        return roomNo;
    }
    public void setRoomNo(int r)
    {
        roomNo = r;
    }
   public Boolean getStatus()
    {
        return status;
    }

   public void setStatus(Boolean s)
    {
        status = s;
    }




   public void print()  {

        if (status == false )
            System.out.println("Room No" + "." + getRoomNo() + " of " + getHallName() + " hall " + "is currently available for allotment.");
        else
            System.out.println("Room No" + "," + getRoomNo() + " " + "of" + " " + getHallName() + " " + "is alloted");

    }

}
