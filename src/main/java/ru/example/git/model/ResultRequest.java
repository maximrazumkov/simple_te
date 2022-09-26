package ru.example.git.model;

import java.util.List;

public class ResultRequest {
    private long id;
    private String title;
    private List<Solution> solutionList;

    public ResultRequest() {
    }

    public ResultRequest(long id, String title, List<Solution> solutionList) {
        this.id = id;
        this.title = title;
        this.solutionList = solutionList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Solution> getSolutionList() {
        return solutionList;
    }

    public void setSolutionList(List<Solution> solutionList) {
        this.solutionList = solutionList;
    }

    @Override
    public String toString() {
        return "ResultRequest{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", solutionList=" + solutionList +
                '}';
    }
}
