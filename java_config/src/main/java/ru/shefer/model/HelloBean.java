package ru.shefer.model;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    private final PrototypeBean prototypeBean;

    public HelloBean(PrototypeBean prototypeBean) {
        System.out.println("Hello Spring!\n" + prototypeBean.toString());
        this.prototypeBean = prototypeBean;
    }
}
