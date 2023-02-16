package exercises.design_pattern.abstract_factory.furniture.interfaces;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeTable createCoffeTable();
}
