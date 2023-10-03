package com.example.demo.repository;


import com.example.demo.entity.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testInsertDummies() {

        IntStream.rangeClosed(1,100).forEach((i) -> {
            Memo memo = Memo.builder().memoText("Sample..." + i).build();
            memoRepository.save(memo);
        });
    }


    @Test
    public void testClass(){

        System.out.println(memoRepository.getClass().getName());
    }
}
