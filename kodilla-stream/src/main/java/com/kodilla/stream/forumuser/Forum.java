package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> users = new ArrayList<>();


    public List<ForumUser> getUserList() {
        users.add(new ForumUser(1, "Benedict Camberbatch", 'M', LocalDate.of(1996, 1, 13), 2));
        users.add(new ForumUser(2, "Benedict Chambauamba", 'M', LocalDate.of(1993, 7, 13), 3));
        users.add(new ForumUser(3, "Olivia Jones", 'F', LocalDate.of(1994, 1, 13), 6));
        users.add(new ForumUser(4, "Benedict Cucambersnach", 'M', LocalDate.of(2000, 1, 13), 6));
        users.add(new ForumUser(5, "Sarah Connor", 'F', LocalDate.of(2002, 2, 13), 8));
        users.add(new ForumUser(6, "Petunia Lopez", 'F', LocalDate.of(2005, 5, 13), 1));

        return new ArrayList<>(users);
    }


}
