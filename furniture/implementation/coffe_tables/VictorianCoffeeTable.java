package exercises.design_pattern.abstract_factory.furniture.implementation.coffe_tables;

import exercises.design_pattern.abstract_factory.furniture.interfaces.CoffeTable;
import exercises.design_pattern.abstract_factory.furniture.interfaces.Sofa;

public class VictorianCoffeeTable implements CoffeTable {
    @Override
    public boolean hasLegs(){
        return true;
    }
    @Override
    public String definition(){
        return "I'm Victorian Coffee Table";
    }
}
