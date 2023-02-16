package exercises.design_pattern.abstract_factory.furniture.implementation.chairs;

import exercises.design_pattern.abstract_factory.furniture.interfaces.Chair;

public class ArtDecoChair implements Chair {

    @Override
    public boolean hasLegs(){
        return false;
    }
    @Override
    public String definition(){
        return "I'm ArtDeco Chair";
    }
}
