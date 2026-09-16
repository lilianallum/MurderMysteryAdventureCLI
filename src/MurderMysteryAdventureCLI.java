public class MurderMysteryAdventureCLI {


    public static void main (String[] args){
        ReadText.printText("storyIntro.txt");
        UserDecisions.continueStory();
        NotePad murderNotes = new NotePad();
        setUpDetective(murderNotes);
        setUpVictim(murderNotes);
    }

    public static void setUpDetective(NotePad murderNotes){
        ReadText.printText("playerIntro.txt");
        Character detectivePlayer = new Character();
        detectivePlayer.setName("DI Jones");
        detectivePlayer.setAge(51);
        murderNotes.addCharacterToNotepad(detectivePlayer);
    }

    public static void setUpVictim(NotePad murderNotes){
        ReadText.printText("discoverVictim.txt");
        Character rosemary = new Character();
        rosemary.setName("Lady Rosemary");
        rosemary.setAge(32);
        rosemary.setGender("Female");
        rosemary.setRelationshipToVictim("Victim");
        murderNotes.addCharacterToNotepad(rosemary);
    }

}
