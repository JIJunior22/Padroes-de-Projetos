package AbstractFactory.ex01;

public class MotifWidgetFactory extends WidgetFactory{
    @Override
    public Scrollbar createScrollbar() {
        return new MotifScrollbar();
    }

    @Override
    public Window createWindow() {
        return new MotifWindow();
    }
}
