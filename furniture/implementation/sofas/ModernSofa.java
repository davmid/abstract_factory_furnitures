package exercises.design_pattern.abstract_factory.furniture.implementation.sofas;

import exercises.design_pattern.abstract_factory.furniture.interfaces.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public boolean hasLegs(){
        return false;
    }
    @Override
    public String definition(){
        return "I'm Modern Sofa";
    }
}
