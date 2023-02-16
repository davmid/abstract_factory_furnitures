package exercises.design_pattern.abstract_factory.furniture.implementation;

import exercises.design_pattern.abstract_factory.furniture.interfaces.FurnitureFactory;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationFurnitureTest {
    @Test
    void shouldCreateModernFurnitureSet(){
        FurnitureFactory modernFurniture = new ModernFactory();
        Application application = new Application(modernFurniture);

        assertThat(application.createFurnitureSet().getChair().getKey(), is(false));
        assertThat(application.createFurnitureSet().getChair().getValue(), is("I'm Modern Chair"));
    }
}