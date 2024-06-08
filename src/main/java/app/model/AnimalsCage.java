package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("animalCage")
public class AnimalsCage {
    @Autowired
    private Timer timer;

    private Animal animal;

@Autowired
    public AnimalsCage(@Qualifier("dogBean") Animal animal,
                       @Qualifier("timerBean")Timer timer){
    this.animal = animal;
    this.timer = timer;

}
    public Timer getTimer () {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
