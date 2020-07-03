package Code;

import javafx.collections.ObservableList;

import java.util.List;

public class Sterren {
    private Integer ster;

    public Sterren(Integer ster) {
        this.ster = ster;
    }

    public Integer getSter() {
        return ster;
    }

    public Integer getGemiddelde(ObservableList<Sterren> list){
        int gemiddelde = 0;

        for(int i = 0; i < list.size(); i++){
            gemiddelde += list.get(i).getSter();
            if(list.size()-1 == i){
                return gemiddelde/list.size();
            }
        }

        return 0;
    }

  public Sterren(){

  }


}


