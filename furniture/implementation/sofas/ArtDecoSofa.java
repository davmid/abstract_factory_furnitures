package exercises.design_pattern.abstract_factory.furniture.implementation.sofas;

import exercises.design_pattern.abstract_factory.furniture.interfaces.Sofa;

public class ArtDecoSofa implements Sofa {
    @Override
    public boolean hasLegs(){
        return true;
    }
    @Override
    public String definition(){
        return "I'm ArtDeco Sofa";
    }
}
