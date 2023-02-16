package exercises.design_pattern.abstract_factory.furniture.implementation.chairs;

import exercises.design_pattern.abstract_factory.furniture.interfaces.Chair;

public class VictorianChair implements Chair {

    @Override
    public boolean hasLegs(){
        return true;
    }
    @Override
    public String definition(){
        return "I'm Victorian Chair";
    }
}
