package exercises.design_pattern.abstract_factory.furniture.implementation;

import exercises.design_pattern.abstract_factory.furniture.implementation.chairs.ArtDecoChair;
import exercises.design_pattern.abstract_factory.furniture.implementation.coffe_tables.ArtDecoCoffeeTable;
import exercises.design_pattern.abstract_factory.furniture.implementation.sofas.ArtDecoSofa;
import exercises.design_pattern.abstract_factory.furniture.interfaces.Chair;
import exercises.design_pattern.abstract_factory.furniture.interfaces.CoffeTable;
import exercises.design_pattern.abstract_factory.furniture.interfaces.FurnitureFactory;
import exercises.design_pattern.abstract_factory.furniture.interfaces.Sofa;

public class ArtDecoFactory implements FurnitureFactory {


    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ArtDecoCoffeeTable();
    }
}
