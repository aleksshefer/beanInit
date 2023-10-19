package ru.shefer.model;

import org.springframework.stereotype.Component;

@Component
public class HelloAgainBean {
    private final PrototypeBean prototypeBean;

    public HelloAgainBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
        System.out.println("Hello again, Spring!\n" + prototypeBean.toString());
    }
}
