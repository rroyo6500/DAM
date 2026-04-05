package POO.Practicas.HogwartsRobertRoyo.Java.JF.JFComponents.ComplexComponents;

import POO.Practicas.HogwartsRobertRoyo.Java.JF.Enums.Alignment;
import POO.Practicas.HogwartsRobertRoyo.Java.JF.JFComponents.BaseComponent.JFComplexComponent;
import POO.Practicas.HogwartsRobertRoyo.Java.JF.JFComponents.BaseComponent.JFComponent;
import POO.Practicas.HogwartsRobertRoyo.Java.JF.JFComponents.BaseComponent.JFMultiChildComponent;
import POO.Practicas.HogwartsRobertRoyo.Java.JF.JFComponents.SimpleComponents.JFSizedBox;
import POO.Practicas.HogwartsRobertRoyo.Java.JF.JFComponents.SimpleComponents.JFStack;

/**
 * Convenience component that combines a fixed-size box with a stack layout.
 * <p>
 * The class is handy when several layered children must share an explicit width and height,
 * regardless of their own preferred sizes. Internally it creates a {@link JFSizedBox} and
 * places a {@link JFStack} inside it, exposing the composition as a single reusable component.
 *
 * @author rroyo
 */
public class JFSizedStack extends JFComplexComponent implements JFMultiChildComponent<JFSizedStack> {

    private static JFStack stack;

    /**
     * Creates a fixed-size stack with the requested alignment and children.
     *
     * @param alignment alignment used by the internal stack for non-custom child positioning
     * @param width fixed width of the resulting component
     * @param height fixed height of the resulting component
     */
    public JFSizedStack(Alignment alignment, int width, int height) {
        super(() -> {
            stack = new JFStack(alignment);
            return new JFSizedBox(width, height).addChild(stack);
        });
    }

    /**
     * Forwards a child to the internal stack hosted inside the sized box.
     *
     * @param child child to layer inside the fixed-size stack
     * @return current sized stack
     */
    @Override
    public JFSizedStack addChild(JFComponent child) {
        stack.addChild(child);
        return this;
    }

    /**
     * Forwards multiple children to the internal stack in insertion order.
     *
     * @param children children to layer inside the fixed-size stack
     * @return current sized stack
     */
    @Override
    public JFSizedStack addChilds(JFComponent... children) {
        stack.addChilds(children);
        return this;
    }

}
