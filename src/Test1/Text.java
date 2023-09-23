package Test1;

public class Text {
    private String text;
    public Text(){

    }
    public Text(String text){
        this.text = text;
    }
    public int soCau(){
        int count = 0;
        for(int i=0; i<text.length(); i++){
            if (text.charAt(i)=='?' || text.charAt(i)=='.' || text.charAt(i)=='!') count++;
        }
        return count;
    }
    public void chuanHoa(){
        text = text.strip();
        text = text.replaceAll("\\s+", " ");
        text = text.replaceAll(" [?]", "?");
        text = text.replaceAll(" [.]", ".");
        text = text.replaceAll(" [!]", "!");
        text = text.replaceAll("[?]\\s*", "? ");
        text = text.replaceAll("[.]\\s*", ". ");
        text = text.replaceAll("[!]\\s*", "! ");
        System.out.println(text);
    }
}
