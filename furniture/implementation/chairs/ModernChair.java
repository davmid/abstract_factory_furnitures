package exercises.design_pattern.abstract_factory.furniture.implementation.chairs;

import exercises.design_pattern.abstract_factory.furniture.interfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public boolean hasLegs(){
        return false;
    }
    @Override
    public String definition(){
        return "I'm Modern Chair";
    }
}
