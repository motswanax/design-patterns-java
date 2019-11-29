package com.svs.structural.decoratorExample;

/**
 * Parent for concrete decorators
 * @author baike
 */
abstract class AbstractDecorator extends Component{
    private Component component;

    void setComponent(Component component) {
        this.component = component;
    }

    @Override
    void doJob() {
        if (component != null) {
            component.doJob();
        }
    }
}
