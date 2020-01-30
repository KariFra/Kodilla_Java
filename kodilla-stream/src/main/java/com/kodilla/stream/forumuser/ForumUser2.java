package com.kodilla.stream.forumuser;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class ForumUser2 {
    private final String username;
    private final String realName;
    private final String location;
    private final Set<ForumUser2> friends = new HashSet<>();

    public ForumUser2(final String username, final String realName, final String location) {
        this.username = username;
        this.realName = realName;
        this.location = location;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }
    public Set<ForumUser2> getFriends() {
        return friends;
    }

    public void addFriend(ForumUser2 user) {
        friends.add(user);
    }

    public boolean removeFriend(ForumUser2 user) {
        return friends.remove(user);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser2)) return false;
        ForumUser2 forumUser = (ForumUser2) o;
        return username.equals(forumUser.username);
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    public Set<String> getLocationsOfFriends() {
        return friends.stream()
                .map(friend -> friend.getLocation())
                .collect(Collectors.toSet());
    }
    public Set<String> getLocationsOfFriendsOfFriends() {
        return friends.stream()
                .flatMap(user -> user.getFriends().stream())
                .filter(user -> user != this)
                .map(ForumUser2::getLocation)
                .collect(Collectors.toSet());
    }
}
