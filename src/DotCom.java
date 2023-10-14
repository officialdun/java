import java.util.ArrayList;

public class DotCom {

    ArrayList<String> locationsCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs) {locationsCells = locs;}
    public void setName(String name) {
        this.name = name;
    }

    String checkYourSelf(String userGuesses) {
        String result = "miss";

        int index = locationsCells.indexOf(userGuesses);

        if (index>=0){
             locationsCells.remove(index);

             if (locationsCells.isEmpty()){
                 result = "kill";
                 System.out.println("You sunk a "+name+" :( ");
             }else{
                 result = "hit";
             }
        }
        return result;
    }

}
