package Lesson22.Mentor;

import java.util.Comparator;

public class Role implements Comparable<Role> {
    String roleName;
    int expectedAge;
    int minSkill;
    Actor actor;

    public Role(String name, int expectedAge, int minSkill) {
        this.roleName = name;
        this.expectedAge = expectedAge;
        this.minSkill = minSkill;
    }
    @Override
    public int compareTo(Role o) {
        return this.expectedAge - o.expectedAge;
    }
    static class SortRoleByMinSkill implements Comparator<Role>{
        @Override
        public int compare(Role o1, Role o2) {
            return o1.compareTo(o2);
        }
    }
}
