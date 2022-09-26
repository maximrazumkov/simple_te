package ru.example.git.model;

public class Solution {
    private String description;

    public Solution(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "description='" + description + '\'' +
                '}';
    }
}
