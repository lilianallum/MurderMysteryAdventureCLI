import java.util.ArrayList;

public class NotePad {

    private ArrayList<Character> charactersMet;
    private ArrayList<Room> roomsInvestigated;

    public NotePad() {
        charactersMet = new ArrayList<>();
        roomsInvestigated = new ArrayList<>();
    }

    public void addCharacterToNotepad(Character character){
        charactersMet.add(character);
    }

    public void addRoomToNotepad(Room room){
        roomsInvestigated.add(room);
    }

    public Character findCharacter(String name){
        for (int i = 0; i < charactersMet.size(); i++) {
            if (charactersMet.get(i).getName().equals(name)){
                return charactersMet.get(i);
            }
        }
        System.out.println("Character not found.");
        return null;
    }

    public Room findRoom(String name){
        for (int i = 0; i < roomsInvestigated.size(); i++) {
            if (roomsInvestigated.get(i).getRoomName().equals(name)){
                return roomsInvestigated.get(i);
            }
        }
        System.out.println("Character not found.");
        return null;
    }

}
