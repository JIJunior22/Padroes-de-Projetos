package AbstractFactory.ex01;

public class PMWidgetFactory extends WidgetFactory {
    @Override
    public Scrollbar createScrollbar() {
        return new PMScrollbar();
    }

    @Override
    public Window createWindow() {
        return new PMWindow();
    }
}
