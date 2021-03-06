package students.nikita_bobrovs.lesson_14.level_1.predicates;

import students.nikita_bobrovs.lesson_14.level_1.Apple;
import students.nikita_bobrovs.lesson_14.level_1.ApplePredicate;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
