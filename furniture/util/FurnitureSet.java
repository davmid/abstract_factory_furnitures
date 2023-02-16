package exercises.design_pattern.abstract_factory.furniture.util;

import exercises.design_pattern.abstract_factory.furniture.interfaces.Chair;
import exercises.design_pattern.abstract_factory.furniture.interfaces.CoffeTable;
import exercises.design_pattern.abstract_factory.furniture.interfaces.Sofa;
import exercises.design_pattern.abstract_factory.util.Pair;

public class FurnitureSet{
    Pair<Boolean, String> chair;
    Pair<Boolean, String> sofa;
    Pair<Boolean, String> coffeTable;

    public FurnitureSet(Chair chair, Sofa sofa, CoffeTable coffeeTable){
        this.chair = new Pair<>(chair.hasLegs(), chair.definition());
//        this.sofa = new Pair<>()
    }

    public Pair<Boolean, String> getChair() {
        return chair;
    }

    public Pair<Boolean, String> getSofa() {
        return sofa;
    }

    public Pair<Boolean, String> getCoffeTable() {
        return coffeTable;
    }
}
