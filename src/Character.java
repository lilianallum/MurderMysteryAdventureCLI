public class Character {

    private String name;
    private int age;
    private String relationshipToVictim;
    private String motive;
    private String alibi;

    public Character() {
        this.name = "unknown";
        this.relationshipToVictim = "unknown";
        this.motive = "unknown";
        this.alibi = "unknown";
        this.age = -100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        if (this.age == -100){
            return "unknown";
        } else{
            return String.valueOf(this.age);
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRelationshipToVictim() {
        return relationshipToVictim;
    }

    public void setRelationshipToVictim(String relationshipToVictim) {
        this.relationshipToVictim = relationshipToVictim;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public String getAlibi() {
        return alibi;
    }

    public void setAlibi(String alibi) {
        this.alibi = alibi;
    }
}
