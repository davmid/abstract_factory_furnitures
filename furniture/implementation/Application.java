package exercises.design_pattern.abstract_factory.furniture.implementation;

import exercises.design_pattern.abstract_factory.furniture.interfaces.Chair;
import exercises.design_pattern.abstract_factory.furniture.interfaces.CoffeTable;
import exercises.design_pattern.abstract_factory.furniture.interfaces.FurnitureFactory;
import exercises.design_pattern.abstract_factory.furniture.interfaces.Sofa;
import exercises.design_pattern.abstract_factory.furniture.util.FurnitureSet;


public class Application {
    private Chair chair;
    private Sofa sofa;
    private CoffeTable coffeeTable;

    public Application(FurnitureFactory furniture) {
        this.chair = furniture.createChair();
        this.sofa = furniture.createSofa();
        this.coffeeTable = furniture.createCoffeTable();
    }

    public FurnitureSet createFurnitureSet() {
        return new FurnitureSet(chair, sofa, coffeeTable);
    }
}
