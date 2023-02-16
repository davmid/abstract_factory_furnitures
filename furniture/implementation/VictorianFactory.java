package exercises.design_pattern.abstract_factory.furniture.implementation;

import exercises.design_pattern.abstract_factory.furniture.implementation.chairs.VictorianChair;
import exercises.design_pattern.abstract_factory.furniture.implementation.coffe_tables.VictorianCoffeeTable;
import exercises.design_pattern.abstract_factory.furniture.implementation.sofas.VictorianSofa;
import exercises.design_pattern.abstract_factory.furniture.interfaces.Chair;
import exercises.design_pattern.abstract_factory.furniture.interfaces.CoffeTable;
import exercises.design_pattern.abstract_factory.furniture.interfaces.FurnitureFactory;
import exercises.design_pattern.abstract_factory.furniture.interfaces.Sofa;

public class VictorianFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new VictorianCoffeeTable();
    }
}
