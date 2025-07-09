package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin("http://localhost:3000")
public class ContactController {

    // お問い合わせ内容をDBに保存
    @PostMapping
    public String sendContact(@RequestBody Map<String, String> form) {
        // 最初はダミーメッセージを送信
        System.out.println("お問い合わせ内容: " + form);
        return "お問い合わせを受け付けました";
    }
}
