import ru.shefer.model.HelloAgainBean
import ru.shefer.model.HelloBean
import ru.shefer.model.PrototypeBean

beans  {
    prototypeBean(PrototypeBean) {
        bean ->
            bean.scope = "prototype"
    }
    helloBean(HelloBean) {
    }
    helloAgainBean(HelloAgainBean) {
    }

}