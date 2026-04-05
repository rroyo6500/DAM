package POO.Practicas.HogwartsRobertRoyo.Java.JF.JFComponents.BaseComponent;


/**
 * Public contract for components that can host exactly one child.
 *
 * @param <T> concrete component type returned for fluent composition
 */
public interface JFSingleChildComponent<T extends JFComponent> {

    /**
     * Sets or replaces the single child owned by the component.
     *
     * @param child child component to mount
     * @return current component
     */
    T addChild(JFComponent child);
}
