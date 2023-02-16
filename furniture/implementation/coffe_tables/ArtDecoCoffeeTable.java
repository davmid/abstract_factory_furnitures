package exercises.design_pattern.abstract_factory.furniture.implementation.coffe_tables;

import exercises.design_pattern.abstract_factory.furniture.interfaces.CoffeTable;

public class ArtDecoCoffeeTable implements CoffeTable {
    @Override
    public boolean hasLegs(){
        return false;
    }
    @Override
    public String definition(){
        return "I'm ArtDeco Coffee Table";
    }
}
