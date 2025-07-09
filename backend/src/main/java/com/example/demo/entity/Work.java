package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data                   // getter/setter, toString, equals, hashCode 全て自動生成
@NoArgsConstructor      // 引数なしコンストラクタ自動生成
@AllArgsConstructor     // 全フィールド引数付きコンストラクタ自動生成
public class Work {
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private List<String> tags;
    private String detail;
    private String link;
}
