package exercises.design_pattern.abstract_factory.furniture.implementation;

import exercises.design_pattern.abstract_factory.furniture.implementation.chairs.ModernChair;
import exercises.design_pattern.abstract_factory.furniture.implementation.coffe_tables.ModernCoffeeTable;
import exercises.design_pattern.abstract_factory.furniture.implementation.sofas.ModernSofa;
import exercises.design_pattern.abstract_factory.furniture.interfaces.Chair;
import exercises.design_pattern.abstract_factory.furniture.interfaces.CoffeTable;
import exercises.design_pattern.abstract_factory.furniture.interfaces.FurnitureFactory;
import exercises.design_pattern.abstract_factory.furniture.interfaces.Sofa;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ModernCoffeeTable();
    }
}
