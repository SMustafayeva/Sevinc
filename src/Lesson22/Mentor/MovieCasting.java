package Lesson22.Mentor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieCasting {
    public static void main(String[] args) {
        ArrayList <Actor> actors = new ArrayList<>();
        List<Role> roles = new ArrayList<>();

        actors.add(new Actor("Daniel Radcliffe", 17,10));
        actors.add(new Actor("Emma Watson",15,9));
        actors.add(new Actor("Rupert Grint", 16,8));
        actors.add(new Actor("Brad Pitt",45,10));

        roles.add(new Role("Harry Potter",17,10));
        roles.add(new Role("Hermione Granger",15,9));
        roles.add(new Role("Ron Weasley",16,8));
        roles.add(new Role("Albus Dumbledore",65,10));

      actors.sort((o1, o2) -> (o1.getAge() - o2.getAge())*100 + o1.getActingSkill() - o2.getActingSkill());
        //  actors.sort(new Actor.SortActors());
        roles.sort(new Role.SortRoleByMinSkill());
        System.out.println(actors);

    }
}
