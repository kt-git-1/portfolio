package com.example.demo.controller;

import com.example.demo.entity.Work;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/works")
@CrossOrigin(origins = "http://localhost:3000") // Next.jsからのアクセス許可
public class WorkController {

    // ダミーデータ
    private final List<Work> works = Arrays.asList(
            new Work(
                    1L,
                    "ポートフォリオサイト",
                    "Next.js+Springで作成したポートフォリオサイト",
                    "https://dummyimage.com/600x400/000/fff",
                    Arrays.asList("Next.js", "React", "Typescript", "Spring", "Java"),
                    "個人開発したポートフォリオサイトです",
                    "https://github.com/kt-git-1/portfolio"
            ),
            new Work(
                    2L,
                    "古代ゲノム自動解析ツール",
                    "古代ゲノムの解析を自動で行うツール",
                    "https://dummyimage.com/600x400/000/fff",
                    Arrays.asList("Python", "Shell", "Java", "ENA"),
                    "考古学者の先生と共同開発している自動解析ツールです",
                    "https://github.com/kt-git-1/auto-app2"
            )
    );

    // 一覧取得
    @GetMapping
    public List<Work> getWorks() {
        return works;
    }

    // 詳細取得
    @GetMapping("/{id}")
    public Work getWorkById(@PathVariable Long id) {
        Optional<Work> work = works.stream().filter(w -> w.getId().equals(id)).findFirst();
        return work.orElse(null);
    }
}
