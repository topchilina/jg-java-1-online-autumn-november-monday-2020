package students.tatjana_topcilina.lesson_14.level_1_2;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {

        return "green".equals(apple.getColor());
    }
}

