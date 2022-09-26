package ru.example.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.git.model.ResultRequest;
import ru.example.git.model.Solution;

import java.util.List;

@RestController
public class MainController {

    private final List<ResultRequest> resultRequests;

    public MainController() {
        this.resultRequests = List.of(
            new ResultRequest(0, "Нулевой элемент", List.of(new Solution("Положительное"))),
            new ResultRequest(1, "Первый элемент", List.of(new Solution("Отрицательное"))),
            new ResultRequest(2, "Второй элемент", List.of(new Solution("Еще не принято"), new Solution("Рассмотрение")))
        );
        ResultRequest resultRequest = resultRequests.get(0);
        String title = resultRequest.getTitle();
        System.out.println(title);
    }

    @GetMapping
    public List<ResultRequest> getList() {
        System.out.println("Hello");
        resultRequests.forEach(resultRequest -> {
            System.out.println(resultRequest);
        });
        return resultRequests;
    }
}
