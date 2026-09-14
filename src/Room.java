import java.util.ArrayList;

public class Room {

    private String roomName;
    private double sizeSquareFeet;
    private ArrayList<Item> contents;

    public Room(String roomName, double sizeSquareFeet) {
        this.roomName = roomName;
        this.sizeSquareFeet = sizeSquareFeet;
        contents = new ArrayList<>();
    }

    public void addItemToRoomContents (Item item){
        contents.add(item);
    }
}
