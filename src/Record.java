public class Record extends Item{
    // for clues in written form (notes, wills, diaries etc.)

    private String format;
    private String contents;

    public Record(String itemName, String format) {
        super(itemName);
        this.format = format;
    }

    public String readContents(){
        // read files.txt
        // this.contents = read file
        return contents;
    }
}
