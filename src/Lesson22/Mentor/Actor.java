package Lesson22.Mentor;

import Lesson22.Lection.ComparableComparator;

import java.util.Comparator;

public class Actor implements Comparable<Actor>{
    String name;
    int age;
    int actingSkill;
    public Actor(String name, int age, int actingSkill) {
        this.name = name;
        this.age = age;
        this.actingSkill = actingSkill;
    }

    public int getAge() {
        return age;
    }

    public int getActingSkill() {
        return actingSkill;
    }

    @Override
    public int compareTo(Actor o ) {
        return (this.age-o.age)*100 + actingSkill - o.actingSkill;
    }
    static class SortActors implements Comparator<Actor>{
        @Override
        public int compare(Actor o1, Actor o2) {
            return (o1.age-o2.age)*100 + o1.actingSkill - o2.actingSkill;
        }
    }

    @Override
    public String toString() {
        return name +
                ", age=" + age +
                ", actingSkill=" + actingSkill +
                '|';
    }
}


