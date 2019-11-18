package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final int identifier;
    final String user;
    final char gender;
    final LocalDate birthdate;
    final int posts;

    public ForumUser(final int identifier, final String user, final char gender, final LocalDate birthdate, final int posts) {
        this.identifier = identifier;
        this.user = user;
        this.gender = gender;
        this.birthdate = birthdate;
        this.posts = posts;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUser() {
        return user;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "Forumuser{" +
                "identifier=" + identifier +
                ", user='" + user + '\'' +
                ", gender=" + gender +
                ", birthdate=" + birthdate +
                ", posts=" + posts +
                '}';
    }
}
