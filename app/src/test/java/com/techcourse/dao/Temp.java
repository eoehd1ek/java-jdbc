package com.techcourse.dao;

import org.junit.jupiter.api.Test;

public class Temp {
    @Test
    void test() {
        TemplateMethodExample example = new TemplateMethodExample();
        example.helloWorld();
        example.byeWorld();
    }
}

class TemplateMethodExample {
    public void helloWorld() {
        // 람다를 구현하여 실행할 작업을 작성합니다.
        execute(() -> System.out.println("Hello, World!"));
    }

    public void byeWorld() {
        // 람다를 구현하여 실행할 작업을 작성합니다.
        execute(() -> System.out.println("Bye, World!"));
    }

    private void execute(final PrinterCallback printer) {
        System.out.println("공통적으로 실행할 작업입니다.");
        printer.print();
        System.out.println("콜백이 끝난 후에 실행할 작업입니다.");
    }
}

@FunctionalInterface
interface PrinterCallback {
    void print();
}
